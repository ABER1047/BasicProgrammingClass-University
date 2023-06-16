import java.util.*;

public class chapter21_4 
{
    public static void main(String[] args)
    {
        Nation n[] = new Nation[3];
		n[0] = new Nation("대한민국",4977,100032,17074);
        n[1] = new Nation("일본",12728,377835,39731);
        n[2] = new Nation();
		n[2].set_country("중국");
		n[2].set_population(133004);
		n[2].set_area(9596960);
		n[2].set_income(3677);
        
        
        Nation highest_population = n[0];
        Nation highest_income = n[0];
        for(int i = 1; i < 3; i++)
        {
            if (n[i].get_population() > highest_population.get_population())
            {
                highest_population = n[i];
            }
            
            if (n[i].get_income() > highest_income.get_income())
            {
                highest_income = n[i];
            }
        }
        
        
        for(int i = 0; i < 3; i++)
        {
            n[i].print();
        }
        
        System.out.println("=====================================");
        System.out.println("가장 인구가 많은 국가");
        highest_population.print();
        
        
        System.out.println("=====================================");
        System.out.println("가장 국민 소득이 높은 국가");
        highest_income.print();
    }
}

class Nation
{
    private String name = "";
    private int people = 0, area = 0, incomes = 0;
    
    public Nation(){}
    
    public Nation(String name)
    {
        this(name,0,0,0);
    }
    
    public Nation(String name, int people)
    {
        this(name, people, 0, 0);
    }
    
    public Nation(String name, int people, int area)
    {
        this(name, people, area, 0);
    }
    
    public Nation(String name, int people, int area, int incomes)
    {
        this.name = name;
        this.people = people;
        this.area = area;
        this.incomes = incomes;
    }
    
    
    
    public void set_country(String name)
    {
        this.name = name;
    }
    
    public void set_population(int people)
    {
        this.people = people;
    }
    
    public void set_area(int area)
    {
        this.area = area;
    }
    
    public void set_income(int incomes)
    {
        this.incomes = incomes;
    }
    
    
    
    public String get_country()
    {
        return name;
    }
    
    public int get_population()
    {
        return people;
    }
    
    public int get_area()
    {
        return area;
    }
    
    public int get_income()
    {
        return incomes;
    }
    
    
    
    public void print()
    {
        System.out.println("국가 이름 : "+name);
    
        System.out.println("인구 : "+people+"만명");
    
        System.out.println("넓이 : "+area+"km^2");
    
        System.out.println("국민 소득"+incomes+"$");
    }
}
