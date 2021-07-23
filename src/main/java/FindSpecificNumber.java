import java.util.ArrayList;

public class FindSpecificNumber {

    private ArrayList<Integer> arrayList = new ArrayList();

    // A method for delete numbers that are bigger than a specific number
//    private void checkArrayWithInputNumber(int array[],int input){
//        for (Integer item : array) {
//            if (item < input){
//                arrayList.add(item);
//            }
//        }
//    }

    // A method for find numbers that sum equal to a special number
    public void findNumbers(int array[] ,int spNumber){

//        for (int i = 0; i < array.length; i++) {
//            for (int j = i; j < array.length; j++) {
//                if (i != j){
//                    if (spNumber == array[i] + array[j]){
//                        System.out.println("\n" + "The numbers is: " + spNumber + " = " + array[i] + " + " + array[j]);
//                    }
//                }
//            }
//        }

        //
        for (int i = 0; i < array.length; i++) {
            int submission = spNumber - array[i];
            if (submission > 0){
                int tmp = binarySearch(array,i,array.length-1,submission);  // find submission in array
                if (tmp > 0) {
                    System.out.println(spNumber + ":" + " " + array[i] + " + " + submission);
                }
            }
        }
    }

    // A method for search in array
    private int binarySearch(int arr[], int l, int r, int x){
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return 0;
    }
}
