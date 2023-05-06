import java.util.Scanner;

public class chapter13_3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        
        int array[][] = new int[3][3];
        int xx = 0, yy = 0, turns = 1;
        char stop = 'y';
        
        //처음 정보 출력
        for(int ii = 0; ii < array.length; ii++)
        {
            for(int i = 0; i < array[ii].length; i++)
            {
                System.out.print("x     ");
            }
            System.out.println();
        }


        loop:
        while(stop == 'y')
        {
            if (turns == 1)
            {
                System.out.print("백차례 입니다. 놓을 위치의 행과 열을 입력하세요 : ");
            }
            else
            {
                System.out.print("흑차례 입니다. 놓을 위치의 행과 열을 입력하세요 : ");
            }
            xx = sc.nextInt();
            yy = sc.nextInt();
            
            array[yy][xx] = turns;

            
            //현재 정보 출력
            for(int ii = 0; ii < array.length; ii++)
            {
                for(int i = 0; i < array[ii].length; i++)
                {
                    //default값 (아무도 돌을 놓지 않은 자리의 기본 값)
                    char output_value = 'x';
                        if (array[i][ii] == 1)
                        {
                            output_value = 'o';
                        }
                        
                        if (array[i][ii] == -1)
                        {
                            output_value = '■';
                        }
                    System.out.print(output_value+"     ");
                }
                System.out.println();
            }
            
            //이긴거 체크
            for(int kk = 0; kk < array.length; kk++)
            {
                int check_horizontal = 0;
                int check_vertical = 0;
                int check_cross[] = {0,0};
                for(int k = 0; k < array[kk].length; k++)
                {
                    //가로/세로줄 체크
                    check_horizontal += array[kk][k];
                    check_vertical += array[k][kk];
                    
                    //대각선 체크
                    check_cross[0] += array[k][k];
                    check_cross[1] += array[2-k][k];
                }
                
                //가로줄 혹은 세로줄의 총 합이 -3 혹은 3인경우 둘 중 하나는 승리한거니 해당 부분 체크
                if (check_horizontal == -3 || check_horizontal == 3 || check_vertical == -3 || check_vertical == 3 || check_cross[0] == -3 || check_cross[0] == 3 || check_cross[1] == -3 || check_cross[1] == 3)
                {
                    //둘 중에 누가 이긴건지 체크
                    if (turns == 1)
                    {
                        System.out.println("백 승리. 종료합니다.");
                        break loop;
                    } 
                    else
                    {
                        System.out.println("흑 승리. 종료합니다.");
                        break loop;
                    }
                }
            }
            
            System.out.print("계속 할까요? y/n : ");
            stop = sc.next().charAt(0);
            
            //차례 변경
            turns *= -1;
        }
        
        if (stop == 'n')
        {
            System.out.println("프로그램을 종료합니다.");
        }
    }    
}
