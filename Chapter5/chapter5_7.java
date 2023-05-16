import java.util.Scanner;
import java.lang.*;

public class chapter5_7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("소득 : ");
        int income = sc.nextInt();
  
        int ans;
        if (income <= 1000)
        {
        ans = (int) (income*0.08);
        }
        else if (income <= 4000)
        {
        ans = (int) (income*0.17);
        }
        else if (income <= 8000)
        {
        ans = (int) (income*0.26);
        }
        else
        {
        ans = (int) (income*0.35);
        }
        System.out.print("소득세 : "+ans);
    }
}
