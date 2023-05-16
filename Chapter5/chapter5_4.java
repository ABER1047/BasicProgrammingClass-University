import java.util.*;

public class chapter5_4 
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    float input_value[] = new float[2];
    System.out.print("키 : ");
    input_value[0] = sc.nextFloat();
    System.out.print("몸무게 : ");
    input_value[1] = sc.nextFloat();
        

        float std = (input_value[0]-100)*0.9f;
        if (input_value[1] > std*1.05)
        {
        System.out.print("과체중");
        }
        else if (input_value[1] < std*0.95)
        {
        System.out.print("저체중");
        }
        else
        {
        System.out.print("표준 체중");
        }
    }    
}
