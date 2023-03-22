import java.util.*;

public class chapter3_4
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    
    String mes[] = {"예금액 : ","이율(%) : "};
    
    float input[] = new float[2];
    
        for(int i = 0; i < 2; i++)
        {
        System.out.print(mes[i]);
        input[i] = sc.nextFloat();
        }
    
    float total = input[0]*(1+input[1]/100);
    total = total*(1+input[1]/100);
    System.out.print(total+"원 입니다");
    }    
}
