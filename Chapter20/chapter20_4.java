import java.util.*;

public class chapter20_4
{
    public static void main(String[] args)
    {
        Point p1 = new Point();
        p1.set_xx(3);
        p1.set_yy(7);
        
        Point p2 = new Point();
        p2.set_xx(4);
        p2.set_yy(8);
        
        
        Rectangle r1 = new Rectangle();
        r1.set_start_point(p1);
        r1.set_width(3);
        r1.set_height(4);
        
        Rectangle r2 = new Rectangle();
        r2.set_start_point(p2);
        r2.set_width(4);
        r2.set_height(5);
        
        if (r1.get_area() > r2.get_area())
        {
            System.out.println("첫 번째 사각형 면적이 더 넓습니다.");
        }
        else
        {
            System.out.println("두 번째 사각형 면적이 더 넓습니다.");
        }

        Rectangle inter = r1.intersect(r2);
        if (inter == null)
        {
            System.out.println("겹치는 영역이 없습니다.");
        }
        else
        {
            System.out.println("(" + inter.get_point().get_xx() + ", " + inter.get_point().get_yy() + ") 에서 너비 " + inter.get_width() + ", 높이 " + inter.get_height() + " 만큼 겹칩니다.");
        }
    }
}

class Point
{
    private int xx, yy;
    
    public void set_xx(int xx)
    {
        this.xx = xx;
    }
    
    public void set_yy(int yy)
    {
        this.yy = yy;
    }
    
    public int get_xx()
    {
        return this.xx;
    }
    
    public int get_yy()
    {
        return this.yy;
    }
}

class Rectangle
{
    private int width, height;
    private Point point;
    public void set_start_point(Point ins)
    {
        this.point = ins;
    }
    
    public void set_width(int width)
    {
        this.width = width;
    }
    
    public void set_height(int height)
    {
        this.height = height;
    }
    
    public int get_width()
    {
        return this.width;
    }
    
    public int get_height()
    {
        return this.height;
    }
    
    public int get_area()
    {
        return this.width*this.height;
    }
    
    public Point get_point()
    {
        return this.point;
    }
    
    
    public Rectangle intersect(Rectangle ins)
    {
        int xx1 = ins.get_point().get_xx(); //큰 값
        int xx2 = this.get_point().get_xx();
        int yy1 = ins.get_point().get_yy(); //큰 값
        int yy2 = this.get_point().get_yy();
        int temp = 0;
        
        
        if (xx1 > xx2)
        {
            xx2 += this.get_width();
        }
        else
        {
            temp = xx1;
            xx1 = xx2;
            xx2 = temp;
            xx2 += ins.get_width();
        }
        
        if (yy1 > yy2)
        {
            yy2 += this.get_height();
        }
        else
        {
            temp = yy1;
            yy1 = yy2;
            yy2 = temp;
            yy2 += ins.get_height();
        }
        
        Point temp_p = new Point();
        temp_p.set_xx(xx1);
        temp_p.set_yy(yy1);
        
        Rectangle new_ins = new Rectangle();
        new_ins.set_start_point(temp_p);
        new_ins.set_width(xx2-xx1);
        new_ins.set_height(yy2-yy1);
        
        return (xx2-xx1 <= 0 || yy2-yy1 <= 0) ? null : new_ins;
    }
}