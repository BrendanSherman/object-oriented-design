package ps2;

import java.util.Random;

public class NonFiction extends Book{
    private int call_num;

    public NonFiction(){
        super();
        this.call_num = 005;
    }

    public NonFiction(String title, int numPages, String genre, int call_num){
        super(title, numPages, genre);
        this.call_num = call_num;
    }

    public int getCallNumber(){
        return this.call_num;
    }

    public void setCallNumber(int call_num){
        this.call_num = call_num;
    }

    public boolean hasSameCallNumber(Book b){
        if (b instanceof NonFiction){
            return this.call_num == ((NonFiction)b).call_num;
        }
        return false;
    }

    public int randomRating(){
        Random rand = new Random();
        if(this.call_num <= 333)
            return rand.nextInt(2) + 3;
        else if(this.call_num <= 666)
            return rand.nextInt(2) + 1;
        else if(this.call_num <= 999)
            return rand.nextInt(2) + 2;
        return -1; //Indicates error
    }

    @Override
    public String toString(){
        return super.toString() + "\nnumber\t" + this.call_num;
    }

}
