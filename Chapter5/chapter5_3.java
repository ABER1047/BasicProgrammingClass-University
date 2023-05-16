import java.util.*;
import java.lang.*;

public class chapter5_3
{
    public static void main(String[] args)
    {
    System.out.print("문자 입력 <R,T,C> : ");
    Scanner sc = new Scanner(System.in);
    
    char n_str = sc.next().charAt(0);
        if (n_str == 'R')
        {
        System.out.print("사각형의 가로/세로 입력 : ");
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.print("넓이 : "+(width*height));
        }
        else if (n_str == 'T')
        {
        System.out.print("삼각형의 밑변/높이 입력 : ");
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.print("넓이 : "+(width*height/2));
        }
        else
        {
        System.out.print("원의 반지름 입력 : ");
        double ans = Math.pow(sc.nextDouble(),2)*Math.PI;
        System.out.print("넓이 : "+ans);
        }
    }    
}
