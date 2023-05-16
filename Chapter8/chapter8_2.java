import java.util.*;

public class chapter8_2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    
    
        double fuel, dis;
        
        while(true)
        {
            fuel = sc.nextDouble();
            dis = sc.nextDouble();
            
            System.out.print(dis/fuel);
            System.out.println("다시? Y/N");
            
            if (sc.next().charAt(0) == 'N')
            {
            break;
            }
        }
    }
}
