import java.time.LocalDate;
import java.util.*;

public class chapter5_5 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int input_value[] = new int[6];
        System.out.print("생일 : ");
        for(int i = 0; i < 3; i++)
        {
        input_value[i] = sc.nextInt();
        }
        LocalDate n_time = LocalDate.now();
        input_value[3] = n_time.getYear();
        input_value[4] = n_time.getMonthValue();
        input_value[5] = n_time.getDayOfMonth();
        
        System.out.println("현재 날짜 : "+input_value[3]+" "+input_value[4]+" "+input_value[5]);
        
        //System.out.print("현재 날짜 : ");
        //for(int i = 0; i < 3; i++)
        //{
        //input_value[i+3] = sc.nextInt();
        //}
            

    int ans = input_value[3]-input_value[0];
    
        if (input_value[1] < input_value[4])
        {
        ans++;
        }
        else if (input_value[1] == input_value[4])
        {
            if (input_value[2] <= input_value[5])
            {
            ans++;
            }
        }
    System.out.print("현재 나이 : "+ans);
    }   
}
