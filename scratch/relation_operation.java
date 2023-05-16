import java.util.*;

public class relation_operation
{
    public static void main(String[] args)
    {
    int x = 0, y = 10;
    
    System.out.println(x < y);
    
    System.out.println(x < y ^ y == 10 ^ x == 0); //다 만족하면 false, 이중에 하나라도 틀리면 true
    
    
    //축약 대입 연산자
    System.out.println(x &= y); // x = x & y랑 같은 의미 (이외에도, >>>=, >>=, !=, %=, ^=, |= 등등이 존재)
    
    
    //증감 연산자
    int a = 0, b = 0, c = 0;
    
    c = ++a + b; //a += 1를 먼저 한다음에 이후 a + b 실행
    c = a++ + b; //a+b를 먼저 한다음에 그 값에 1만큼 더하기
    
    
    //조건 선택 연산자
    a = (c > 0) ? 1 : 0; //a가 c보다 크면 1, 아닌경우 0
    
    //이를 통해 절댓값을 빠르게 구할 수 있음
    Random random_value = new Random();
    a = random_value.nextInt(200)-100;
    System.out.print(a+" / "); 
    a = (a < 0) ? -a : a; //이거 쓸때 보기 불편하다고 뒷부분까지 괄호 쓰면 컴파일에러남
    
    System.out.print(a); 
    
    
    
    //선언 안된 변수 가져다 쓰기
    int undefined_var;
    undefined_var = undefined_var || 0; //undefined_var변수가 선언이 되지 않았을 경우, 0값을 가지고, 아닌경우 기존 선언된 값을 가짐
    }
}
