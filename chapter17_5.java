import java.io.*;
import java.util.*;

public class chapter17_5 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        my_array array = my_array();
    }    
}

class my_array
{
    private int size;
    private int array[] = new int[3];
    public void set_size(int size)
    {
        this.size = size;
        
    }
}
