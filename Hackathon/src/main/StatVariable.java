package main;

public class StatVariable {
	private static String name = "";
	private static int value = 0;
	private static String description = "No Description Found";
	
	public StatVariable(String name, int initalValue) {
		this.name=name;
		value=initalValue;
	}
	
	public StatVariable(String name, int initalValue, String description) {
		this.name=name;
		value=initalValue;
		this.description = description;
	}
	
	public static void add(int change) {
		value += change;
	}
	
	public static void subtract(int change) {
		value -= change;
	}
	
	public static void setValue(int newValue) {
		value = newValue;
	}
	
	public static void changeDescription(String newDescription) {
		description = newDescription;
	}
	
	public static int getValue() {
		return value;
	}
	
	public static String getName() {
		return name;
	}
	
	public static String getDescription() {
		return description;
	}
}
