public class chapter21_3 
{
    public static void main(String[] args)
    {
        Movie m[] = new Movie[3];
        m[0] = new Movie("아저씨", "이정범", 9.28);
        m[1] = new Movie("슈퍼배드", "피에르 꼬팽", 8.96);
        m[2] = new Movie();
        m[2].set_name("무적자");
        m[2].set_director("송해성");
        m[2].set_score(6.08);
        
        
        double best_score = 0;
        int best_movie_id = 0; 
        for(int i = 0; i < m.length; i++)
        {
            m[i].print();
            double temp = m[i].get_score();
            
            if (best_score <= temp)
            {
                best_score = temp;
                best_movie_id = i;
            }
        }
        
        System.out.println("가장 평점이 좋은 영화 : "+m[best_movie_id].get_name());
    }    
}


class Movie
{
    private String title = "", director = "";
    private double score = 0;
    
    public Movie(){}
    
    public Movie(String title)
    {
        this(title,"",0);
    }
    
    public Movie(String title, String director)
    {
        this(title, director, 0);
    }
    
    public Movie(String title, String director, double score)
    {
        this.title = title;
        this.director = director;
        this.score = score;
    }
    
    public void set_name(String title)
    {
        this.title = title;
    }
    
    public void set_director(String director)
    {
        this.director = director;
    }
    
    public void set_score(double score)
    {
        this.score = score;
    }
    
    public String get_name()
    {
        return this.title;
    }
    
    public String get_director()
    {
        return this.director;
    }
    
    public double get_score()
    {
        return this.score;
    }
    
    public void print()
    {
        System.out.println("영화제목 : "+this.title);
        System.out.println("감독 : "+this.director);
        System.out.println("평점 : "+this.score);
    }
}