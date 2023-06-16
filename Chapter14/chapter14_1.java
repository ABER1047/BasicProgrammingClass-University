public class chapter14_1 
{
    public static void main(String[] args)
    {
        int array[][] = {{12,56,32,16,98},{99,56,34,41,3},{65,3,87,78,21}};
        
        int ans[] = new int[8], ii = 0;
        for(int i = 0; i < array.length; i++)
        {
            for(ii = 0; ii < array[0].length; ii++)
            {
                ans[i] += array[i][ii];
            }
            System.out.println(i+"번째 행 합계 : "+ans[i]);
        }
        
        for(int i = 0; i < array[0].length; i++)
        {
            for(ii = 0; ii < array.length; ii++)
            {
                ans[i+3] += array[ii][i];
            }
            System.out.println(i+"번째 열 합계 : "+ans[i+3]);
        }
    }    
}
