import java.util.Scanner;
import java.lang.*;

public class chapter5_6 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 입력 (R,T,C) : ");
        char str = sc.next().charAt(0);
        
        switch(str)
        {
            case 'R':
            case 'T':
                System.out.print("밑변 길이, 높이 : ");
                float width = sc.nextFloat();
                float height = sc.nextFloat();
                float cal_ = width*height;
                System.out.print("넓이 : "+(cal_ *= (str == 'R') ? 1 : 0.5));
                break;
            
            
            case 'C':
                System.out.print("반지름 : ");
                double r = sc.nextDouble();
                System.out.print("넓이 : "+(Math.pow(r,2)*Math.PI));
                break;
                
                
            default:
                System.out.println("정확한 문자를 입력해주세요");
        }
    }
}
