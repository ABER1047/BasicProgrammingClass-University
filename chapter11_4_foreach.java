public class chapter11_4_foreach 
{
    public static void main(String[] args)
    {
        int test_array[] = {0,1,2,3,4,5,6,7,8,9};
        

        for(int assigned : test_array)
        {   
            //assigned = 1;
            System.out.print(assigned+" / ");
        }
        
        System.out.println();
        
        for(int i = 0; i < 10; i++)
        {   
            System.out.print(test_array[i]+" / ");
        }
    }    
}
