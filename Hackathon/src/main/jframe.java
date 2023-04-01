package main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Insets;
import java.awt.font.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.*;

import java.util.*;

import java.net.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.imageio.*;
import java.awt.Image;


public class jframe {
	private String backgroundFile;
	private String textFile;
	private int input;
	private boolean buttonPressed = false;
	
	public jframe(String bgF, String tF) {
		backgroundFile = bgF;
		textFile = tF;
	}
	
	
	
	public void showFrame() throws IOException{
		//Create the frame and set its size. Remove the default layout so you can directly position objects
				JFrame frame = new JFrame();
				frame.setSize(1000, 750);
				frame.setLayout(null);
				
				String path = backgroundFile; 
				URL url = new URL(path); 
				Image image = ImageIO.read(url).getScaledInstance(600, 600, Image.SCALE_DEFAULT); 
				JLabel background = new JLabel(new ImageIcon(image)); 
				
				//background
	
				background.setBounds(0, 0, 1000, 575);
				
				//the text that displays the problem/request
				JTextArea problem = new JTextArea(textFile);
				// set the margin for all four sides
				problem.setMargin( new Insets(10,10,10,10) );
				problem.setBounds(300, 575, 400, 150);
				//font customizatoin
				Font font = new Font("Verdana", Font.BOLD, 12);
				problem.setFont(new Font("Serif",font.PLAIN,20));
				
				//buttons to choose answers
				JButton RightButton = new JButton();
				RightButton.setBounds(700, 575, 150, 75);
				RightButton.setText("2");
				RightButton.setFont(font);
				RightButton.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						input = 2;
						buttonPressed = true;
					}
				});
				
				JButton LeftButton = new JButton();
				LeftButton.setBounds(150, 575, 150, 75);
				LeftButton.setText("1");
				LeftButton.setFont(font);
				LeftButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						input = 1;
						buttonPressed = true;
					}
				});
				
				
				JButton RightDButton = new JButton();
				RightDButton.setBounds(700, 650, 150, 75);
				RightDButton.setText("4");
				RightDButton.setFont(font);
				RightDButton.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						input = 4;
						buttonPressed = true;
					}
				});
				JButton LeftDButton = new JButton();
				LeftDButton.setBounds(150, 650, 150, 75);
				LeftDButton.setText("3");
				LeftDButton.setFont(font);
				LeftDButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						input = 3;
						buttonPressed = true;
					}
				});
				
				//output variables to console
				
				//Add all components and finalize the JFrame
				frame.add(LeftButton);
				frame.add(RightButton);
				frame.add(RightDButton);
				frame.add(LeftDButton);
				frame.add(problem);
				frame.add(background);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
	}
	
	
	
	public int getInput() {
		return input;
		
	}
	
	public void changeText(String s) {
		textFile = s;
	}
	
	public boolean getPressed() {
		return buttonPressed;
	}
	
	
	
}
