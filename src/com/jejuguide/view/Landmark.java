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
				g.drawString("���ֵ����̼���", 50, 95);
				g.setFont(new Font("����ü", Font.PLAIN, 20));
				g.drawString("���ֵ����̼����� �����ο� �ڸ��Ͽ� �����ϸ鼭�� �����ϴ�, �Ѷ��� ��ä, ������� ���� ���� ��췯�� �������� �ڿ����� �Բ��ϴ�", 50, 560);
				g.drawString("�̼��� ���� �����̴�. ���� ���� �ڿ��� ���� �״�� ���� �� �ֵ��� �ǹ��� �������� ���� ���ְ�,", 50, 595);
				g.drawString("�ڿ��� ���� �� ��ü�� �ڿ��� ����� �Ͽ���.", 50, 630);
			} else if (index == 1) {
				g.setFont(new Font("default", Font.BOLD, 50));
				g.drawString("ī�Ḯ����", 50, 95);
				g.setFont(new Font("����ü", Font.PLAIN, 20));
				g.drawString("1979�⿡ ������ 200,000m�� �Ը��� ���������", 50, 560);
				g.drawString("������ ����� �پ��� �Ĺ� ���� �� �� ������ ���߹����Դϴ�.", 50, 595);
			} else if (index == 2) {
				g.setFont(new Font("default", Font.BOLD, 50));
				g.drawString("õ��������", 50, 95);
				g.setFont(new Font("����ü", Font.PLAIN, 20));
				g.drawString("õ������ �ϴð� ���� ���� �̷���� �����̶�� �ǹ̸� ��� �ִµ�,", 50, 560);
				g.drawString("������ ���� 22m, �� �Ʒ� ���� ���̰� 20m��, ���� �ϴð� ���� ������ �����̶� �Ҹ���.", 50, 595);
			} else if (index == 3) {
				g.setFont(new Font("default", Font.BOLD, 50));
				g.drawString("�Ѷ�� ��������", 50, 95);
				g.setFont(new Font("����ü", Font.PLAIN, 20));
				g.drawString("�Ѷ�� �ϴ�� õ����ȣ�������μ� õ����买 ��182ȣ�� �����Ǿ� �ְ�, 1970�� 3�� 24�Ͽ� ������������ �����Ǿ���.", 50, 560);
				g.drawString("2007�� 6�� 27�� ���׽��� ��31�� ������������ȸ ��ȸ���� ���׽��� �����ڿ��������� ��ϵǾ���.", 50, 595);
			} else if (index == 4) {
				g.setFont(new Font("default", Font.BOLD, 50));
				g.drawString("���� �ؼ�����", 50, 95);
				g.setFont(new Font("����ü", Font.PLAIN, 20));
				g.drawString("������ ���� ���޶���� ������ ������ Ǯ����� ���� �ٴٺ��� ���� �͸����ε� ������ �ȴ�.", 50, 560);
				g.drawString("�买 ���� ���������� ���� ���� ���𷡺� ������� ������ �̾�����.", 50, 595);
			} else if (index == 5) {
				g.setFont(new Font("default", Font.BOLD, 50));
				g.drawString("����� ����", 50, 95);
				g.setFont(new Font("����ü", Font.PLAIN, 20));
				g.drawString("����Ͻ����� ������ ���� ��� 31�� �� �ϳ���,", 50, 560);
				g.drawString("���ڸ��θ� �������� ���������� ����� ������ ���İ��� �ﳪ���� ����� �����̴�.", 50, 595);
			} else if (index == 6) {
				g.setFont(new Font("default", Font.BOLD, 50));
				g.drawString("���������", 50, 95);
				g.setFont(new Font("����ü", Font.PLAIN, 20));
				g.drawString("Ŀ�ٶ� ��� ����� ��ȭ���� Ư¡����, ��ȭ�� ������ ������ 129,774m2�̴�. ���̴� 182 m�̴�.", 50, 560);
				g.drawString("���� ����������� ������ ���ѹα����� ���� �Ƹ��ٿ� �ص��̷� ������ ���ֽʰ� �� �ϳ��̴�.", 50, 595);
			} else if (index == 7) {
				g.setFont(new Font("default", Font.BOLD, 50));
				g.drawString("������ Ƽ������", 50, 95);
				g.setFont(new Font("����ü", Font.PLAIN, 20));
				g.drawString("2001�� 9���� ������ ���� ������ �� �ڹ����Դϴ�.", 50, 560);
			} else if (index == 8) {
				g.setFont(new Font("����ü", Font.BOLD, 60));
				g.drawString("�쵵", 50, 95);
				g.setFont(new Font("����ü", Font.PLAIN, 20));
				g.drawString("�쵵(����)�� ���ֵ��� ���� ���� ���ϴ� ������, ����Ư����ġ������ ���ֵ� �������� ū ���̴�.", 50, 560);
				g.drawString("�쵵�� �̸��� ���� ����� �Ұ� ���� �ִ� �� ���ٰ� �ؼ� �ٿ�����.", 50, 595);
			} else if (index == 9) {
				g.setFont(new Font("����", Font.BOLD, 50));
				g.drawString("������ �غ�", 50, 95);
				g.setFont(new Font("����ü", Font.PLAIN, 20));
				g.drawString("���ֵ��� ���ʿ� ��ġ�ϰ� �ִ� ������ '������'��", 50, 560);
				g.drawString("'���� �ӹ���'�� ���� �̸��� ���� �������� ǳ���� �����̴�.", 50, 595);
			}
		}
	}
}
