import java.util.*;

public class chapter18_1 
{
    public static void main(String[] args)
    {
        Employee myEmployee = new Employee();
        myEmployee.set_name("홍길동");
        myEmployee.set_age(20);
        myEmployee.set_salary(3000000);
        myEmployee.set_years(1);
        
        System.out.print(myEmployee.get_name()+", "+myEmployee.get_age()+", "+myEmployee.get_salary()+", "+myEmployee.get_years());
    }   
}


class Employee
{
    private int age, salary, years;
    private String name;
    
    public int get_age()
    {
        return this.age;
    }
    
    public int get_salary()
    {
        return this.salary;
    }
    
    public int get_years()
    {
        return this.years;
    }
    
    public String get_name()
    {
        return this.name;
    }
    
    public void set_age(int age)
    {
        this.age = age;
    }
    
    public void set_salary(int salary)
    {
        this.salary = salary;
    }
    
    public void set_years(int years)
    {
        this.years = years;
    }
    
    public void set_name(String name)
    {
        this.name = name;
    }
}