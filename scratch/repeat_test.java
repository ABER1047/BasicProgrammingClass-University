import java.util.*;

public class repeat_test
{
	public static void main(String[] args)
	{
	int coord[] = new int[2];
	String guide_mes[] = {"x좌표를 입력하시오:","y좌표를 입력하시오:"};
	Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 2; i++)
		{
		System.out.print(guide_mes[i]);
		coord[i] = sc.nextInt();
		}
	int qud_ = (coord[0] < 0) ? (coord[1] > 0) ? 2 : 3 : (coord[1] > 0) ? 1 : 4;
	System.out.print("좌표는"+(qud_)+"사분면 입니다.");
	sc.close();
	}
}