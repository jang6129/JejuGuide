package com.jejuguide.view;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jejuguide.controller.Clicker;

public class Art extends JFrame {
	public Art(Clicker clicker) {
		ArtPanel artPanel = new ArtPanel();
		setContentPane(artPanel);
		setTitle("Art Guide");
		setSize(1500, 900);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class ArtPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("image/art.JPG");
		private Image img = icon.getImage();
		private ImageIcon home = new ImageIcon("image/home.PNG");
		private Image homeImg = home.getImage();
		
		public void paint(Graphics g) {
			g.drawImage(img, 50, 150, 640, 360, this);
			g.drawImage(homeImg, 1300, 700, 100, 100, this);
			g.setFont(new Font("default", Font.BOLD, 50));
			g.drawString("���ֵ����̼���", 50, 95);
			g.setFont(new Font("����ü", Font.PLAIN, 20));
			g.drawString("���ֵ����̼����� �����ο� �ڸ��Ͽ� �����ϸ鼭�� �����ϴ�, �Ѷ��� ��ä, ������� ���� ���� ��췯�� �������� �ڿ����� �Բ��ϴ� �̼��� ���� �����̴�.", 50, 560);
			g.drawString("���� ���� �ڿ��� ���� �״�� ���� �� �ֵ��� �ǹ��� �������� ���� ���ְ�, �ڿ��� ���� �� ��ü�� �ڿ��� ����� �Ͽ���.", 50, 595);
		}
	}
}