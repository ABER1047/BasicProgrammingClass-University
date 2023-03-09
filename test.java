import java.util.Scanner;

public class test 
{
    public static void main(String[] args)
    {
    // TODO Auto-generated method stub
    int x = 0; //모든 변수는 초기화 되어야 출력 가능
    System.out.println(x);
    
    int $FFFFA232 = x = 1; //변수명 스타트부분은 _ or $으로 시작해도 괜찮음.
    System.out.println($FFFFA232);
    System.out.println(x);

    float f = 12.3f; //소수점이 있는 변수값은 double형으로 인식하기에 f를 써서 float형임을 알려줘야함
    System.out.println(f);
    
    Scanner sc = new Scanner(System.in);
    double db = sc.nextDouble(); //sc.next() 는 문자열을 받아옴, double값을 받아오고 싶으면 nextDouble 사용
    //sc = new Scanner(System.in);  //반복된 스캐너 생성
    String s = sc.next();

    sc.close(); //스캐너 사용후 더 이상 사용하지 않을 때, 닫기
    }
}
