public class Shape
{
    // instance variables
    private String mColor;

    public Shape(String color)
    {                           // - a constructor that sets the color instance value.
        mColor = color;

    }
    public String getColor() // - this method returns the object's color value.
    {
        return mColor;
    }
    public double area() // - this method computes and returns the object's area. It must be overridden in each derived class. For the base Shape class, this method returns 0.0.
    {
        return 0.0;
    }
    public String toString()
    {   // - this method returns the object's description (color, type, measurements, and area) as a String. It must be overridden in each derived class. For the base Shape class, this method returns the string "generic shape".
        return "Generic Shape";
    }
}