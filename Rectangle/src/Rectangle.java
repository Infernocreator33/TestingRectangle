class Rectangle 
{
    double width = 1;
    double height = 1;
    
    public Rectangle()
    {

    }
    public Rectangle(double width, double height)
    {
        double newWidth = width;
        double newHeight = height;
    }
    double getArea()
    {
        double area = width * height;
        return area;
    }
    double getArea(double width, double height)
    {
        double newWidth = width;
        double newHeight = height;
        double area = newHeight * newWidth;
        return area;
    }
    double getPerimeter()
    {
        double perimeter = (width * 2) + (height * 2);
        return perimeter;
    }
    double getPerimeter(double width, double height)
    {
        double newWidth = width;
        double newHeight = height;
        double perimeter = (newWidth * 2) + (newHeight * 2);
        return perimeter;
    }
}
