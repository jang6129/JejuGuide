package com.jejuguide.view;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jejuguide.controller.Clicker;

public class Hanra extends JFrame {
	public Hanra(Clicker clicker) {
		HanraPanel hanraPanel = new HanraPanel();
		setContentPane(hanraPanel);
		setTitle("Hanra Guide");
		setSize(1500, 900);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class HanraPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("image/hanra.JPG");
		private Image img = icon.getImage();
		private ImageIcon home = new ImageIcon("image/home.PNG");
		private Image homeImg = home.getImage();
		
		public void paint(Graphics g) {
			g.drawImage(img, 50, 150, 640, 360, this);
			g.drawImage(homeImg, 1300, 700, 100, 100, this);
			g.setFont(new Font("default", Font.BOLD, 50));
			g.drawString("�Ѷ�� ��������", 50, 95);
			g.setFont(new Font("����ü", Font.PLAIN, 20));
			g.drawString("�Ѷ�� �ϴ�� õ����ȣ�������μ� õ����买 ��182ȣ�� �����Ǿ� �ְ�, 1970�� 3�� 24�Ͽ� ������������ �����Ǿ���.", 50, 560);
			g.drawString("2007�� 6�� 27�� ���׽��� ��31�� ������������ȸ ��ȸ���� ���׽��� �����ڿ��������� ��ϵǾ���.", 50, 595);	
		}
	}
}