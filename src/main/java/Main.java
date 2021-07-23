import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Get array size from user
        Scanner input = new Scanner(System.in);
        System.out.println("please enter size of array");
        int size = input.nextInt();

        int[] array = new int[size];

        // Get array numbers from user and add to array
        System.out.println("please enter "+size+" number:");
        for (int i=0; i<size; i++){
            array[i] = input.nextInt();
        }

        //Get specific number from user
        System.out.println("Please enter your specific number: ");
        int spNumber = input.nextInt();

        //Create an instance from MergeSort and FindDuplicate class.
        MergeSort mergeSort = new MergeSort();
        FindSpecificNumber findSpecificNumber = new FindSpecificNumber();

        System.out.println("Given Array");
        mergeSort.printArray(array);

        mergeSort.sort(array, 0, array.length - 1);

        System.out.println("\nSorted array");
        mergeSort.printArray(array);

        findSpecificNumber.findNumbers(array, spNumber);
    }
}
