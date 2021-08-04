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
			g.drawString("천지연폭포", 50, 95);
			g.setFont(new Font("바탕체", Font.PLAIN, 20));
			g.drawString("천지연은 하늘과 땅이 만나 이루어진 연못이라는 의미를 담고 있는데,", 50, 560);
			g.drawString("폭포의 길이 22m, 그 아래 못의 깊이가 20m로, 가히 하늘과 땅이 만나는 연못이라 불린다.", 50, 595);	
		}
	}
}