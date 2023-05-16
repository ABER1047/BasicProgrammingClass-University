import java.util.*;
import java.lang.*;

public class chapter4_3
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    
    char str = sc.next().charAt(0), converted_char;
    
        if (str >= 'A' && str <= 'Z' || str >= 'a' && str <= 'z')
        {
        converted_char = (str >= 'A' && str <= 'Z') ? (char) (str-'A' + 'a') : str;
        
            if (converted_char == 'a' || converted_char == 'e' || converted_char == 'i' || converted_char == 'o' || converted_char == 'u')
            {
            System.out.print("모음입니다");
            }
            else
            {
            System.out.print("자음입니다.");
            }
        }
        else
        {
        System.out.print("영문자를 입력해주세요.");
        }
    }
}