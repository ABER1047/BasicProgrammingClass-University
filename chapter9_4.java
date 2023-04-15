import java.util.*;
import java.lang.*;

public class chapter9_4 
{
    public static void main(String[] args)
    {
        while(true)
        {
            Random random_val = new Random();
            int random_val_cal = random_val.nextInt(3);
            
            Scanner sc = new Scanner(System.in);
            
            System.out.print("값 입력 (0 - 가위 , 1 - 바위, 2 - 보) : ");
            
            //0 - 가위 , 1 - 바위, 2 - 보
            int user_value = sc.nextInt();
            int check_win = user_value+2;
            check_win -= (check_win > 2) ? 3 : 0;
            
            int check_lose = user_value-2;
            check_lose += (check_lose < 0) ? 3 : 0;
            
            System.out.println("나 : "+user_value+" / COM :"+random_val_cal);
            
            if (check_win == random_val_cal)
            {
                System.out.println("사용자가 이겼습니다 - 계속 할까요 y/n");
            }
            else if (check_lose == random_val_cal)
            {
                System.out.println("사용자가 졌습니다 - 계속 할까요 y/n");
            }
            else
            {
                System.out.println("비겼습니다 - 계속 할까요 y/n");
            }
            
            int keep_doing = sc.next().charAt(0);
            if (keep_doing == 'n')
            {
                System.out.println("종료합니다");
                break;
            }
        }
    }    
}
