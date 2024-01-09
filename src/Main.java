import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, please input the number of questions you want to answer");
        int numA = scanner.nextInt();
        System.out.println(numA);
        String[] questionArray = new String[246];

        questionArray = fileToArray("questions.txt");
        int count = 0;
        for(int i = 0; i<numA; i++){
            int total = 246;
            int index = numGenerator(total);
            System.out.println(index);
            String question = questionArray[index];
            System.out.println("What is the capital of " + question + "?");

        }


    }

    //read from file 1

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