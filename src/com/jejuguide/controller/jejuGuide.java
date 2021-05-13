package com.jejuguide.controller;
import com.jejuguide.view.MainFrame;

public class jejuGuide {
	public static void main(String[] args) {
		// Start Project
		Clicker clicker = new Clicker();
		MainFrame mainFrame = new MainFrame(clicker);
	}
}
