import java.util.*;

public class chapter5_1 
{
    public static void main(String[] args)
    {
    System.out.print("3개의 정수 입력 : ");
    Scanner sc = new Scanner(System.in);
    
    int num[] = new int[3], min = -4;
    
    num[0] = sc.nextInt();
    min = num[0];
    num[1] = sc.nextInt();
        if (min > num[1])
        {
        min = num[1];
        }
    num[2] = sc.nextInt();
        if (min > num[2])
        {
        min = num[2];
        }

    System.out.print("최솟값 : "+min);
    }    
}
