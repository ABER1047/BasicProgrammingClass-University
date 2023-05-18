import java.util.*;

public class chapter17_4 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("첫번째 실수부와 허수부 입력 : ");
        complex ins_1 = new complex();
        ins_1.set_value(sc.nextInt(),sc.nextFloat());
        
        
        System.out.print("두번째 실수부와 허수부 입력 : ");
        complex ins_2 = new complex();
        ins_2.set_value(sc.nextInt(),sc.nextFloat());
        
        
        System.out.println("첫번째 복소수 : "+ins_1.toString());
        System.out.println("두번째 복소수 : "+ins_2.toString());
        
        System.out.println("합 : "+ins_1.plus(ins_2));
        System.out.println("차 : "+ins_1.minus(ins_2));
    }    
}


class complex
{
    private int realvalue;
    private float i;
    
    public void set_value(int realvalue, float i)
    {
        this.realvalue = realvalue;
        this.i = i;
    }
    
    public String toString()
    {
        return (this.realvalue)+" + "+(this.i)+"i";
    }
    
    public String plus(complex obj)
    {
        return (this.realvalue+obj.realvalue) + " + " + (this.i+obj.i) + "i";
    }
    
    public String minus(complex obj)
    {
        return (this.realvalue-obj.realvalue) + " + " + (this.i-obj.i) + "i";
    }
}