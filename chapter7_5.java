import java.lang.*;
import java.util.*;

public class chapter7_5
{
    public static void main(String[] args)
    {
        for(int x = 0; x < 3 ; x++)
        {
            for(int y = 0; y <= 2 ; y++)
            {
                System.out.println(x);
            }
            
            System.out.println();		
        }
        
        x=0;
        for( ; ; ) //무한 루프
        {
            if ( x > 10)
            {
                break;
            }
            System.out.print(x + "  ");
            x++;
        }
    }
}
