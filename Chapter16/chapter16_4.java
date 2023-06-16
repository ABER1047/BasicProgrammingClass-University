import java.util.*;

public class chapter16_4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        
        int quit = 0;
        char alphabet[] = new char[26];
        for(int i = 97; i <= 122; i++)
        {
            alphabet[i-97] = (char) i;
        }
        
        while(quit == 0)
        {
  
            System.out.println("메뉴 선택 (1. 암호화 / 2. 복호화 / 3. 종료) : ");
            int menu = Integer.parseInt(sc.nextLine());
            
            
            if (menu == 1 || menu == 2)
            {
                System.out.println("문자열 입력 : ");
                char str[] = sc.nextLine().toCharArray();
                for(int i = 0; i < str.length; i++)
                {
                    for(int ii = 0; ii < alphabet.length; ii++)
                    {
                        if (str[i] == alphabet[ii])
                        {
                            int to_convert = (menu == 1) ? ii+4 : ii-4;
                            
                            if (to_convert < 0)
                            {
                                to_convert = alphabet.length+to_convert;
                            }
                            
                            if (to_convert >= alphabet.length)
                            {
                                to_convert = to_convert-alphabet.length;
                            }
                            
                            str[i] = alphabet[to_convert];
                            break;
                        }
                    }
                    
                    System.out.print(str[i]);
                }
                System.out.println();
            }
            else if (menu == 3)
            {
                System.out.println("종료 합니다.");
                quit = 1;
            }
            else
            {
                System.out.println("정확한 메뉴를 선택해주세요.");
            }
        }
    }    
}
