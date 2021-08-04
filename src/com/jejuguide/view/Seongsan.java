package com.jejuguide.view;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jejuguide.controller.Clicker;

public class Seongsan extends JFrame {
	public Seongsan(Clicker clicker) {
		SeongsanPanel seongsanPanel = new SeongsanPanel();
		setContentPane(seongsanPanel);
		setTitle("Seongsan Guide");
		setSize(1500, 900);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class SeongsanPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("image/seongsan.JPG");
		private Image img = icon.getImage();
		private ImageIcon home = new ImageIcon("image/home.PNG");
		private Image homeImg = home.getImage();
		
		public void paint(Graphics g) {
			g.drawImage(img, 50, 150, 640, 360, this);
			g.drawImage(homeImg, 1300, 700, 100, 100, this);
			g.setFont(new Font("default", Font.BOLD, 50));
			g.drawString("���������", 50, 95);
			g.setFont(new Font("����ü", Font.PLAIN, 20));
			g.drawString("Ŀ�ٶ� ��� ����� ��ȭ���� Ư¡����, ��ȭ�� ������ ������ 129,774m2�̴�. ���̴� 182 m�̴�.", 50, 560);
			g.drawString("���� ����������� ������ ���ѹα����� ���� �Ƹ��ٿ� �ص��̷� ������ ���ֽʰ� �� �ϳ��̴�.", 50, 595);			
		}
	}
}
