package com.jejuguide.view;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jejuguide.controller.Clicker;

public class Saryuknee extends JFrame {
	public Saryuknee(Clicker clicker) {
		SaryukneePanel saryukneePanel = new SaryukneePanel();
		setContentPane(saryukneePanel);
		setTitle("Saryuknee Guide");
		setSize(1500, 900);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class SaryukneePanel extends JPanel {
		private ImageIcon icon = new ImageIcon("image/saryuknee.JPG");
		private Image img = icon.getImage();
		private ImageIcon home = new ImageIcon("image/home.PNG");
		private Image homeImg = home.getImage();
		
		public void paint(Graphics g) {
			g.drawImage(img, 50, 150, 640, 360, this);
			g.drawImage(homeImg, 1300, 700, 100, 100, this);
			g.setFont(new Font("default", Font.BOLD, 50));
			g.drawString("사려니 숲길", 50, 95);
			g.setFont(new Font("바탕체", Font.PLAIN, 20));
			g.drawString("사려니숲길은 제주의 숨은 비경 31곳 중 하나로,", 50, 560);
			g.drawString("비자림로를 시작으로 물찻오름과 사려니 오름을 거쳐가는 삼나무가 우거진 숲길이다.", 50, 595);		
		}
	}
}