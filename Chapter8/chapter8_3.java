import java.util.*;

public class chapter8_3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int i = 1, n = sc.nextInt(), r = sc.nextInt();
        
        double nume = 1, deno = 1;
        
        while(i <= n)
        {
            nume *= i;
            i++;
        }
        
        i = 1;
        while(i <= (n-r))
        {
            deno *= i;
            i++;
        }
        
        System.out.print(nume/deno);
    }
}