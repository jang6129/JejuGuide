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
			g.drawString("제주도립미술관", 50, 95);
			g.setFont(new Font("바탕체", Font.PLAIN, 20));
			g.drawString("제주도립미술관은 산중턱에 자리하여 조용하면서도 제주하늘, 한라산과 유채, 억새들이 보기 좋게 어우러진 “제주의 자연”과 함께하는 미술의 열린 공간이다.", 50, 560);
			g.drawString("건축 또한 자연의 색을 그대로 느낄 수 있도록 건물의 인위적인 색을 없애고, 자연과 어울려 그 자체에 자연을 담고자 하였다.", 50, 595);
		}
	}
}