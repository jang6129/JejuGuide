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
		}
		System.out.println(X + ", " + Y);
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
