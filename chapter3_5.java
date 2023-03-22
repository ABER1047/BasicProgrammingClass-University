import java.util.*;
import java.lang.*;

public class chapter3_5
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    
    String mes[] = {"a : ","b : ","c : "};
    
    double input[] = new double[3];
    
        for(int i = 0; i < 3; i++)
        {
        System.out.print(mes[i]);
        input[i] = sc.nextDouble();
        }
    
    double _cal = Math.sqrt(Math.pow(input[1],2)-4*input[0]*input[2]);
    double deno = (2*input[0]);
    double total1 = (-input[1]-_cal)/deno;
    double total2 = (-input[1]+_cal)/deno;

    System.out.print("근은"+total1+", "+total2);
    }    
}
