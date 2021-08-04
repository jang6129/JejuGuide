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
			g.setFont(new Font("����ü", Font.BOLD, 60));
			g.drawString("�쵵", 50, 95);
			g.setFont(new Font("����ü", Font.PLAIN, 20));
			g.drawString("�쵵(����)�� ���ֵ��� ���� ���� ���ϴ� ������, ����Ư����ġ������ ���ֵ� �������� ū ���̴�.", 50, 560);
			g.drawString("�쵵�� �̸��� ���� ����� �Ұ� ���� �ִ� �� ���ٰ� �ؼ� �ٿ�����.", 50, 595);
		}
	}
}