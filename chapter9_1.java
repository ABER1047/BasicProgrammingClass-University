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
        else
        {
            int i = 1;
            while(i < xx)
            {
                if (i%3 == 0)
                {
                    System.out.println(i);
                }
                i++;
            }
        }
    }    
}
