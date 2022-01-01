package game.company;
// Guessing game
import java.util.Random;
import java.util.Scanner;

class game {
    public int number  ; //game random number
    public int inputnumber;// user input
    public int noOfGuesses;// number of guess

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    // take input from user
    void takeUserInput(){
        System.out.println("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();


    }
    //logic for the game
    boolean isCorrectNumber(){
        noOfGuesses++;
        if ( inputnumber == number){
            System.out.printf("yes you guessed it right, it was %d\n You guessed it in %d attempts", number, noOfGuesses);
            return  true;
        }
        else if (inputnumber < number){
            System.out.println("Too Low..");
        }
        else if ( inputnumber > number){
            System.out.println("Too High..");
        }
        return false;
    }
}


public class Main {

    public static void main(String[] args) {

        game g = new game();
        boolean b = false;

        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            //System.out.println(b);
        }




    }
}
