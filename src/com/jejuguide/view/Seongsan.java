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
			g.drawString("성산일출봉", 50, 95);
			g.setFont(new Font("바탕체", Font.PLAIN, 20));
			g.drawString("커다란 사발 모양의 분화구가 특징으로, 분화구 내부의 면적은 129,774m2이다. 높이는 182 m이다.", 50, 560);
			g.drawString("성산 일출봉에서의 일출은 대한민국에서 가장 아름다운 해돋이로 꼽히며 영주십경 중 하나이다.", 50, 595);			
		}
	}
}
