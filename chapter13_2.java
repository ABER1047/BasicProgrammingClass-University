import java.util.Scanner;

public class chapter13_2 
{
    public static void main(String[] args)
    {
        int array[][] = new int[5][3];
        
        Scanner sc = new Scanner(System.in);
        for(int ii = 0; ii < array.length; ii++)
        {
            System.out.print(ii+"행의 할당 값을 입력 : ");
            for(int i = 0; i < array[i].length; i++)
            {
                array[ii][i] = sc.nextInt();
            }
        }
        
        
        for(int ii = 0; ii < array.length; ii++)
        {
            System.out.print(ii+"행 : ");
            for(int i = 0; i < array[i].length; i++)
            {
                System.out.print(" "+array[ii][i]);
            }
            System.out.println();
        }
    }    
}
