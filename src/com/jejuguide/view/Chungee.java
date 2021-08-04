package com.jejuguide.view;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jejuguide.controller.Clicker;

public class Chungee extends JFrame {
	public Chungee(Clicker clicker) {
		ChungeePanel chungeePanel = new ChungeePanel();
		setContentPane(chungeePanel);
		setTitle("Chungee Guide");
		setSize(1500, 900);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class ChungeePanel extends JPanel {
		private ImageIcon icon = new ImageIcon("image/chungee.JPG");
		private Image img = icon.getImage();
		private ImageIcon home = new ImageIcon("image/home.PNG");
		private Image homeImg = home.getImage();
		
		public void paint(Graphics g) {
			g.drawImage(img, 50, 150, 640, 360, this);
			g.drawImage(homeImg, 1300, 700, 100, 100, this);
			g.setFont(new Font("default", Font.BOLD, 50));
			g.drawString("õ��������", 50, 95);
			g.setFont(new Font("����ü", Font.PLAIN, 20));
			g.drawString("õ������ �ϴð� ���� ���� �̷���� �����̶�� �ǹ̸� ��� �ִµ�,", 50, 560);
			g.drawString("������ ���� 22m, �� �Ʒ� ���� ���̰� 20m��, ���� �ϴð� ���� ������ �����̶� �Ҹ���.", 50, 595);	
		}
	}
}