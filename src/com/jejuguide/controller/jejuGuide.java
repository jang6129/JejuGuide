package com.jejuguide.controller;
import com.jejuguide.model.JejuMapModel;
import com.jejuguide.view.Landmark;
import com.jejuguide.view.MainFrame;

public class jejuGuide {
	public static void main(String[] args) {
		// Start Project
		JejuMapModel jejuMapModel = new JejuMapModel();
		Clicker clicker = new Clicker(jejuMapModel);
		MainFrame mainFrame = new MainFrame(clicker);
	}
}
