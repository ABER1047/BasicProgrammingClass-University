public class chapter21_6 
{
    public static void main(String[] args)
    {
        SMS m1 = new SMS("010-555-2111","010-555-1111","Hi","03:10"), m2 = new SMS("010-555-1111","010-555-2111");
		m2.set_time("03:11");
		m2.set_msg_text("Hm..");
		m1.print();
		System.out.println("============================");
		m2.print();
    }    
}

class SMS
{
    private String sender = "", receiver = "", time = "", mes = "";
    
    public SMS(){}
    
    public SMS(String sender)
    {
        this(sender,"","","");
    }
    
    public SMS(String sender, String receiver)
    {
        this(sender,receiver,"","");
    }
    
    public SMS(String sender, String receiver, String time)
    {
        this(sender,receiver,time,"");
    }
    
    public SMS(String sender, String receiver, String time, String mes)
    {
        this.sender = sender;
        this.receiver = receiver;
        this.time = time;
        this.mes = mes;
    }
    
    
    
    public void set_time(String time)
    {
        this.time = time;
    }
    
    public void set_msg_text(String mes)
    {
        this.mes = mes;
    }
    
    public void print()
    {
        System.out.println("송신자 : "+sender);
        System.out.println("시각 : "+time);
        System.out.println("메시지 : "+mes);
    }
}