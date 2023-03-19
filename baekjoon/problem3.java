import java.util.*;

public class problem3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[2];
        
        while(true)
        {
            for(int i = 0; i < 2; i++)
            {
            num[i] = sc.nextInt();
            }
            
            if (num[0] > num[1])
            {
            System.out.println("Yes");
            }
            else if (num[0] <= num[1] && num[0] != 0 && num[1] != 0)
            {
            System.out.println("No");
            }
            else
            {
            break;
            }
        }
    }
}