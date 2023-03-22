import java.util.*;

public class chapter3_2
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("평수 : ");
    float input = sc.nextFloat();
    final float val = 3.305785f;
    System.out.print(input+"평은");
    System.out.printf("%.3f",input*val);
    System.out.print("평방미터 입니다.");
    }    
}
