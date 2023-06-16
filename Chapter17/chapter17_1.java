public class chapter17_1
{
    public static void main(String[] args)
    {
        book mybook = new book();
        
        mybook.set_info("abc", "def");
        
        System.out.print(mybook.get_title()+" / "+mybook.get_author());
    }
}

class book
{
    private String title, author; 
    public void set_info(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
    
    public String get_title()
    {
        return this.title;
    }
    
    public String get_author()
    {
        return this.author;
    }
}