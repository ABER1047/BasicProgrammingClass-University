import java.util.*;
import java.lang.*;

public class chapter3_1 
{
    public static void main(String[] args)
    {
    System.out.println("연산을 선택해주세요 (+, -, /, *)");
    
    Scanner sc = new Scanner(System.in);
    char str = sc.next().charAt(0);
    

        if (str == 'Q')
        {
        System.out.print("프로그램을 종료합니다.");
        }
        else if (str != '+' && str != '-' && str != '*' && str != '/')
        {
        System.out.print("정확한 부호을 입력해주세요");
        }
        else
        {
        System.out.println("두 수를 입력해주세요");
        int num[] = new int[2], ans = -4;
            for(int i = 0; i < 2; i++)
            {
            num[i] = sc.nextInt();
            }
            
            if (str == '+')
            {
            ans = num[0]+num[1];
            }
            else if (str == '-')
            {
            ans = num[0]-num[1];
            }
            else if (str == '*')
            {
            ans = num[0]*num[1];
            }
            else if (str == '/')
            {
            ans = num[0]/num[1];
            }
        
        System.out.print(ans);
        }
    }
}
