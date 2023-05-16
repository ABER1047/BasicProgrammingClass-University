import java.util.*;
import java.lang.*;

public class chapter12_4 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char stop = 'n';
        double input[] = new double[30];
        
        int i = 0, ii = 0;
        double m = 0;
        for(; i < input.length && stop == 'n'; i++)
        {
            System.out.print("값 : ");
            input[i] = sc.nextDouble();
            System.out.print("그만? y/n : ");
            stop = sc.next().charAt(0);
            m += input[i];
        }
        m /= i;
        
        double s = 0;
        for(; ii < i; ii++)
        {
            s += Math.pow(input[ii]-m, 2)/i;
        }
        
        System.out.print("m = "+(m)+" / s = "+Math.sqrt(s));
    }
}
