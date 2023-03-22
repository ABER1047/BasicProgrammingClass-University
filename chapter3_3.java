import java.util.*;

public class chapter3_3
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    
    String mes[] = {"시 : ","분 : ","초 : "};
    
    int input[] = new int[3];
    
        for(int i = 0; i < 3; i++)
        {
        System.out.print(mes[i]);
        input[i] = sc.nextInt();
        }
        
    System.out.print(input[0]+"시간 "+input[1]+"분"+input[2]+" : "+(input[0]*3600+input[1]*60+input[2]));
    }    
}
