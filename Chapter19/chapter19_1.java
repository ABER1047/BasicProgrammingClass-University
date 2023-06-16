import java.util.*;
import java.lang.*;


public class chapter19_1
{
    public static void main(String[] args)
    {
        circle ins_cir = new circle();
        
        
        //= point ins_point = new point();랑 같은 코드
        circle.point ins_point = ins_cir.new point();
        ins_point.set_xx(0);
        ins_point.set_yy(0);
        
        ins_cir.set_center(ins_point);
        ins_cir.set_rad(0);
        
        System.out.print(ins_cir.to_string());
    }
}

class circle
{
    private double rad;
    private point center_pos;
    
 
    public void set_center(point center_pos)
    {
        this.center_pos = center_pos;
    }
    
    public point get_center()
    {
        return this.center_pos;
    }
    
    public void set_rad(double rad)
    {
        this.rad = rad;
    }
    
    public double get_rad()
    {
        return this.rad;
    }
    
    public double get_area()
    {
        return Math.pow(this.rad, 2)*Math.PI;
    }
    
    public String to_string()
    {
        return "반지름 : "+rad+" / 중심 : "+center_pos.get_xx()+", "+center_pos.get_yy();
    }
    
    
    
    
    class point
    {
        private double xx, yy;
        
        public void set_xx(double xx)
        {
            this.xx = xx;
        }
        
        public void set_yy(double yy)
        {
            this.yy = yy;
        }
        
        public double get_xx()
        {
            return this.xx;
        }
        
        public double get_yy()
        {
            return this.yy;
        }
    }
}