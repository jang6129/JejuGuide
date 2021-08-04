package com.jejuguide.view;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jejuguide.controller.Clicker;

public class Hyupjae extends JFrame {
	public Hyupjae(Clicker clicker) {
		HyupjaePanel hyupjaePanel = new HyupjaePanel();
		setContentPane(hyupjaePanel);
		setTitle("Hyupjae Guide");
		setSize(1500, 900);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class HyupjaePanel extends JPanel {
		private ImageIcon icon = new ImageIcon("image/hyupjae.JPG");
		private Image img = icon.getImage();
		private ImageIcon home = new ImageIcon("image/home.PNG");
		private Image homeImg = home.getImage();
		
		public void paint(Graphics g) {
			g.drawImage(img, 50, 150, 640, 360, this);
			g.drawImage(homeImg, 1300, 700, 100, 100, this);
			g.setFont(new Font("default", Font.BOLD, 50));
			g.drawString("협재 해수욕장", 50, 95);
			g.setFont(new Font("바탕체", Font.PLAIN, 20));
			g.drawString("투명한 물에 에메랄드빛 물감을 서서히 풀어놓은 듯한 바다빛은 보는 것만으로도 힐링이 된다.", 50, 560);
			g.drawString("썰물 때면 조개껍질이 많이 섞인 은모래빛 백사장이 끝없이 이어진다.", 50, 595);		
		}
	}
}