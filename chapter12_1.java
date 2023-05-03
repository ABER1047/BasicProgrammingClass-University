import java.util.*;


public class chapter12_1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int input[] = new int[10], i = 0;
        for(i = 0; i < input.length; i++)
        {
            input[i] = sc.nextInt();
        }
        
        for(i = 9; i >= 0; i--)
        {
            System.out.print(input[i]+" ");
        }
    }
}
