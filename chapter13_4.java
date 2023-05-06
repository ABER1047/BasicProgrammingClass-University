import java.util.*;

public class chapter13_4 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int array[][] = new int[10][8];
        int xx = 0, yy = 0;
        
        while(true)
        {
            for(int ii = 0; ii < array.length; ii++)
            {
                for(int i = 0; i < array[ii].length; i++)
                {
                    System.out.print(array[ii][i]+"  ");
                }
                System.out.println();
            }
              
            System.out.print("예약할 좌석의 행과 열을 입력하세요 (-1은 종료) : ");
            xx = sc.nextInt();
                if (xx == -1)
                {
                    System.out.print("프로그램 종료");
                    break;
                }
            yy = sc.nextInt();
            
            if (array[xx][yy] != 1)
            {
                array[xx][yy] = 1;
            }
            else
            {
                System.out.println("더 이상 예약할 수 없습니다. 프로그램을 종료합니다.")
            }
        }
    }    
}
