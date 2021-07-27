import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 3, 6, 12, 7, 21, 14, 15, 9, 1, 22, 16, 18);

        //Get specific number from user
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your specific number: ");
        int spNumber = input.nextInt();

        //Create an instance from FindDuplicate class.
        FindSpecificNumber findSpecificNumber = new FindSpecificNumber();

        findSpecificNumber.findNumbers(list, spNumber);
    }
}
