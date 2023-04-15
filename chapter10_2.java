import java.util.*;

public class chapter10_2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        char keep_doing = 'y';
        for(; keep_doing == 'y'; keep_doing = sc.next().charAt(0))
        {
            System.out.print("연료 ? ");
            float fuel = sc.nextFloat();
            System.out.print("이동거리 ? ");
            float dis = sc.nextFloat();
            
            System.out.println("연비 : "+(fuel/dis)+" - 계속? y/n");
        }
    }    
}
