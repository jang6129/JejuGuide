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
	Font desFont = new Font("바탕체", Font.PLAIN, 20);
	
	int imageCoordinate[] = {50, 150, 640, 360};
	int homeCoordinate[] = {1300, 700, 100, 100};
	
	String description[] = {			
			"제주도립미술관은 산중턱에 자리하여 조용하면서도 제주하늘, 한라산과 유채, 억새들이 보기 좋게 어우러진 “제주의 자연”과 함께하는 미술의 열린 공간이다.\n건축 또한 자연의 색을 그대로 느낄 수 있도록 건물의 인위적인 색을 없애고, 자연과 어울려 그 자체에 자연을 담고자 하였다.",
			"1979년에 개장한 200,000m² 규모의 수목원으로\n수많은 동백과 다양한 식물 종을 볼 수 있으며 연중무휴입니다.",
			"천지연은 하늘과 땅이 만나 이루어진 연못이라는 의미를 담고 있는데,\n폭포의 길이 22m, 그 아래 못의 깊이가 20m로, 가히 하늘과 땅이 만나는 연못이라 불린다.",
			"한라산 일대는 천연보호구역으로서 천연기념물 제182호로 지정되어 있고, 1970년 3월 24일에 국립공원으로 지정되었다.\n2007년 6월 27일 유네스코 제31차 세계유산위원회 총회에서 유네스코 세계자연유산으로 등록되었다."
	};
	int descriptionCoordinate[] = {50, 560};
	
}
