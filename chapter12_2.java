import java.util.*;

public class chapter12_2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int days[] = {31,29,31,30,31,30,31,31,30,31,30,31};
        
        int input = sc.nextInt();
        if (input <= 12 && input > 0)
        {
            System.out.print(days[input]+"일 까지 있습니다.");
        }
        else{
            System.out.print("정확한 월을 입력해주세요");
        }
    }  
}
