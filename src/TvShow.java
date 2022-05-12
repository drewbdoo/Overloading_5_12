public class TvShow {
    private String name;
    private String showName;
    private int episodes;
    private String genre;

    public TvShow(String showName, int episodes, String genre){
        this.showName = showName;
        this.episodes = episodes;
        this.genre = genre;
    }
    public TvShow(){}
    public TvShow(String showName){
        this.showName=showName;
    }

    public TvShow(int episodes){
        this.episodes=episodes;
    }

    public void setName(String x){
        showName=x;
    }
    public void setEpisodes(int x){
        episodes=x;
    }
    public void setGenre(String x){
        genre=x;
    }

    public String getShowName(){
        return showName;
    }
    public int getEpisodes(){
        return episodes;
    }
    public String getGenre(){
        return genre;
    }
    public String toString(){
        return "The name of the show is " + getShowName() + " with " + getEpisodes() + " number of episodes. The genre is " + getGenre();
    }


}
