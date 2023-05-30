import java.util.*;

public class chapter20_2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("전원? (0 - 꺼짐 / 1 - 켜짐) : ");
        if (sc.nextInt() == 1)
        {
            CellPhone ins = new CellPhone();
            System.out.println("모델명 : ");
            ins.set_model(sc.nextLine());
            ins.set_model(sc.nextLine());
            
            System.out.println("제조사 : ");
            ins.set_manufacturer(sc.nextLine());
            
            System.out.println("색상 : ");
            ins.set_color(sc.nextLine());
            
            System.out.println("카메라 장착 여부 (1 - 예 / 0 - 아니요) : ");
            boolean camera = (sc.nextInt() == 1) ? true : false;
            ins.set_camera_included(camera);
            
            System.out.println("/////////////////////////");
            
            System.out.println("모델명 : "+ins.get_model());
            
            System.out.println("제조사 : "+ins.get_manufacturer());
            
            System.out.println("색상 : "+ins.get_color());
            
            System.out.println("카메라 장착 여부 : "+ins.get_camera_included());
        }
        else
        {
            System.out.println("전원이 꺼져있습니다.");
        }
    }    
}

class CellPhone
{
    private boolean camera_included;
    private String model, manufacturer, color;
    
    public String get_camera_included()
    {
        return (camera_included == true) ? "장착" : "미장착";
    }
    
    public String get_model()
    {
        return model;
    }
    
    public String get_manufacturer()
    {
        return manufacturer;
    }
    
    public String get_color()
    {
        return color;
    }


    public void set_camera_included(boolean camera_included)
    {
        this.camera_included = camera_included;
    }
    
    public void set_model(String model)
    {
        this.model = model;
    }
    
    public void set_manufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }
    
    public void set_color(String color)
    {
        this.color = color;
    }
}
