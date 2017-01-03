public class Square extends Shape
{
    private double mSide;
    private String mColor;

    public Square(String color, double side) // - a constructor that invokes the base constructor (passing the color), then sets the radius instance value.
    {
        super (color);
        mSide = side;
        area();
    }
    public double area() // - this overriding method computes and returns the Circle object's area value.
    {
        return mSide * mSide;
    }
    public String toString() // - this overriding method returns the Circle object's description (color, type, measurements, and area).
    {
        String s = ( getColor() + " Square has a side length of " + mSide + " and area of " + area() );
        return s;
    }

}