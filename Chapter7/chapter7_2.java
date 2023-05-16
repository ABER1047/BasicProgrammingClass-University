import java.util.*;
import java.lang.*;

public class chapter7_2 
{
    public static void main(String[] args)
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
        System.out.print("사용자가 이겼습니다");
        }
        else if (check_lose == random_val_cal)
        {
        System.out.print("사용자가 졌습니다");
        }
        else
        {
        System.out.print("비겼습니다");
        }
    }    
}
