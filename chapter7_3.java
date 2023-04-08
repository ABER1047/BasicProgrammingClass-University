import java.util.*;
import java.lang.*;

public class chapter7_3 
{
    public static void main(String[] args)
    {
        System.out.print("+,-,/,* 선택 :");
        
        Scanner sc = new Scanner(System.in);
        char text = sc.next().charAt(0);
        
        double num0 = sc.nextDouble();
        double num1 = sc.nextDouble();
       
        
        switch(text)
        {
            case '+':
                System.out.print((num0+num1));
                break;
                
            case '-':
                System.out.print((num0-num1));
                break;
                
            case '/':
                System.out.print((num0/num1));
                break;
                
            case '*':
                System.out.print((num0*num1));
                break;
                
            default :
                System.out.print("정확한 부호를 입력해주세요");
        }
    }
}
