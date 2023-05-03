import java.util.*;

public class chapter12_3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int binary[] = new int[64];
        int position = 0;
        while(true)
        {
            // 2로 나누었을 때 나머지를 배열에 저장
            binary[position] = input%2;
            // 2로 나눈 몫을 저장
            input *= 0.5;

            // 자릿수 변경
            position++;    

            if (input == 0)    
            {
                // 몫이 0이 되면 반복을 끝냄
                break;
            }
        }

        // 배열의 요소를 역순으로 출력
        for (int i = position - 1; i >= 0; i--)
        {
            System.out.print(binary[i]);
        }
    }
}
