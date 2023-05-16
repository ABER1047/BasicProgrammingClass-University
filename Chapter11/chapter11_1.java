import java.util.*;


public class chapter11_1 
{
    public static void main(String[] args)
    {  
        int array_value[] = new int[10];
        Random rand = new Random();
        
        
        for(int i = 0; i < array_value.length; i++)
        {
            array_value[i] = rand.nextInt(100)+1;
            System.out.print(array_value[i]+" ");
        }
        
        System.out.println();
        
        for(int i = 0; i < 10; i++)
        {
            array_value[i] = rand.nextInt(200)-99;
            System.out.print(array_value[i]+" ");
        }
    }    
}
