import java.util.*;

public class SayHelloTest
{
    public static void main(String[] args)
    {
    System.out.println("이름 입력");
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    sc.close();
    
    System.out.println("안녕하세요! "+name);
    }
}