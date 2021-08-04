package com.jejuguide.view;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jejuguide.controller.Clicker;

public class Tea extends JFrame {
	public Tea(Clicker clicker) {
		TeaPanel teaPanel = new TeaPanel();
		setContentPane(teaPanel);
		setTitle("Tea Guide");
		setSize(1500, 900);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class TeaPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("image/tea.JPG");
		private Image img = icon.getImage();
		private ImageIcon home = new ImageIcon("image/home.PNG");
		private Image homeImg = home.getImage();
		
		public void paint(Graphics g) {
			g.drawImage(img, 50, 150, 640, 360, this);
			g.drawImage(homeImg, 1300, 700, 100, 100, this);
			g.setFont(new Font("default", Font.BOLD, 50));
			g.drawString("오설록 티뮤지엄", 50, 95);
			g.setFont(new Font("바탕체", Font.PLAIN, 20));
			g.drawString("2001년 9월에 개관한 국내 최초의 차 박물관입니다.", 50, 560);
		}
	}
}