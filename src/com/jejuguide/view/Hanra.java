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
			g.drawString("한라산 국립공원", 50, 95);
			g.setFont(new Font("바탕체", Font.PLAIN, 20));
			g.drawString("한라산 일대는 천연보호구역으로서 천연기념물 제182호로 지정되어 있고, 1970년 3월 24일에 국립공원으로 지정되었다.", 50, 560);
			g.drawString("2007년 6월 27일 유네스코 제31차 세계유산위원회 총회에서 유네스코 세계자연유산으로 등록되었다.", 50, 595);	
		}
	}
}