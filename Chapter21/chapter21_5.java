import java.util.*;

public class chapter21_5
{
    public static void main(String[] args)
    {
        String n[] = {"Lee", "Kim", "Kang", "Song"};
        MyWorld p[] = new MyWorld[4];
        
        Scanner sc = new Scanner(System.in);
        String temp;
        
        for(int i = 0; i < n.length; i++)
        {
            p[i] = new MyWorld(n[i]);
            p[i].print();
        }
        
        for(int i = 0; i < n.length; i++)
        {
            System.out.println((p[i].get_name())+"의 베프를 입력하세요 : ");
            temp = sc.next();
            
            for(int ii = 0; ii < n.length; ii++)
            {
                if (temp.equals(n[ii]))
                {
                    p[i].add_score();
                    p[i].set_bestfriend(p[ii]);
                }
            }
        }
    }
}

class MyWorld
{
    private String name;
    private int score;
    private Myworld bf;
    
    public MyWorld()
    {
        this("",null,0);
    }
    
    public MyWorld(String name)
    {
        this(name,null,0);
    }
    
    public MyWorld(String name, MyWorld bf)
    {
        this(name,bf,0);
    }
    
    public MyWorld(String name, MyWorld bf, int score)
    {
        this.name = name;
        this.bf = bf;
        this.score = score;
    }
    
    
    
    
    public void set_name(String name)
    {
        this.name = name;
    }
    
    public void set_bestfriend(MyWorld bf)
    {
        this.bf = bf;
    }
    
    public void set_score(int score)
    {
        this.score = score;
    }
    
    
    public void add_score()
    {
        this.score ++;
    }
    
    
    
    public String get_name()
    {
        return this.name;
    }
    
    public MyWorld get_bestfriend()
    {
        return this.bf;
    }
    
    public int get_score()
    {
        return this.score;
    }
    
    
    public void print()
    {
        System.out.println("======================================");
        
        System.out.println("이름 : "+name);
    
        System.out.println("베프 : "+((bf == null) ? "없음" : bf.get_name()));
        
        System.out.println("인기도 : "+score);
        
        System.out.println("======================================");
    }
}