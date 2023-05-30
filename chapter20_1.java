import java.util.*;
import java.lang.*;

public class chapter20_1
{
    public static void main(String[] args)
    {
        Dice ins = new Dice();
        for(int i = 0; i < 10; i++)
        {
            ins.roll();
            System.out.println("주사위의 숫자는 "+ins.getFace()+"입니다.");
        }
    }
}

class Dice
{
    private int value = 0;
    public int getFace()
    {
        return this.value;
    }
    
    public void roll()
    {
        Random rand = new Random();
        this.value = rand.nextInt(6)+1;
    }
}