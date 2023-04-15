import java.util.*;

public class chapter8_1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int input_val = 0;
        double sum = 0, num = 0;
        
        for(input_val = sc.nextInt(); input_val >= 0; input_val = sc.nextInt())
        {
            sum += input_val;
            num++;
        }
        
        System.out.print(sum/num);
    }    
}
