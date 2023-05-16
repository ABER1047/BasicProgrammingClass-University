import java.util.*;

public class chapter16_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("문장을 입력하세요 : ");
        String str = sc.nextLine();
        
        System.out.println("찾을 문자열 : ");
        String to_find = sc.nextLine();
        
        System.out.println("바꿀 문자열 : ");
        String to_change = sc.nextLine();
        
        str = str.replace(to_find, to_change);
        System.out.println(str);
    }    
}
