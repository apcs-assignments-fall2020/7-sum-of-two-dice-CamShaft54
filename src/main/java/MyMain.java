import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        return new Random().nextInt(6)+1;
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int[] rolls = new int[n];
        int[] sums = new int[11];
        for (int i = 0; i < n; i++) {
            rolls[i] += rollDie() + rollDie();
            for (int j = 0; j < 11; j++) {
                if (rolls[i] == j+2) {
                    sums[j]++;
                }
            }
        }
        return sums;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many times do you want to roll two dice?");
        int[] arr = sumOfTwoDice(scan.nextInt());
        for (int i = 0; i < 11; i++) {
            System.out.println(arr[i] + " pairs that summed to " + (i+2));
        }
    }
}
