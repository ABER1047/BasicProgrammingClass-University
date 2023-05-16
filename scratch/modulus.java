import java.util.*;

public class modulus 
{
    public static void main(String[] args)
    {
    int x, y;
    int min = 0, max = 100;
    float nume = 19, deno = 10;
    int test_val[] = new int[3], total_val = 0;
    int cal = (int) (nume/deno); //float 값을 int로 변환시키기 위해 (int)와 해당 값을 ()로 묶음 (만약 해당 값이 i와 같은 1개면 굳이 괄호 없어도 괜찮음)
    
    //랜덤 값 부여
    Random random_value = new Random();
    x = random_value.nextInt(1000); //x = 0~1000
    y = (x%(max - min+1))+min;
    
    System.out.println("real x : "+x+" / "+y);
    
    System.out.println("int print test : "+cal); //int 형은 무조건 floor()한 값을 출력
    
    
    //평균값 출력 테스트
    
    //test_val = new int[3]; //배열 사이즈가 3인 test_val array생성
    
    for(int i = 0; i <= 2; i++)
    {
    test_val[i] = 16;//random_value.nextInt(100);
    total_val += test_val[i];
    System.out.println("value"+(i+1)+" : "+test_val[i]);
    }
    System.out.println("average value : "+total_val/30.0); //위에 그냥 "3"이냐, "3.0"이냐에 따라 뒤에 소수점이 floor()화 될 수 있음
    }
}
