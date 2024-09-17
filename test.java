package JAVA_COURSE;
import java.util.Scanner;
import java.util.Random;
public class test {
    public static void main(String[] args) {

        // 0 = rock
        // 1 = paper
        // 2 = Scissors
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0,1 or 2");
        int userInput = sc.nextInt();


        Random random = new Random();
        int computerInput = random.nextInt(3);
     // System.out.println(computerInput);

        if(userInput == 1 && computerInput == 0 || userInput == 0 && computerInput == 2 || userInput == 2 && computerInput == 1  ){
            System.out.println("you Win");
        }
        else if( userInput == 0 && computerInput == 0 || userInput == 1 && computerInput == 1 || userInput == 2 && computerInput == 2) {
            System.out.println("Tied");
        }

        else {
            System.out.println("computer Win");
        }
        if (userInput == 0){
            System.out.println("User:ROCK");
        } else if (userInput== 1) {
            System.out.println("User:PAPER");
        }
        else {
            System.out.println("User: Scissors");
        }
        if (computerInput == 0){
            System.out.println("Computer:ROCK");
        } else if (computerInput== 1) {
            System.out.println("Computer:PAPER");
        }
        else {
            System.out.println("Computer: Scissors");
        }
    }


}
