import java.util.*;


public class chapter11_3 
{
    public static void main(String[] args)
    {
        int vector_1[] = new int[3];
        int vector_2[] = new int[3];

        Scanner sc = new Scanner(System.in);
        
        
        int i = 0;
        for(i = 0; i < vector_1.length; i++)
        {
            vector_1[i] = sc.nextInt();
        }
        
        for(i = 0; i < vector_2.length; i++)
        {
            vector_2[i] = sc.nextInt();
        }
        
        int sum[] = new int[3];
        int multi[] = new int[3];
        for(i = 0; i < vector_2.length; i++)
        {
            sum[i] += vector_1[i]+vector_2[i];
            multi[i] += vector_1[i]*vector_2[i];
        }

        System.out.print("벡터의 합 : ("+sum[0]+", "+sum[1]+", "+sum[2]+")\n");
        
        System.out.print("벡터의 내적 : ("+(multi[0]+multi[1]+multi[2])+")");
    }
}
