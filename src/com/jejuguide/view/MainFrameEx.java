package com.jejuguide.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jejuguide.controller.Clicker;

public class MainFrameEx extends JFrame {
	public static void main(String[] args) {
		new MainFrameEx();
	} 
	public MainFrameEx() {
		setTitle("jeju guide");
		setSize(900,900);
		setVisible(true);
		JejuMapPannel jejuMapPannel = new JejuMapPannel();
		setContentPane(jejuMapPannel);
		setVisible(true);
	}
	class JejuMapPannel extends JPanel {
		private ImageIcon icon = new ImageIcon("C:\\Users\\jang6\\Desktop\\a.JPG");
		private Image img = icon.getImage();
		
		public void paintCoponet(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}
}