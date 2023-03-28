import java.util.*;
import java.lang.*;

public class chapter4_4
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int pos_xx[] = new int[3], comp_i, stop = 0, i = 0;
    int pos_yy[] = new int[3];
    
    double delta_x[] = new double[3];
    double delta_y[] = new double[3];
    
        for(i = 0; i < 3; i++)
        {
        System.out.print((i+1)+"번째 점의 위치 : ");
        pos_xx[i] = sc.nextInt();
        pos_yy[i] = sc.nextInt();
        
        comp_i = (i >= 2) ? 0 : i+1;
            
        delta_x[i] = pos_xx[comp_i] - pos_xx[i];
        delta_y[i] = pos_yy[comp_i] - pos_yy[i];
        
            if (delta_x[i] == 0 && delta_y[i] == 0)
            {
            System.out.print("한 점 위에 2개 이상의 점이 존재");
            stop = 1;
            break;
            }
        }
    
        if (stop == 0)
        {
            Loop2:
            for(i = 0; i < 3; i++)
            {
                for(int ii = 0; ii < 3; ii++)
                {
                    if (delta_y[i]/delta_x[i] == delta_y[ii]/delta_x[ii])
                    {
                    System.out.print("한 직선 위에 3개의 점이 존재");
                    break Loop2;
                    }
                }
            }
        }
    }
}