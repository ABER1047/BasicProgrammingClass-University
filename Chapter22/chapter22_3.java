public class chapter22_3 
{
    public static void main(String[] args)
    {
        Employee_ ins = new Employee_("홍길동", "010-1234-5678", 40000000);
        ins.print();
    }
}

class Employee_
{
    private String name = "", phone_number = "";
    private int income = 0;
    
    
    public Employee_(){}
    
    public Employee_(String name)
    {
        this(name,"",0);
    }
    
    public Employee_(String name, String phone_number)
    {
        this(name,phone_number,0);
    }
    
    public Employee_(String name, String phone_number, int income)
    {
        this.name = name;
        this.phone_number = phone_number;
        this.income = income;
    }
    
    
    
    public void set_name(String name)
    {
        this.name = name;
    }
    
    public void set_phone_number(String phone_number)
    {
        this.phone_number = phone_number;
    }
    
    public void set_income(int income)
    {
        this.income = income;
    }
    
    
    
    public String get_name()
    {
        return this.name;
    }
    
    public String get_phone_number()
    {
        return this.phone_number;
    }
    
    public int get_income()
    {
        return this.income;
    }
    
    
    public void print()
    {
        System.out.print("이름 : "+name+", 전화번호 : "+phone_number+", 연봉 : "+income+"원");
    }
}