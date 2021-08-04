package com.jejuguide.model;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;

public class LandmarkModel {
	
	/***********Frame title*****************/
	private String title[] = {
			"Jeju Art Museum Guide",
			"Camellia Hill Guide",
			"Chungee Waterfall Guide",
			"Hanra Mountain Guide",
			"Hyupjae Beach Guide",
			"Saryuknee Forest Guide",
			"Seongsan Guide",
			"Tea Museum Guide",
			"Udo Guide",
			"Walljung Beach Guide"
	};
	
	public String getTitle(int index) {
		return title[index];
	}
	/***************************************/
	
	/*
	 * PANEL SIZE
	 */
	final public int PANEL_SIZE_X = 1500;
	final public int PANEL_SIZE_Y = 900;
	
	
	// {LANDMARK IMAGE
	private String imagePath[] = {
			"image/art.JPG",
			"image/ccamellia.JPG",
			"image/chungee.JPG",
			"image/hanra.JPG",
			"image/hyupjae.JPG",
			"image/saryuknee.JPG",
			"image/seongsan.JPG",
			"image/tea.JPG",
			"image/udo.JPG",
			"image/walljung.JPG"
	};
	
	private Image img[] = new Image[imagePath.length];
	public void setImageIcon() {
		for (int i = 0; i < imagePath.length; i++) {
			img[i] = new ImageIcon(imagePath[i]).getImage();
		}
	}
	
	public Image getImage(int index) {
		return img[index];
	}
	// LANDMARK IMAGE}
	
	private ImageIcon home = new ImageIcon("image/home.PNG");
	private Image homeImg = home.getImage();
	
	public Image getHomeImage() {
		return homeImg;
	}
	
	Font titleFont = new Font("default", Font.BOLD, 50);
	Font desFont = new Font("����ü", Font.PLAIN, 20);
	
	int imageCoordinate[] = {50, 150, 640, 360};
	int homeCoordinate[] = {1300, 700, 100, 100};
	
	String description[] = {			
			"���ֵ����̼����� �����ο� �ڸ��Ͽ� �����ϸ鼭�� �����ϴ�, �Ѷ��� ��ä, ������� ���� ���� ��췯�� �������� �ڿ����� �Բ��ϴ� �̼��� ���� �����̴�.\n���� ���� �ڿ��� ���� �״�� ���� �� �ֵ��� �ǹ��� �������� ���� ���ְ�, �ڿ��� ���� �� ��ü�� �ڿ��� ����� �Ͽ���.",
			"1979�⿡ ������ 200,000m�� �Ը��� ���������\n������ ����� �پ��� �Ĺ� ���� �� �� ������ ���߹����Դϴ�.",
			"õ������ �ϴð� ���� ���� �̷���� �����̶�� �ǹ̸� ��� �ִµ�,\n������ ���� 22m, �� �Ʒ� ���� ���̰� 20m��, ���� �ϴð� ���� ������ �����̶� �Ҹ���.",
			"�Ѷ�� �ϴ�� õ����ȣ�������μ� õ����买 ��182ȣ�� �����Ǿ� �ְ�, 1970�� 3�� 24�Ͽ� ������������ �����Ǿ���.\n2007�� 6�� 27�� ���׽��� ��31�� ������������ȸ ��ȸ���� ���׽��� �����ڿ��������� ��ϵǾ���."
	};
	int descriptionCoordinate[] = {50, 560};
	
}
