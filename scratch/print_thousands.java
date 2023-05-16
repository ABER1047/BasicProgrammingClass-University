import java.util.*;

public class print_thousands
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("정수를 입력하세요. : ");
    int input = sc.nextInt();
    

    
    System.out.print("천의 자리 : "+(input/1000));
    System.out.print("백의 자리 : "+((input%1000 - input%100)/100));
    System.out.print("십의 자리 : "+(((input%1000)%100)/10));
    System.out.print("일의 자리 : "+(input%10));
    
    sc.close();
    }
}