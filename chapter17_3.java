public class chapter17_3 
{
    public static void main(String[] args)
    {
        employee my_emp = new employee();
        
        my_emp.set_employee_info("bob", 32, 360);
        
        System.out.print(my_emp.get_name()+" / "+my_emp.get_age()+" / "+my_emp.get_earning());
    }    
}

class employee
{
    private String name;
    private int age, earning;
    
    public void set_employee_info(String name, int age, int earning)
    {
        this.name = name;
        this.age = age;
        this.earning = earning;
    }   
    
    public String get_name()
    {
        return this.name;
    }
    
    public int get_earning()
    {
        return this.earning;
    }
    
    public int get_age()
    {
        return this.age;
    }
}