import java.util.*;

public class problem1
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    short i, ii, N, C = sc.nextShort();
    short[] saved_score;
    double high_scored, total_score;
        
            for(ii = 0; ii < C; ii++)
            {
            N = sc.nextShort();
            total_score = 0;
            high_scored = 0;
            saved_score = new short[N];
                
                for(i = 0; i < N; i++)
                {
                saved_score[i] = sc.nextShort();
                total_score += saved_score[i];
                }
                
                //평균값
                for(i = 0; i < N; i++)
                {
                high_scored += (saved_score[i] > total_score/N) ? 1 : 0;
                }
                
            System.out.printf("%.3f%%", (high_scored/N)*100.0);
            }
    sc.close();
    }
}