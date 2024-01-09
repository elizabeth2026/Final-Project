import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //create counting variable
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Before you begin, this is an reminder to input all your answers starting with a capital letter");
        System.out.println("Hello, please input the number of questions you want to answer");
        //store user input number in an integer
        int numA = scanner.nextInt();
        //store the question file into an array
        String[] questionArray = new String[246];
        questionArray = fileToArray("/Users/ellie/IdeaProjects/Final Project CS Elizabeth/src/questions.txt");
        //store the answer file into an array
        String [] answerArray = new String[246];
        answerArray = fileToArray("/Users/ellie/IdeaProjects/Final Project CS Elizabeth/src/answers.txt");

        //for loop for printint out questions repeatedly
        for(int i = 0; i<numA; i++){
            int total = 246;
            int index = numGenerator(total);
            String question = questionArray[index];
            System.out.println("What is the capital of " + question + "?");
            String answer = scanner.next();
            String realAnswer = answerArray[index];
            //if loop to compare user answer to actual answer
            if(answer.equals(realAnswer)){
                System.out.println("correct!");
                count ++;
            }
            else{
                System.out.println( "sorry that's not right. Try again!");
            }

        }
        System.out.println("your final score is " + count);
        System.out.println("good job! You may play this game again if you want!");


    }


    //random number generator
    public static int numGenerator(int total){
        Random random = new Random();
        int randomNum = random.nextInt(total);
        return randomNum;

    }
    // input file into array
    public static String[] fileToArray(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        String[] array1 = new String[248];

        int index = 0;
        while (scanner.hasNextLine()) {
            array1[index] = scanner.nextLine();
            index++;
        }

        return array1;

        /* String finished = null;
        while (index < 248) {
            finished = array1[index];
            return finished;
        }
        return finished;

         */
    }


}