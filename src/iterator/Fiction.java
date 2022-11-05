package iterator;

import java.util.Random;

public class Fiction extends Book{
    private Genre genre;

    public Genre getGenre(){
        return this.genre;
    }

    public void setGenre(Genre g){
        this.genre = g;
    }

    public Fiction(){
        this("Murder on the Orient Express", 212, "white", Genre.MYSTERY);
    }

    public Fiction(String title, int numPages, String color, Genre genre){
        super(title, numPages, color);
        this.genre = genre; 
    }

    public boolean isSameGenre(Book b){
        if(b instanceof Fiction)
            return (this.genre == ((Fiction)b).getGenre());
        return false;
    }

    public int randomRating(){
        Random rand = new Random();
        switch(this.genre){
            case FANTASY:
                return rand.nextInt(2) + 2;
            case MYSTERY:
                return rand.nextInt(2) + 3;
            case HUMOR:
                return rand.nextInt(4) + 1;
            default:
                return -1;
        }
    }

    @Override
    public String toString(){
        return super.toString() + "\ngenre\t" + this.genre;
    }    
}
