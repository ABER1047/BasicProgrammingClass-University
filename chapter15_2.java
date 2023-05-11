import java.util.*;

public class chapter15_2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("문자열을 입력해주세요 : ");
        String str = sc.nextLine();
        int is_palindrome = 1;
        for(int i = 0; i <= (str.length())/2; i++)
        {
            if (str.charAt(i) != str.charAt((str.length()-1)-i))
            {
                is_palindrome = 0;
                break;
            }
        }
        
        System.out.println(is_palindrome == 1 ? "회문 입니다" : "회문이 아닙니다");
    }    
}
