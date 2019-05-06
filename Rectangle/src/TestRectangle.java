import java.util.*;

        
public class TestRectangle 
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        Rectangle rectangle1 = new Rectangle();
        System.out.println("The width is " + rectangle1.width + " the height is " + rectangle1.height + " and the area is " + rectangle1.getArea() + " and the perimeter is " + rectangle1.getPerimeter());
        
        Rectangle rectangle3 = new Rectangle();
        double rec3Width = 4;
        double rec3Height = 40;
        System.out.println("The width is " + rec3Width + " the height is " + rec3Height + " and the area is " + rectangle3.getArea(rec3Width, rec3Height) + " and the perimeter is " + rectangle3.getPerimeter(rec3Width, rec3Height));
        
        Rectangle rectangle4 = new Rectangle();
        double rec4Width = 3.5;
        double rec4Height = 35.9;
        System.out.println("The width is " + rec4Width + " the height is " + rec4Height + " and the area is " + rectangle4.getArea(rec4Width, rec4Height) + " and the perimeter is " + rectangle4.getPerimeter(rec4Width, rec4Height));

        
        Rectangle rectangle2 = new Rectangle();
        System.out.println("Enter in the width of a new rectangle: ");
        double width2 = input.nextDouble();
        System.out.println("Enter in the height of the new rectangle: ");
        double height2 = input.nextDouble();
        System.out.println("The area of this rectangle is " + rectangle2.getArea(width2, height2) + " and the perimeter is " + rectangle2.getPerimeter(width2, height2));
    }
}
