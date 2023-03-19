import java.util.*;

public class problem2
{
    public static void main(String[] args)
    {
    int num[] = new int[3], temp;
    Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++)
        {
        num[i] = sc.nextInt();
        }
    
        for(int i = 0; i < 3; i++)
        {
            if (i > 0 && num[i] < num[i-1])
            {
            temp = num[i];
            num[i] = num[i-1];
            num[i-1] = temp;
            i = 0;
            }
        }
    System.out.print(num[0]+" "+num[1]+" "+num[2]);
    }
}