import java.util.*;
import java.lang.*;

public class problem4
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(), i = N-1, check_num = 0, founded = 0;
    
        for(int repeat = 0; repeat < 1; repeat++)
        {
        i++;
            if (i > 1 || founded == 1)
            {
                for(check_num = 1; check_num < Math.floor(Math.sqrt(i)); check_num++)
                {
                String str = String.valueOf(N);
                    for(int ii = 0; ii < (str.length()-1)/2; ii++)
                    {
                        if (str.charAt(ii) != str.charAt(str.length()-ii))
                        {
                        founded = -1;
                        break;
                        }
                    }
                    System.out.println("founded : "+founded);
                
                    if (i%check_num != 0 && founded == 0)
                    {
                    //소수이면서 팰린드롬 수
                    founded = 1;
                    System.out.println("founded : "+founded);
                    break;
                    }
                }
            repeat = founded;
            }
            else
            {
            i = 2;
            break;
            }
        }
    
    System.out.print(i);
    }    
}