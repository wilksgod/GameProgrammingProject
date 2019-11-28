public class Vector2D  
{
    private double x;
    private double y;

    public Vector2D(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public Vector2D(Vector2D other)
    {
        this.x = other.x;
        this.y = other.y;
    }    
    public double getX()
    {
        return x;
    }
    
    public double getY()
    {
        return y;
    }

    public void setX(double value)
    {
        x = value;
    }
    
    public void setY(double value)
    {
        y = value;
    }

    public void negate()
    {
        x = -x;
        y = -y;
    }

    public double magnitude()
    {
        return Math.sqrt(dot(this, this));
    }

    public void normalize()
    {
        double m = magnitude();
        x /= m;
        y /= m;
    }
       
    public static Vector2D add(Vector2D v1, Vector2D v2)
    {
        return new Vector2D(v1.x + v2.x, v1.y + v2.y);
    }
    
    public static Vector2D substract(Vector2D v1, Vector2D v2)
    {
        return new Vector2D(v1.getX() - v2.getX(), v1.getY() - v2.getY());
    }
    
    public static Vector2D substract(Point2D p1, Point2D p2)
    {
        return new Vector2D(p1.getX() - p2.getX(), p1.getY() - p2.getY());
    }
    
    public static Vector2D multiply(Vector2D v, double value)
    {
        return new Vector2D(v.x*value, v.y*value);
    }
    
    public static double dot(Vector2D v1, Vector2D v2)
    {
        return v1.x * v2.x + v1.y * v2.y;
    }
}
