import java.util.Scanner;

public class Literal 
{
	public static void main(String[] args) 
    {
    int x = 0; //모든 변수는 초기화 되어야 출력 가능
    System.out.print(x);

    float f = 12.3f; //소수점이 있는 변수값은 double형으로 인식하기에 f를 써서 float형임을 알려줘야함
    System.out.print(f);
    
    Scanner sc = new Scanner(System.in);//System.in이 괄호 안에 들어가야함
    double db = sc.nextDouble(); //sc.next() 는 문자열을 받아옴, double값을 받아오고 싶으면 nextDouble 사용
    //sc = new Scanner(System.in);  //반복된 스캐너 생성
    String s = sc.next();
    sc.close(); //스캐너 사용후 더 이상 사용하지 않을 때, 닫기
	}
}