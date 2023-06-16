import java.util.*;
import java.lang.*;

public class stars_print 
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 10; i++)
        {
            for(int ii = 0; ii <= 4-Math.abs(i-5); ii++)
            {
                System.out.print("*");
            }
            
            System.out.print(" ");
        }
    }
}
