package generalQue;

import java.util.Scanner;

public class GuessANum {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int guess=0;
        int count=0;
        System.out.println("Welcome to the Guess the Number Game!");
        int num= (int) (Math.random()*100);
        while(guess!=num){
            System.out.println("Guess a number between 0 and 100:");
            guess=sc.nextInt();
            count++;
            if(guess<num){
                System.out.println("Higher");
            }else if(guess>num){
                System.out.println("Lower");
            }else{
                System.out.println("Congratulations! You guessed the number after " + count + " attempts5.");
            }
        }
    }
    
}
