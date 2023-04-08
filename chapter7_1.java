import java.util.*;
import java.lang.*;

public class chapter7_1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("a, b, c 입력 : ");
    
    double num0 = sc.nextDouble();
    double num1 = sc.nextDouble();
    double num2 = sc.nextDouble();
    
    
    if (num0 != 0)
    {
      double D = Math.pow(num1,2)-4*num0*num2;
      double cal_ = Math.sqrt(D);
      double ans_1 = (-num1+cal_)/(2*num0);
      double ans_2 = (-num1-cal_)/(2*num0);
      
      
      if (D < 0)
      {
        System.out.print("서로 다른 두 허근");
      }
      else
      {
        System.out.print(ans_1+", "+ans_2);
      }
    }
    else
    { 
      if (num1 != 0)
      {
        System.out.print((-num2/num1));
      }
      else
      {
        System.out.print("근 없음");
      }
    } 
  }
}