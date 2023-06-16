import java.util.*;

public class chapter16_1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("문자열 입력 : ");
        String str[] = sc.nextLine().split(" ");
        
        for(int i = str.length-1; i >= 0; i--)
        {
            System.out.print(str[i]+" ");
        }
    }    
}
