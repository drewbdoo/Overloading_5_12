public class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String title, int pages, int year){
        this.title = title;
        this.pages = pages;
        this.year = year;
    }
    public Book(){};
    public Book(String title){
        this.title=title;
    }
    public Book(int pages){
        this.pages=pages;
    }
    public void setTitle(String x){
        title=x;
    }
    public void setPages(int x){
        pages=x;
    }
    public void setYear(int x){
        year=x;
    }

    public String getTitle(){
        return title;
    }
    public String getPages(){
        return pages + " pages";
    }
    public int getYear(){
        return year;
    }
    public String toString(){
        return getTitle() + ", "+ getPages()+ ", " + getYear();
    }
}
