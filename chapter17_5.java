import java.io.*;
import java.util.*;

public class chapter17_5 
{
    public static void main(String[] args)
    {
        dynamic_array arr = new dynamic_array();
		
		arr.append(3);
		int res = arr.append(-2);
        if (res == -1)
        {
            System.out.println("값이 동적 배열에 추가되지 못했습니다.");
        }
        arr.append(4);
		System.out.println("사이즈 : " + arr.get_size());
		arr.append(5);
		arr.append(6);
		System.out.println("용량 : " + arr.get_capacity() + ", 사이즈 : " + arr.get_size());
		arr.shrink();
		System.out.println("용량 : " + arr.get_capacity());
		arr.delete();
        arr.delete();
        arr.shrink();
		System.out.println("용량 : "+arr.get_capacity());
    }    
}

class dynamic_array
{
    private int size, capacity = 3;
    private int array[] = new int[capacity];
    public void set_size(int size)
    {
        this.size = size;
    }
    
    public int get_size()
    {
        return this.size;
    }
    
    public int get_capacity()
    {
        return this.capacity;
    }
    
    public int append(int val)
    {
        if (val > 0)
        {
            if (this.size == this.capacity)
            {
                int new_array[] = new int[array.length*2];
                for(int i = 0; i < this.size; i++)
                {
                    new_array[i] = array[i];
                }
                new_array[this.size] = val;
                array = new_array;
            }
            else
            {
                array[this.size] = val;
            }
            
            this.size ++;
            return this.size;
        }
        else
        {
            return -1;
        }
    }
    
    public int delete()
    {
        if (this.size > 0)
        {
            this.size --;
            return array[this.size];
        }
        else
        {
            return -1;
        }
    }
    
    public int shrink()
    {
        if (this.size < this.capacity/2)
        {
            int new_array[] = new int[array.length/2];
            for(int i = 0; i < array.length/2; i++)
            {
                new_array[i] = array[i];
            }
            array = new_array;
            
            return capacity;
        }
        else
        {
            return -1;
        }
    }
}
