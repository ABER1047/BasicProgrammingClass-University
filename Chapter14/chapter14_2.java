import java.util.*;

public class chapter14_2 
{
    public static void main(String[] args)
    {
        int array[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < array.length; i++)
        {
            for(int ii = 0; ii < array[i].length; ii++)
            {
                array[i][ii] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < array[0].length; i++)
        {
            for(int ii = 0; ii < array.length; ii++)
            {
                System.out.print(array[ii][i]+" ");
            }
            System.out.println();
        }
    }    
}
