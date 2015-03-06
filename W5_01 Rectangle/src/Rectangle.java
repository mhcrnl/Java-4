import java.awt.Color;


public class Rectangle {
	//private String name;
	private int width;
	private int height;
	private Color color = Color.BLUE;
	private static int counter = 0;
	
	
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		counter++;
	}
	public Rectangle(int side) {
		super();
		this.width = side;
		this.height = side;
		counter++;
	}
	
	public int getArea() {
		return width*height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getCounter() {
		return counter;
	}
}
/*
 * Define a class named Rectangle. This class has fields names width and height. 
 * Create a constructor taking two parameters. Also create a constructor taking 
 * only one parameter and assuming the width and height will be the same (square). 
 * Add a field color of type Color. The default value of color is Color.BLUE. Create 
 * an initialization block to set this. Add an integer field counter. This field 
 * counts how many new objects have been created until now. Set the initial value 
 * at 0 in a static initialization block. Modify the constructors to increase the 
 * counter. Define a method getArea which gives the area of the created Rectangle 
 * objects. Create getters and setters for the fields. Don�t add a setter for the 
 * counter. Create another class called TestRectangle. Test your Rectangle class, 
 * calling all possible combinations of methods.
 */
