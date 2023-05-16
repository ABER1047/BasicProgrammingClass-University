import java.util.Scanner;
import java.lang.*;

public class chapter9_2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int range = 100, num = 0;
        
        for(int i = 1; i <= range; i++)
        {
            for(int ii = 1; ii <= range; ii++)
            {
                for(int iii = 1; iii <= range; iii++)
                {
                    if (Math.pow(iii, 2) == Math.pow(i, 2)+Math.pow(ii, 2))
                    {
                        System.out.println("a = "+i+", b = "+ii+", c = "+iii);
                        num ++;
                    }
                }
            }
        }
        
        System.out.println(num+"개의 삼각형 존재");
    }  
}
