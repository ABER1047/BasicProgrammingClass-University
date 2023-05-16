import java.lang.*;
import java.util.*;

public class chapter7_4
{
    public static void main(String[] args)
    {
        System.out.print("문자 입력 :");
        
        Scanner sc = new Scanner(System.in);
    
        char str = sc.next().charAt(0), converted_char;
    
        if (str >= 'A' && str <= 'Z' || str >= 'a' && str <= 'z')
        {
        converted_char = (str >= 'A' && str <= 'Z') ? (char) (str-'A' + 'a') : str;
        
            switch(converted_char)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                System.out.print("모음입니다");
                break;
                
                default :
                System.out.print("자음입니다.");
                break;
            }
        }
        else
        {
        System.out.print("영문자를 입력해주세요.");
        }
    }
}
