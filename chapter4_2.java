import java.util.*;
import java.lang.*;

public class chapter4_2
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    
    char str = sc.next().charAt(0), ans;
    
        if (str >= 'A' && str <= 'Z')
        {
        ans = (char) (str-'A' + 'a');
        System.out.print(ans);
        }
        else if (str >= 'a' && str <= 'z')
        {
        System.out.print("대문자를 입력해주세요.");
        }
    }
}