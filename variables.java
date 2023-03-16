public class variables 
{
    public static void main(String[] args)
    {
    boolean _1byte = true; //true or false
    byte __1byte = -128; //-128~127 = 2^7
    char letter = 'A'; //2byte
    short _2byte = -32768; //-32768~32767 = 2^15
    int __4byte = -21; 
    long _8byte = -32;
    float ___4byte = 1.0f;
    double ___8byte = 1.0;
    
    int a = 15; //10진수 표기
    int b = 015; //8진수 표기 (10진수로는 1*8^1 + 5*8^0을 의미)
    int c = 0x15; //16진수 표기 (10진수로는 1*16^1 + 5*16^0을 의미
    
    //배열 선언
    int test_val[] = new int[3]; //3은 배열 사이즈, 초기값은 0 (int 말고 string으로 선언시 초기값은 "")
    int test_val2[] = {1,2,3,4,5};
    }
}
