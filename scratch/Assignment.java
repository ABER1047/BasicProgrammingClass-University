public class Assignment
{
    public static void main(String[] args)
    {
    char mes = '한'; //""와 ''는 다름 (""는 문자'열', ''는 문자 )
    System.out.println("설정된 문자 : "+mes);
    
    int test_int = mes;
    String unicode = Integer.toHexString(test_int); //'한'에 대한 유니코드 값
    System.out.println(unicode);
    
    int i = test_int; //유니코드 값
    char c2 = (char) i; //강제 형변환
    System.out.println(c2);
    }
}