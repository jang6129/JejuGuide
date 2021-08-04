package com.jejuguide.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jejuguide.controller.Clicker;

public class MainFrame extends JFrame {
	public MainFrame(Clicker clicker) {
		addMouseListener(clicker);
		JejuMapPanel jejuMapPanel = new JejuMapPanel();
		setContentPane(jejuMapPanel);
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
			g.fillOval(317, 165, 15, 15); // ����Ư����ġ�����̼���
			g.fillOval(230, 300, 15, 15); // ī�Ḯ����
			g.fillOval(370, 330, 15, 15); // õ��������
			g.fillOval(350, 250, 15, 15); // �Ѷ�걹������
			g.fillOval(140, 215, 15, 15); // �����ؼ�����
			g.fillOval(456, 218, 15, 15); // ����Ͻ���
			g.fillOval(639, 162, 15, 15); // ���������
			g.fillOval(173, 285, 15, 15); // ������Ƽ������
			g.fillOval(651, 128, 15, 15); // �쵵
			g.fillOval(535, 84, 15, 15); // �������غ�
		}
	}
}