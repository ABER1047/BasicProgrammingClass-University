import java.util.Random;

public class chapter21_2 
{
    public static void main(String[] args)
    {
        Box box_array[] = new Box[3];
        int max_box_size = 0, max_box_size_id = 0;
        
        Random rand = new Random();
        for(int i = 0; i < box_array.length; i++)
        {
            box_array[i] = new Box(rand.nextInt(10),rand.nextInt(10),rand.nextInt(10),true);
            
            int volume_of_box = box_array[i].get_volume();
            System.out.println("박스"+i+"의 부피 : "+volume_of_box);
            
            if (max_box_size <= volume_of_box)
            {
                max_box_size = volume_of_box;
                max_box_size_id = i;
            }
        }
        
        System.out.println("박스"+max_box_size_id+"의 부피가 가장 큽니다 : "+max_box_size);
    }    
}

class Box
{
    private double xx_width = 0, yy_width = 0, height = 0;
    private boolean is_empty = true;
    
    public Box(){}
    public Box(int xx_width)
    {
        this(xx_width,0,0, true);
    }
    public Box(int xx_width, int yy_width)
    {
        this(xx_width,yy_width,0, true);
    }
    
    public Box(int xx_width, int yy_width, int height, boolean is_empty)
    {
        this.xx_width = xx_width;
        this.yy_width = yy_width;
        this.height = height;
        this.is_empty = is_empty;
    }
    
    public void set_length(double value)
    {
        this.xx_width = value;
    }
    
    public void set_width(double value)
    {
        this.yy_width = value;
    }
    
    public void set_height(double value)
    {
        this.height = value;
    }
    
    public double get_volume()
    {
        return (this.xx_width*this.yy_width*this.height);
    }
}