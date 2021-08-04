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
			g.drawString("카멜리아힐", 50, 95);
			g.setFont(new Font("바탕체", Font.PLAIN, 20));
			g.drawString("1979년에 개장한 200,000m² 규모의 수목원으로", 50, 560);
			g.drawString("수많은 동백과 다양한 식물 종을 볼 수 있으며 연중무휴입니다.", 50, 595);	
		}
	}
}