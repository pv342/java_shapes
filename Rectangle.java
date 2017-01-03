public class Rectangle extends Shape
{
    private double mWidth;
    private double mLength;

    public Rectangle(String color, double length, double width) // - a constructor that invokes the base constructor (passing the color), then sets the radius instance value.
    {
        super (color);
        mLength = length;
        mWidth = width;
        area();
    }
    public double area() // - this overriding method computes and returns the Circle object's area value.
    {
        return (mWidth*mLength);
    }
    public String toString() // - this overriding method returns the Rectangle object's description (color, type, measurements, and area).
    {
        String s = (getColor() + " rectangle with a length of " + mLength + ", a width of " + mWidth + " and area of " + area() );
        return s;
    }

}