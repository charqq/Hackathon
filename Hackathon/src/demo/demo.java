package demo;


import scenes.*;
import java.util.*;
import javax.swing.*;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey Stranger, what's your name?");
		Scanner s = new Scanner(System.in);
		String name = s.next();
		System.out.println("\nAwesome, " + name + ", lovely name you got. "
				+ "\nLet me just read you a little blurb:\n");
		
		intro intro = new intro(name);
		intro.printWelcome();
	}

}
