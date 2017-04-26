import java.io.*;
import java.util.Scanner;

public class IsatQuiz{
  //This is the main function that will run and create the quiz
  public static void main(String[] args) {

       //These are the questions we will ask the user.
       final String QUESTION_1 = "How old are you?";
       final String QUESTION_2 = "What is your favorite car?";
       final String QUESTION_3 = "What is your favorite color?";
       final String QUESTION_4 = "What year were you born?";

       //declare a variable as age to be used in quiz
        int age = 0;
        //declare a variable as car to be used in quiz
        String car = " ";
        //declare a variable as color to be used in quiz
        String color = " ";
        //declare a variable as year to be used in quiz
        int year = 0;

        //This is a scanner to take in input from user
        Scanner sc = new Scanner(System.in);
        System.out.println(QUESTION_1);
        age = sc.nextInt();

        //check age of user and return if they are a teenager or adult
        if (age < 20){
          System.out.println("You are a teenager.");
          int tillOfAge = 20 - age;
          System.out.println("You have " + tillOfAge + " more years until you are an adult.");
        }
        else
        {
          System.out.println("You are an adult.");
        }

        System.out.println(QUESTION_2);
        car = sc.next();
        System.out.println(QUESTION_3);
        color = sc.next();
        System.out.println(QUESTION_4);
        year = sc.nextInt();

        //Returns the age gape they are in.
        millenial(year);



   }

   //Subprogram to determine the age gap.
   public static void millenial (int year){
       if (year < 2000)
       {
         System.out.println("You are a millenial.");
       } 
       else
       {
         System.out.println("You are old.");
       }

   }

}
