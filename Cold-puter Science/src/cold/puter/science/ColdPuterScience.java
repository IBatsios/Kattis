package cold.puter.science;

import java.util.Scanner;

public class ColdPuterScience {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numOfTemps = input.nextInt();
        int temps;
        int counter = 0;

        for (int i = 0; i < numOfTemps; i++) {
            temps = input.nextInt();
            
            if (temps < 0) {
                counter++;
            }
        }
        
        System.out.println(counter);
    }
}
