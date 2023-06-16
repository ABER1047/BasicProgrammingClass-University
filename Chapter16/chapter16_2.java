import java.util.*;

public class chapter16_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("이름을 입력하세요 (ex : HONG GIL DONG) : ");
        String str_lower = sc.nextLine().toLowerCase();
        String str[] = str_lower.split(" ");
        
        
        for(int i = 1; i <= str.length; i++)
        {
            if (i == str.length)
            {
                System.out.print(str[0]+" ");
            }
            else
            {
                System.out.print(str[i]+" ");
            }
        }
    }    
}
