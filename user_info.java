import java.util.Scanner;

public class user_info
{
	public static void main(String[] args)
	{
	System.out.print("이름 : ");
	Scanner sc = new Scanner(System.in);
	String name = sc.next();
	
	System.out.print("나이 : ");
	int age = sc.nextInt();

	System.out.print("키 : ");
	float tall = sc.nextFloat();

	System.out.print("몸무게 : ");
	float weight = sc.nextFloat();

	System.out.println(name+", "+age+", "+tall+", "+weight+" / ");
	sc.close();
	}
}