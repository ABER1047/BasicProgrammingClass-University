public class chapter8_4
{
    public static void main(String[] args)
    {
        int max = 1, i = 3, ii = 0, iii = 0;
        
        while(i >= 0)
        {
            ii = 0;
            iii = i;
            while(ii < max)
            {
                while(iii >= 0)
                {
                    System.out.print(" ");
                    iii--;
                }
                System.out.print('*');
                ii++;
            }
            
            System.out.println();
            max += 2;
            i --;
        }
    }
}
