import java.util.*;

public class student_info
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.print("이름 : ");
    String name = sc.next();
    
    System.out.print("생년월일 : ");
    int birthday = sc.nextInt();
    
    System.out.print("학년 : ");
    short grade = sc.nextShort();
    
    System.out.print("토익 성적 : ");
    short toeic_score = sc.nextShort();
    
    System.out.print("평균 학점 : ");
    float averaged_score = sc.nextFloat();
    
    System.out.print(name+", "+birthday+", "+grade+", "+toeic_score+", "+averaged_score);
    }
}