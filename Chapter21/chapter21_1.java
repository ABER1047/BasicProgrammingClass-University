public class chapter21_1 
{
    public static void main(String[] args)
    {
        Plane p1 = new Plane(), p2 = new Plane(1), p3 = new Plane(2,"B-747"), p4 = new Plane(3,"A-330",80);
        p1.set_model("A-380");
        p1.set_passenger(60);
        p2.set_model("B-787");
        p2.set_passenger(120);
        p3.set_passenger(140);
        p1.print();
        p2.print();
        p3.print();
        p4.print();
    }
}

class Plane
{
    private int member = 0, identify_num = 0;
    private String model = "";
    
    public Plane()
    {
        this(0, "", 0);
    }
    
    public Plane(int identify_num)
    {
        //this.identify_num = identify_num;
        this(identify_num, "", 0);
    }
    
    public Plane(int identify_num, String model)
    {
        //this.identify_num = identify_num;
        //this.model = model;
        this(identify_num, model, 0);
    }
    
    public Plane(int identify_num, String model, int member)
    {
        this.identify_num = identify_num;
        this.model = model;
        this.member = member;
    }
    
    public void set_model(String model)
    {
        this.model = model;
    }
    
    public void set_passenger(int member)
    {
        this.member = member;
    }
    
    public void set_identify_num(int identify_num)
    {
        this.identify_num = identify_num;
    }
    
    public int get_passenger()
    {
        return this.member;
    }
    
    public String get_model()
    {
        return this.model;
    }
    
    public int get_identify_num()
    {
        return this.identify_num;
    }
    
    public void print()
    {
        System.out.println("식별 번호 : "+identify_num);
        System.out.println("모델 : "+model);
        System.out.println("승객수 : "+member);
    }
}
