import java.util.*;

public class chapter11_2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int array_val[] = new int[10];
        int min = 0, max = 0, sum = 0;
        for(int i = 0; i < array_val.length; i++)
        {
            array_val[i] = sc.nextInt();
            sum += array_val[i];
            min = (i == 0) ? array_val[i] : ((min > array_val[i]) ? array_val[i] : min);
            max = (i == 0) ? array_val[i] : ((max < array_val[i]) ? array_val[i] : max);
        }
        
        System.out.print("최대 : "+max+" / 최소 : "+min+" / 합 : "+sum);
    }
}
