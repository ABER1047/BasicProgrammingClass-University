import java.util.*;

public class chapter20_3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        Triangle ins = new Triangle();
        
        System.out.print("밑변 : ");
        ins.set_width(sc.nextInt());
        
        System.out.print("높이 : ");
        ins.set_height(sc.nextInt());
        
        System.out.print("삼각형의 넓이는 "+ins.get_area()+" 입니다.");
    }
}

class Triangle
{
    private int width, height;
    
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
    
    public double get_area()
    {
        return (this.width*this.height*0.5);
    }
}
