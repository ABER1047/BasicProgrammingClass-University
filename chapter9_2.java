import java.util.Scanner;
import java.lang.*;

public class chapter9_2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int range = 100, num = 0, i = 1, ii = 1, iii = 1;
        
        while(i <= range)
        {
            ii = 1;
            while(ii <= range)
            {
                iii = 1;
                while(iii <= range)
                {
                    if (Math.pow(iii, 2) == Math.pow(i, 2)+Math.pow(ii, 2))
                    {
                        System.out.println("a = "+i+", b = "+ii+", c = "+iii);
                        num ++;
                    }
                    iii++;
                }
                ii++;
            }
            i++;
        }
        
        System.out.println(num+"개의 삼각형 존재");
    }  
}
