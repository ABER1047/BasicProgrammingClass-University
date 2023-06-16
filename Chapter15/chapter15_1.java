import java.util.*;

public class chapter15_1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("문자열 입력 : ");

        String str = sc.nextLine();
        
        //char str_to_char[] = str.toCharArray();
        //이걸로, str을 char의 배열 형태로 변환 가능

        
        int total_words = 0, check_word_start = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if (Character.isLetter(str.charAt(i)))
            {
                if (check_word_start == 0)
                {
                    total_words++;
                    check_word_start = 1;
                }
            }
            else
            {
                check_word_start = 0;
            }
        }
        
        System.out.println("총 단어 수 : "+total_words);
    }   
}
