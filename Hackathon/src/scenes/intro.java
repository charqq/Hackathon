package scenes;
import java.util.*;
import javax.swing.*;

public class intro {
	private String name;
	
	public intro(String name) {
		this.name = name;
	}
	
	public void printWelcome() {
		Scanner s = new Scanner(System.in);
		System.out.println("-----------------------------------------");
		System.out.println("WELCOME TO SADVILLE");
		//INSERT picture
		System.out.println();
		System.out.println("Welcome, " + name + ", to Sadville, the happiest \nplace on earth!"
				+ " Alas, due to an unfortunate \nturn of events "
				+ "we are currently out of a \nmayor to help get you situated!");
		
		//reply
		System.out.println("\n1. How unfortunate..."
				+ "\n2. Oh no!"
				+ "\n3. What can i do to help?");
		System.out.println("(input 1, 2, or 3 below)");
		
		boolean br = false;
		String inp;
		while (br == false) {
			inp = s.next();
			if (inp.contains("one") || inp.contains("1")) {
				System.out.println("Indeed! We're simply at the end of our wits.");
				br = true;
			} else if (inp.contains("two") || inp.contains("2")) {
				System.out.println("Oh noes...");
				br = true;
			} else if (inp.contains("three") || inp.contains("3")) {
				System.out.println("\nSo glad you asked!");
				br = true;
			} else {
				System.out.println("I wouldn't say that if I were you...");
			}
		}
		
		System.out.println("We're rather in need of an interim mayor...");
		System.out.println("So what say you, Neighbor " + name + "?");
		
		System.out.println("\n1. I suppose..."
				+ "\n2. Yes!"
				+ "\n3. OF COURSE!!!");
		
	
		br = false;
		while (br == false) {
			inp = s.next();
			if (inp.contains("one") || inp.contains("1")) {
				System.out.println("Fantabulous.");
				br = true;
			} else if (inp.contains("two") || inp.contains("2")) {
				System.out.println("Awesome!");
				br = true;
			} else if (inp.contains("three") || inp.contains("3")) {
				System.out.println("\nSWoah there...");
				br = true;
			} else {
				System.out.println("I wouldn't say that if I were you...");
			}
		}
		
		System.out.println("Let's begin!");
		
	}
}
