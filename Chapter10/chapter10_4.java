public class chapter10_4 
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 4; i++)
        {
            for(int ii = 0; ii < 7; ii++)
            {
                if (ii >= 3-i && ii <= 3+i)
                {
                    System.out.print('*');
                }
                else
                {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
