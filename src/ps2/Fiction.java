package ps2;

public class Fiction extends Book{
    private Genre genre;

    public Genre getGenre(){
        return this.genre;
    }

    public void setGenre(Genre g){
        this.genre = g;
    }

    public Fiction(){
        super("Murder on the Orient Express", 212, "white");
        this.genre = Genre.MYSTERY;
    }
    
}
