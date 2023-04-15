import java.util.Scanner;
import java.lang.*;

public class chapter9_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int temp1 = 0, temp2 = 1, temp3 = 0;
        
        System.out.print(temp1+" ");
        System.out.print(temp2+" ");
        while(temp3 < 5000)
        {
            temp3 = temp2 + temp1;
            System.out.print(temp3+" ");
            
            temp1 = temp2;
            temp2 = temp3;
        }
    }  
}
