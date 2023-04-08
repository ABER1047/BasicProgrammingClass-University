import java.util.*;

public class chapter8_1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int input_val = 0;
        double sum = 0, num = 0;
        
        while(true)
        {
            input_val = sc.nextInt();
            
            if (input_val >= 0)
            {
                sum += input_val;
                num++;
            }
            else
            {
                break;
            }
        }
        
        System.out.print(sum/num);
    }    
}
