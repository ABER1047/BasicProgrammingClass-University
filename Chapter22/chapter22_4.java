public class chapter22_4 
{
    public static void main(String[] args) 
    { 
        //create first Rectangle_ object 
        Rectangle_ firstRect = new Rectangle_(5, 6); 
        System.out.println("Area of Rectangle 1 : "+firstRect.area()); 
        //create second Rectangle_ object 
        Rectangle_ secondRect = new Rectangle_(); 
        System.out.println("Area of Rectangle 2 : "+secondRect.area()); 
        //create third Rectangle_ object 
        Rectangle_ thirdRect = new Rectangle_(new Point_(3,3), 5, 6); 
        System.out.println("Area of Rectangle 3 : "+thirdRect.area()); 
        // access static field of Rectangle_ class 
        System.out.println("Total Number of Objects : "+ Rectangle_.rectCount); 
    } 
}

class Rectangle_
{
    private int width, height;
    private Point_ p;
    public static int rectCount = 0;
    
    public Rectangle_()
    {
        this(null,0,0);
    }
    
    public Rectangle_(int width)
    {
        this(null,width,0);
    }
    public Rectangle_(int width, int height)
    {
        this(null, width, height);
    }
    
    public Rectangle_(Point_ ins, int width, int height)
    {
        this.p = ins;
        this.width = width;
        this.height = height;
        this.rectCount ++;
    }

    public int area()
    {
        return (width*height);
    }
}

class Point_
{
    private int x, y;
    
    
    public Point_()
    {
        this(0,0);
    }
    
    public Point_(int x)
    {
        this(x,0);
    }
    
    public Point_(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    
    
    public void set_x(int x)
    {
        this.x = x;
    }
    
    public void set_y(int y)
    {
        this.x = y;
    }
    
    
    public int get_x()
    {
        return this.x;
    }
    
    public int get_y()
    {
        return this.y;
    }
}