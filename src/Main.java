import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, please input the number of questions you want to answer");
        int numA = scanner.nextInt();
        System.out.println(numA);
        int count = 0;
        for(int i = 0; i<numA; i++){
            int total = 100;
            int index = numGenerator(total);
            System.out.println(index);
        }


    }

    //read from file 1

    //random number generator
    public static int numGenerator(int total){
        Random random = new Random();
        int randomNum = random.nextInt(total);
        return randomNum;

    }

}