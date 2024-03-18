package codeway;
import java.util.Scanner;
import java.util.Random;
public class task1 {
	public static void main(String[] args) {

        Random random=new Random();
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to number guessing game");

        int score=0;
        boolean playAgain=true;

        while(playAgain){

            int target=random.nextInt(100)+1;
            int attempts=0;
            int maxAttempts=5;

            while (attempts<maxAttempts) {
                System.out.print("Enter your guess no:");
                int userGuessno=sc.nextInt();
                sc.nextLine();
                System.out.println("User guessed no is :"+userGuessno);

                attempts++;


                if(userGuessno==target){
                    System.out.println("Congratulaton you guessed correct number"+target+"in"+attempts+"attempts");
                    score++;
                    break;
                }
                else if(userGuessno<target){
                    System.out.println("Too low! Try again");
                }
                else{
                    System.out.println("Too high!Try again");
                }
            }
            if(attempts>=maxAttempts){
                System.out.println("Sorry you've run out of attempts. The coorect no was "+target+".");
            }
            System.out.print("Do you want to play again?(yes/no): ");
            String input = sc.nextLine();
            playAgain = input.equalsIgnoreCase("yes");
        }

        System.out.println("Game over! Your score:"+score);
        sc.close();
    }
}

