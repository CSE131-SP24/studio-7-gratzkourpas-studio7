package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
private int length; 
private int width; 
private int area; 
private int perimeter; 
private boolean isSquare = false; 

public Rectangle(int length, int width) {
area = length*width; 
perimeter = 2*length*width; 
area = length*width; 
this.length = length; 
this.width = width; 
if (length==width)	{
	isSquare = true; 
}
StdDraw.filledRectangle(0.5, 0.5, length, width);
}
public int getArea(int length, int width)	{
System.out.println(this.area);
return this.area;

}	
public int getPerimeter(int length, int width)	{
	System.out.println(this.perimeter);
	return this.perimeter; 
	
}
public boolean isSquare(int length, int width)	{
	System.out.println(this.isSquare);
	return this.isSquare;
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	StdDraw.setPenColor(0,0,0); 
	Rectangle r = new Rectangle(1, 1);
	
}
}