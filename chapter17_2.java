public class chapter17_2
{
    public static void main(String[] args)
    {
        book mybook = new book();
        
        mybook.title = "abc";
        mybook.author = "def";
        
        System.out.print(mybook.title+" / "+mybook.author);
    }
}

class book
{
    public String title, author;
}