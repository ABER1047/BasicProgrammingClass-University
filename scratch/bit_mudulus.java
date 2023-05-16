import java.util.*;

public class bit_mudulus
{
    public static void main(String[] args)
    {
    byte x = (byte) 0x00, y = (byte) 0xFF; //0x는 16비트를 의미하며, 123456789,abcdef까지 입력 가능 (1칸당 숫자 15까지 표현 가능)
    
    //^ = XOR / ~ = not (현재 비트를 반대로 0 -> 1로 반대로 1 -> 0으로) / 나머지 연산지 = &, |
    byte z = (byte) (x | y);
    System.out.println("value : "+(Byte.toUnsignedInt(z))+" / "+(x | y)); //Byte.toUnsignedInt()를 통해 정상적인 값 출력 = 255 / 사용하지 않을시 -1 출력
    
    
    //shift 연산자 a >> b
    int a = 128;
    System.out.println("x >> 2 : "+Integer.toBinaryString(a)+" / "+Integer.toBinaryString(a >> 2));//Integer.toBinaryString()을 통해 a값을 바이트값으로 변환
    //a의 왼쪽 맨 끝 값을 오른쪽으로 2칸 이동 (이때 시스템상, 변수가 이동한 흔적을 남김 = 100 -> 111, >>>를 사용하면 지나간 자리에 0으로 초기화 된 값이 저장됨)
    
    }
}
