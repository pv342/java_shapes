public class Circle extends Shape
{
    private double mRad;
    private double mArea;

    public Circle(String color, double radius)   // - a constructor that invokes the base constructor (passing the color), then sets the radius instance value.
    {
        super (color);
        mRad = radius;
        area();
    }
    public double area() // - this overriding method computes and returns the Circle object's area value.
    {
        return (Math.PI*(mRad*mRad));
    }
    public String toString() // - this overriding method returns the Circle object's description (color, type, measurements, and area).
    {
        String s = (getColor() + " cicle with a radius of " + mRad + " and area of " + area() );
        return s;
    }

}