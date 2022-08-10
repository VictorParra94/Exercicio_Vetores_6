import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers? = ");
        int lenght = sc.nextInt();
        double[] numbers = new double[lenght];

        double higher = 0;
        int position = 0;
        for (int i=0; i<lenght; i++){
            System.out.print("Enter a number = ");
            numbers[i] = sc.nextDouble();
            if (numbers[i] > higher){
                higher = numbers[i];
                position = i;
            }
        }
        System.out.println("\nHigher number = " + higher);
        System.out.println("Higher number position = " + position);
    }
}
