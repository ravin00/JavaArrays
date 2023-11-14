package June2023paper124;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2A1 {

    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Numbers (0 to quit)");
        int userInput;

        do {
            userInput = sc.nextInt();

            if (userInput != 0) {
                n.add(userInput);
            }
        } while (userInput != 0);

        for (int i = n.size() - 1; i >= 0; i--) {
            if (n.get(i) % 2 == 0)
                n.remove(i);
        }

        System.out.println("Odd Numbers : ");
        for (Integer value : n) {
            System.out.println(value + "");
        }

        sc.close();  // Closing the Scanner
    }
}
