import javax.print.attribute.standard.MediaSize.NA;

public class chapter21_4 
{
    public static void main(String[] args)
    {
    }
}

class Nation
{
    private String name = "";
    private double people = 0, area = 0, incomes = 0;
    
    public Nation(){}
    
    public Nation(String name)
    {
        this(name,0,0,0);
    }
    
    public Nation(String name, double people)
    {
        this(name, people, 0, 0);
    }
    
    public Nation(String name, double people, double area)
    {
        this(name, people, area, 0);
    }
    
    public Nation(String name, double people, double area, double incomes)
    {
        this.name = name;
        this.people = people;
        this.area = area;
        this.incomes = incomes;
    }
    
    
    
    public void set_name()
    {
        this.name = name;
    }
    
    public void set_population()
    {
        this.people = people;
    }
    
    public void set_area()
    {
        this.area = area;
    }
    
    public void set_income()
    {
        this.incomes = incomes;
    }
    
    
    
    public String get_name()
    {
        return name;
    }
    
    public double get_population()
    {
        return people;
    }
    
    public double get_area()
    {
        return area;
    }
    
    public double get_income()
    {
        return incomes;
    }
}
