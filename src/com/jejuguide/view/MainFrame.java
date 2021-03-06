package com.jejuguide.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jejuguide.controller.Clicker;
import com.jejuguide.model.JejuMapModel;

public class MainFrame extends JFrame {
	JejuMapModel model;
	public MainFrame(Clicker clicker, JejuMapModel model) {
//		this.model = model;
//		addMouseListener(clicker);
//		JejuMapPanel jejuMapPanel = new JejuMapPanel();
//		Container contentPain = getContentPane();
//		
//		contentPain.add(jejuMapPanel, BorderLayout.CENTER);
//		setTitle("Jeju Guide");
//		setSize(797, 512);
//		setVisible(true);
//		setResizable(false);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.model = model;
		JejuMapPanel jejuMapPanel = new JejuMapPanel();
		Container contentPain = getContentPane();
		contentPain.addMouseListener(clicker);
		contentPain.add(jejuMapPanel, BorderLayout.CENTER);
		setTitle("Jeju Guide");
		setSize(797, 512);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class JejuMapPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("image/jejuMap.JPG");
		private Image img = icon.getImage();
		private ImageIcon button = new ImageIcon("image/button.PNG");
		private Image buttonImage = button.getImage();

		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			g.fillOval(model.captionX[0], model.captionY[0], 15, 15); // 제주특별자치도립미술관
			g.fillOval(230, 300, 15, 15); // 카멜리아힐
			g.fillOval(370, 330, 15, 15); // 천지연폭포
			g.fillOval(350, 250, 15, 15); // 한라산국립공원
			g.fillOval(140, 215, 15, 15); // 협재해수욕장
			g.fillOval(456, 218, 15, 15); // 사려니숲길
			g.fillOval(639, 162, 15, 15); // 성산일출봉
			g.fillOval(173, 285, 15, 15); // 오설록티뮤지엄
			g.fillOval(651, 128, 15, 15); // 우도
			g.fillOval(535, 84, 15, 15); // 월정리해변
		}
	}
}