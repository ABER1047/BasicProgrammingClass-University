import java.util.*;
import java.lang.*;

public class chapter14_3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size[][] = new int[2][2];
        
        Random rand = new Random();
        
        for(int i = 0; i < size.length; i++)
        {
            System.out.print((i+1)+"번째 행렬의 크기 : ");
            for(int ii = 0; ii < size[i].length; ii++)
            {
                size[i][ii] = sc.nextInt();
            }
            System.out.println();
        }
        
        int m1 = size[0][0], m2 = size[0][1], n1 = size[1][0], n2 = size[1][1];
        int array_temp1[][] = new int[m1][m2];
        int array_temp2[][] = new int[n1][n2];
        System.out.println("1번째 행렬 : ");
        for(int i = 0; i < array_temp1.length; i++)
        {
            for(int ii = 0; ii < array_temp1[i].length; ii++)
            {
                array_temp1[i][ii] = rand.nextInt(100);
                System.out.print(array_temp1[i][ii]+" ");
            }
            System.out.println();
        }
        
        System.out.println("2번째 행렬 : ");
        for(int i = 0; i < array_temp2.length; i++)
        {
            for(int ii = 0; ii < array_temp2[i].length; ii++)
            {
                array_temp2[i][ii] = rand.nextInt(100);
                System.out.print(array_temp2[i][ii]+" ");
            }
            System.out.println();
        }
        
        // 두 행렬의 곱을 계산
        if (size[0][0] != size[1][1]) 
        {
            System.out.println("두 행렬의 곱을 계산할 수 없습니다.");
        }
        else
        {
            int[][] result = new int[m1][n2];
            for (int i = 0; i < m1; i++) 
            {
                for (int j = 0; j < n2; j++) 
                {
                    for (int k = 0; k < n1; k++) 
                    {
                        result[i][j] += array_temp1[i][k] * array_temp2[k][j];
                    }
                }
            }

            // 결과 행렬을 출력
            System.out.println("두 행렬의 곱:");
            for (int i = 0; i < m1; i++) 
            {
                for (int j = 0; j < n2; j++) 
                {
                    System.out.print(result[i][j]+" ");
                }
                System.out.println();
            }
        }    
    }
}