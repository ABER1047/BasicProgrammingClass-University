import java.util.*;

public class chapter19_3 
{
    static Scanner sc = new Scanner(System.in);
    static TheaterSeats seats = new TheaterSeats();
    public static void main(String[] args)
    {
        int menu;
        seats.set_size(10, 8);
        
        do
        {
            display_menu();
            menu = select_menu();
            switch(menu)
            {
                case 0: //예약 현황 표시
                    display_seats();
                    break;
                
                case 1: //예약 허가
                    reserve_seats();
                    break;
                
                case 2: //예약 취소
                    cancle_seats();
                    break;
                
                case 3: //종료
                    break;
            }
        } while(menu != 3);
    }
    
    public static void display_menu()
    {
        System.out.println("==============================");
        System.out.println("0 : 예약 현황 표시");
        System.out.println("1 : 예약 하기");
        System.out.println("2 : 예약 취소");
        System.out.println("3 : 종료");
        System.out.println("==============================");
    }
    
    public static int select_menu()
    {
        System.out.print("매뉴 ?");
        return sc.nextInt();
    }
    
    public static void display_seats()
    {
        for(int i = 0; i < seats.get_height(); i++)
        {
            for(int ii = 0; ii < seats.get_width(); ii++)
            {
                System.out.print(seats.get_status(i,ii)+" ");
            }
            System.out.println();
        }
    }
    
    public static void reserve_seats()
    {
        System.out.print("행과 열 ? ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        seats.set_status(r, c, 1);
    }
    
    public static void cancle_seats()
    {
        System.out.print("행과 열 ? ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        seats.set_status(r, c, 0);
    }
}

class TheaterSeats
{
    private int seats_array[][] = new int[0][0], width, height;
    
    public void set_size(int width, int height)
    {
        this.width = width;
        this.height = height;
    
        int seat_size[][] = new int[height][width];
        this.seats_array = seat_size;
    }
    
    public int get_width()
    {
        return this.width;
    }
    
    public int get_height()
    {
        return this.height;
    }
    
    public int get_status(int r, int c)
    {
        return this.seats_array[r][c];
    }
    
    public void set_status(int r, int c, int status)
    {
        this.seats_array[r][c] = status;
    }
}

