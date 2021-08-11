package com.jejuguide.view;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jejuguide.controller.Clicker;
import com.jejuguide.model.LandmarkModel;

public class Landmark extends JFrame {
	public Landmark(int index) {
		LandmarkModel landmarkModel = new LandmarkModel();
		LandmarkPanel landmarkPanel = new LandmarkPanel(landmarkModel, index);
		setContentPane(landmarkPanel);
		setTitle(landmarkModel.getTitle(index));
		setSize(landmarkModel.PANEL_SIZE_X, landmarkModel.PANEL_SIZE_Y);
		setVisible(true);
		setResizable(false);
	}

	class LandmarkPanel extends JPanel {
		private LandmarkModel landmarkModel;
		private int index;

		public LandmarkPanel(LandmarkModel landmarkModel, int index) {
			this.landmarkModel = landmarkModel;
			this.landmarkModel.setImageIcon();
			this.index = index;
		}

		public void paint(Graphics g) {
			g.drawImage(landmarkModel.getImage(index), 50, 150, 640, 360, this);
			if (index == 0) {
				g.setFont(new Font("default", Font.BOLD, 50));
				g.drawString("제주도립미술관", 50, 95);
				g.setFont(new Font("바탕체", Font.PLAIN, 20));
				g.drawString("제주도립미술관은 산중턱에 자리하여 조용하면서도 제주하늘, 한라산과 유채, 억새들이 보기 좋게 어우러진 “제주의 자연”과 함께하는", 50, 560);
				g.drawString("미술의 열린 공간이다. 건축 또한 자연의 색을 그대로 느낄 수 있도록 건물의 인위적인 색을 없애고,", 50, 595);
				g.drawString("자연과 어울려 그 자체에 자연을 담고자 하였다.", 50, 630);
			} else if (index == 1) {
				g.setFont(new Font("default", Font.BOLD, 50));
				g.drawString("카멜리아힐", 50, 95);
				g.setFont(new Font("바탕체", Font.PLAIN, 20));
				g.drawString("1979년에 개장한 200,000m² 규모의 수목원으로", 50, 560);
				g.drawString("수많은 동백과 다양한 식물 종을 볼 수 있으며 연중무휴입니다.", 50, 595);
			} else if (index == 2) {
				g.setFont(new Font("default", Font.BOLD, 50));
				g.drawString("천지연폭포", 50, 95);
				g.setFont(new Font("바탕체", Font.PLAIN, 20));
				g.drawString("천지연은 하늘과 땅이 만나 이루어진 연못이라는 의미를 담고 있는데,", 50, 560);
				g.drawString("폭포의 길이 22m, 그 아래 못의 깊이가 20m로, 가히 하늘과 땅이 만나는 연못이라 불린다.", 50, 595);
			} else if (index == 3) {
				g.setFont(new Font("default", Font.BOLD, 50));
				g.drawString("한라산 국립공원", 50, 95);
				g.setFont(new Font("바탕체", Font.PLAIN, 20));
				g.drawString("한라산 일대는 천연보호구역으로서 천연기념물 제182호로 지정되어 있고, 1970년 3월 24일에 국립공원으로 지정되었다.", 50, 560);
				g.drawString("2007년 6월 27일 유네스코 제31차 세계유산위원회 총회에서 유네스코 세계자연유산으로 등록되었다.", 50, 595);
			} else if (index == 4) {
				g.setFont(new Font("default", Font.BOLD, 50));
				g.drawString("협재 해수욕장", 50, 95);
				g.setFont(new Font("바탕체", Font.PLAIN, 20));
				g.drawString("투명한 물에 에메랄드빛 물감을 서서히 풀어놓은 듯한 바다빛은 보는 것만으로도 힐링이 된다.", 50, 560);
				g.drawString("썰물 때면 조개껍질이 많이 섞인 은모래빛 백사장이 끝없이 이어진다.", 50, 595);
			} else if (index == 5) {
				g.setFont(new Font("default", Font.BOLD, 50));
				g.drawString("사려니 숲길", 50, 95);
				g.setFont(new Font("바탕체", Font.PLAIN, 20));
				g.drawString("사려니숲길은 제주의 숨은 비경 31곳 중 하나로,", 50, 560);
				g.drawString("비자림로를 시작으로 물찻오름과 사려니 오름을 거쳐가는 삼나무가 우거진 숲길이다.", 50, 595);
			} else if (index == 6) {
				g.setFont(new Font("default", Font.BOLD, 50));
				g.drawString("성산일출봉", 50, 95);
				g.setFont(new Font("바탕체", Font.PLAIN, 20));
				g.drawString("커다란 사발 모양의 분화구가 특징으로, 분화구 내부의 면적은 129,774m2이다. 높이는 182 m이다.", 50, 560);
				g.drawString("성산 일출봉에서의 일출은 대한민국에서 가장 아름다운 해돋이로 꼽히며 영주십경 중 하나이다.", 50, 595);
			} else if (index == 7) {
				g.setFont(new Font("default", Font.BOLD, 50));
				g.drawString("오설록 티뮤지엄", 50, 95);
				g.setFont(new Font("바탕체", Font.PLAIN, 20));
				g.drawString("2001년 9월에 개관한 국내 최초의 차 박물관입니다.", 50, 560);
			} else if (index == 8) {
				g.setFont(new Font("바탕체", Font.BOLD, 60));
				g.drawString("우도", 50, 95);
				g.setFont(new Font("바탕체", Font.PLAIN, 20));
				g.drawString("우도(牛島)는 제주도의 동쪽 끝에 접하는 섬으로, 제주특별자치도에서 제주도 다음으로 큰 섬이다.", 50, 560);
				g.drawString("우도란 이름은 섬의 모습이 소가 누워 있는 것 같다고 해서 붙여졌다.", 50, 595);
			} else if (index == 9) {
				g.setFont(new Font("바탕", Font.BOLD, 50));
				g.drawString("월정리 해변", 50, 95);
				g.setFont(new Font("바탕체", Font.PLAIN, 20));
				g.drawString("제주도의 동쪽에 위치하고 있는 마을인 '월정리'는", 50, 560);
				g.drawString("'달이 머문다'는 뜻의 이름을 가진 서정적인 풍경의 마을이다.", 50, 595);
			}
		}
	}
}
