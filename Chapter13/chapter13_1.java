import java.util.*;
import java.lang.*;

public class chapter13_1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int array[] = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        
        int pos = 0, num = 0;
        
        loop:
        while(true)
        {
            System.out.print("입고 i / 출고 o / 재고 s / 종료 q : ");
            char input_char = sc.next().charAt(0);
        
            switch(input_char)
            {
                case 'i':
                    System.out.print("물품 번호와 저장 위치를 입력 : ");
                    num = sc.nextInt();
                    pos = sc.nextInt();
                    array[pos-1] = num;
                    break;
                    
                case 'o':
                    System.out.print("저장 위치를 입력");
                    pos = sc.nextInt();
                    array[pos-1] = -1;
                    break;
                    
                case 's':
                    for(int i = 0; i < array.length; i++)
                    {
                        System.out.println("위치 "+(i+1)+" : "+array[i]);
                    }
                    break;
                    
                case 'q':
                    System.out.println("시스템을 종료합니다.");
                    break loop;
                    
                default:
                    System.out.println("정확한 문자를 입력해주세요.");
                    break;
            }
        }
    }
}
