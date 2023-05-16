import java.util.*;

public class chapter3 
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    
    String mes[] = {"상자의 높이 : ","상자의 길이 : ","상자의 너비 : "};
    
    int input[] = new int[3];
    
        for(int i = 0; i < 3; i++)
        {
        System.out.print(mes[i]);
        input[i] = sc.nextInt();
        }
        
    System.out.print("상자의 체적 : "+input[0]*input[1]*input[2]);
    }    
}
