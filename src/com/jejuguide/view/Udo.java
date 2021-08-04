package com.jejuguide.view;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jejuguide.controller.Clicker;

public class Udo extends JFrame {
	public Udo(Clicker clicker) {
		UdoPanel udoPanel = new UdoPanel();
		setContentPane(udoPanel);
		setTitle("Udo Guide");
		setSize(1500, 900);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class UdoPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("image/udo.JPG");
		private Image img = icon.getImage();
		private ImageIcon home = new ImageIcon("image/home.PNG");
		private Image homeImg = home.getImage();
		
		public void paint(Graphics g) {
			g.drawImage(img, 50, 150, this);
			g.drawImage(homeImg, 1300, 700, 100, 100, this);
			g.setFont(new Font("바탕체", Font.BOLD, 60));
			g.drawString("우도", 50, 95);
			g.setFont(new Font("바탕체", Font.PLAIN, 20));
			g.drawString("우도(牛島)는 제주도의 동쪽 끝에 접하는 섬으로, 제주특별자치도에서 제주도 다음으로 큰 섬이다.", 50, 560);
			g.drawString("우도란 이름은 섬의 모습이 소가 누워 있는 것 같다고 해서 붙여졌다.", 50, 595);
		}
	}
}