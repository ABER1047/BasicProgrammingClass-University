import java.util.*;
import java.lang.*;

public class chapter12_5 
{
    public static void main(String[] args)
    {
        
        Random rand = new Random();
        int most[] = new int[20];
        int i = 0;
        for(; i < most.length; i++)
        {
            most[i] = 0;
        }
        
        int random_value = 0;
        for(i = 0; i < 1000; i++)
        {
            random_value = rand.nextInt(20);
            System.out.println(random_value);
            most[random_value]++;
        }
        
        
        int most_one = most[0], pos = 0;
        for(i = 0; i < most.length; i++)
        {
            System.out.println(i+" : "+most[i]);
            if(most[i] > most_one)
            {
                most_one = most[i];
                pos = i;
            }
        }
        
        System.out.print("가장 많이 나온 수 : "+pos);
    }
}
