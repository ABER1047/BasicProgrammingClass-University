import java.util.Scanner;

public class chapter9_1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int xx = sc.nextInt();
        
        if (xx < 0)
        {
            System.out.print("0이상의 값을 입력해주세요");
        }
        else if (xx < 3)
        {
            System.out.print("3의 배수를 찾을 수 없습니다");
        }
        else
        {
            for(int i = 1; i <= xx; i++)
            {
                if (i%3 == 0)
                {
                    System.out.println(i);
                }
            }
        }
    }    
}
