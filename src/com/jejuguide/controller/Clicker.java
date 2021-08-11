package com.jejuguide.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.jejuguide.model.JejuMapModel;
import com.jejuguide.view.Landmark;

public class Clicker implements MouseListener {
	JejuMapModel jejuMapModel;
	public Clicker(JejuMapModel jeuJejuMapModel) {
		this.jejuMapModel = jeuJejuMapModel;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		double X = e.getX();
		double Y = e.getY();
		if (X >= 317 && X <= 317+15 && Y >= 165 && Y <= 165+15) {
			Landmark landMark = new Landmark(0);
		} else if (X >= 230 && X <= 230+15 && Y >= 300 && Y <= 300+15) {
			Landmark landMark = new Landmark(1);
		} else if (X >= 370 && X <= 370+15 && Y >= 330 && Y <= 330+15) {
			Landmark landMark = new Landmark(2);
		} else if (X >= 350 && X <= 350+15 && Y >= 250 && Y <= 250+15) {
			Landmark landMark = new Landmark(3);
		} else if (X >= 140 && X <= 140+15 && Y >= 215 && Y <= 215+15) {
			Landmark landMark = new Landmark(4);
		} else if (X >= 456 && X <= 456+15 && Y >= 218 && Y <= 218+15) {
			Landmark landMark = new Landmark(5);
		} else if (X >= 639 && X <= 639+15 && Y >= 162 && Y <= 162+15) {
			Landmark landMark = new Landmark(6);
		} else if (X >= 173 && X <= 173+15 && Y >= 285 && Y <= 285+15) {
			Landmark landMark = new Landmark(7);
		} else if (X >= 651 && X <= 651+15 && Y >= 128 && Y <= 128+15) {
			Landmark landMark = new Landmark(8);
		} else if (X >= 535 && X <= 535+15 && Y >= 84 && Y <= 84+15) {
			Landmark landMark = new Landmark(9);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
