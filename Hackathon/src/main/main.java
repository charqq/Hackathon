package main;
import java.awt.event.ActionEvent;
import img.*;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class main {
	
	public static void main(String[]args) throws IOException {
		//Declare Variables and put them into an array
		StatVariable population = new StatVariable("Population", 100);
		StatVariable funds = new StatVariable("Funds", 100);
		StatVariable airQuality = new StatVariable("Air Quality", 50);
		StatVariable waterQuality = new StatVariable("Water Quality", 50);
		StatVariable landQuality = new StatVariable("Land Quality", 50);
		StatVariable infrastructure = new StatVariable("Infrastructure", 100);
		StatVariable[] variables = {population, funds, airQuality, waterQuality, landQuality, infrastructure};
		
		
		String intro = "Welcome to Sadville, the happiest \nplace on earth!"
				+ " Alas, due to an unfortunate \nturn of events "
				+ "we are currently out of a \nmayor to help get you situated!";
		jframe jf = new jframe("https://i.imgur.com/OQtCzSw.jpeg", intro);
		jf.showFrame();
		waitChoice(jf);
		
		
		outputVariables(variables);
	}
	
	
	
	
	
	@SuppressWarnings("static-access")
	public static void outputVariables(StatVariable[] variables) {
		System.out.println();
		System.out.println(variables[0].getValue() + " people");
		System.out.println(variables[1].getValue() + " funds");
		System.out.println(variables[2].getValue() + "% Air Quality");
		System.out.println(variables[3].getValue() + "% Water  Quality");
		System.out.println(variables[4].getValue() + "% Land  Quality");
		System.out.println(variables[5].getValue() + "% infrastructure");
	}
	
	public static int waitChoice(jframe jf) {
		System.out.println("Pick your choice");
		while(jf.getPressed() == false) {
			try {
			       Thread.sleep(200);
			    } catch(InterruptedException e) {
			    }
		}
		
		int temp = jf.getInput();
		System.out.println("Your choice was: " + temp);
		return temp;
	}
}
