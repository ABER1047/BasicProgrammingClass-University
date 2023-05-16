import java.util.Scanner;

import java.util.*;

public class Test1
{
    public static void main(String[] args)
    {
    String s = "abc";
    System.out.println(s);
    
    double d = 12.3;
    int f = (int) d; //double형을 int형으로 저장
    System.out.println(f);
    Scanner sc = new Scanner(System.in);
    double db = sc.nextDouble();
    System.out.println(db);
    s = sc.next();
    System.out.println(s);
    sc.close();
    }
}