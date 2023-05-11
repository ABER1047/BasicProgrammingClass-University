import java.util.*;

public class chapter15_4 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("문자열 입력 : ");

        String str = sc.nextLine();
        
        
        //문자열을 단어별로 분리 (이때, 공백, 콤마, 점 과 같은 특수문자들을 기준으로 분리)
        String str2[] = str.split("( |,|\\.|;|:|'|\")+");
        
        for(int i = 0; i < str2.length; i++)
        {
            int count = 1;
            if (str2[i] != null)
            {
                for(int ii = i+1; ii < str2.length; ii++)
                {
                    //같은 문자열인지 체크 (이때 == 연산자를 사용하면, '같은 객체인지' 체크하는 것 이므로, 이는 잘못됨)
                    if (str2[i].equals(str2[ii]))
                    {
                        count++;
                        str2[ii] = null;
                    }
                }
            
            System.out.println(str2[i]+" : "+(count)+"회");
            }
        }
    }
}
