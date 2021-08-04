package com.jejuguide.view;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jejuguide.controller.Clicker;

public class Camellia extends JFrame {
	public Camellia(Clicker clicker) {
		CamelliaPanel camelliaPanel = new CamelliaPanel();
		setContentPane(camelliaPanel);
		setTitle("Camellia Guide");
		setSize(1500, 900);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class CamelliaPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("image/ccamellia.JPG");
		private Image img = icon.getImage();
		private ImageIcon home = new ImageIcon("image/home.PNG");
		private Image homeImg = home.getImage();
		
		public void paint(Graphics g) {
			g.drawImage(img, 50, 150, 640, 360, this);
			g.drawImage(homeImg, 1300, 700, 100, 100, this);
			g.setFont(new Font("default", Font.BOLD, 50));
			g.drawString("ī�Ḯ����", 50, 95);
			g.setFont(new Font("����ü", Font.PLAIN, 20));
			g.drawString("1979�⿡ ������ 200,000m�� �Ը��� ���������", 50, 560);
			g.drawString("������ ����� �پ��� �Ĺ� ���� �� �� ������ ���߹����Դϴ�.", 50, 595);	
		}
	}
}