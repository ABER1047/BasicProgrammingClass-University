import java.util.*;

public class chapter15_3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();
        
        int found_point = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if (i == 0 || str.charAt(i) == '.')
            {
                found_point = 1;
            }
            
            if (Character.isLetter(str.charAt(i)) && found_point == 1)
            {
                //toUpperCase 대신에, (char) ((str.charAt(i)-'a')+'A') 를 통해서 대문자로 변경 가능.
                str = str.substring(0, i)+Character.toUpperCase(str.charAt(i))+str.substring(i+1);
                found_point = 0;
            }
        }
        
        str = str.substring(0, str.length())+'.';
        
        System.out.println(str);
    }   
}
