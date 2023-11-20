package isaacbernal;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
               System.out.println("Enter Something: ");
               String input = scanner.nextLine();
               System.out.printf("You entered: %s\n", input);


               if (StringUtils.isNumeric(input)) {
                   System.out.println(input + " is a number");
               } else {
                   System.out.println(input + " is not a number");
               }

        String flipped = StringUtils.swapCase(input);
        System.out.printf("Flipped case: %s\n", flipped);

        String reversed = StringUtils.reverse(input);
        System.out.printf("Reversed: %s\n", reversed);

    }
}