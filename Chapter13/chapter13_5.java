import java.util.*;

public class chapter13_5 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int array[][] = new int[100][10];
        
        int pos = 0, num = 0, add_num = 0;
        
        loop:
        while(true)
        {
            System.out.print("입고 i / 출고 o / 재고 s / 종료 q : ");
            char input_char = sc.next().charAt(0);
        
            switch(input_char)
            {
                case 'i':
                    System.out.print("물품 번호 / 저장 위치 / 수량를 입력 : ");
                    num = sc.nextInt();
                    pos = sc.nextInt();
                    add_num = sc.nextInt();
                    array[num][pos-1] += add_num;
                    break;
                    
                case 'o':
                    System.out.print("물품 번호 / 저장 위치 / 수량를 입력 : ");
                    num = sc.nextInt();
                    pos = sc.nextInt();
                    add_num = sc.nextInt();
                    array[num][pos-1] -= add_num;
                    break;
                    
                case 's':
                    for(int i = 0; i < array.length; i++)
                    {
                        for(int ii = 0; ii < array[i].length; ii++)
                        {
                            System.out.println("위치 : "+(ii+1)+" / 물품 번호 : "+i+" / 갯수 : "+array[i][ii]);
                        }
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
