import java.util.*;

public class chapter18_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Television myTelevision = new Television();
        
        
        System.out.print("TV 전원 (1 - 켜짐 / 0 - 꺼짐) : ");
        if (sc.nextInt() == 1)
        {
            myTelevision.turnOn();
        }
        else if (sc.nextInt() == 0)
        {
            myTelevision.turnOff();
        }
        else
        {
            System.out.print("정확한 값을 입력해주세요");
        }
        
        if (myTelevision.isOn())
        {
            System.out.print("볼륨 : ");
            myTelevision.setVolume(sc.nextInt());
            
            System.out.print("채널 : ");
            myTelevision.setChannel(sc.nextInt());
        }
        
        System.out.println(myTelevision.toString(myTelevision));
    }   
}


class Television
{
    private boolean isOn;
    private int volume, channel;
    
    public boolean isOn()
    {
        return this.isOn;
    }
    
    public int getVolume()
    {
        return this.volume;
    }
    
    public int getChannel()
    {
        return this.channel;
    }
    
    public void setChannel(int channel)
    {
        this.channel = channel;
    }
    
    public void setVolume(int volume)
    {
        this.volume = volume;
    }
    
    public void turnOn()
    {
        this.isOn = true;
    }
    
    public void turnOff()
    {
        this.isOn = false;
    }
    
    public String toString(Television ins)
    {
        return "TV 켜짐 : "+ins.isOn()+", 볼륨 : "+ins.getVolume()+", 채널 : "+ins.getChannel();
    }
}