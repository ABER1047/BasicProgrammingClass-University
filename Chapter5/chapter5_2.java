import java.util.*;

public class chapter5_2
{
    public static void main(String[] args)
    {
    System.out.print("구매 갯수 : ");
    Scanner sc = new Scanner(System.in);
    
    int buy = sc.nextInt();
    
        if (buy >= 10)
        {
        System.out.print("금액 : "+(buy*90));
        }
        else
        {
        System.out.print("금액 : "+(buy*100));
        }
    }    
}
