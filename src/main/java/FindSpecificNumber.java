import java.util.*;

public class FindSpecificNumber {

    private ArrayList<Integer> arrayList = new ArrayList();

    // A method for find numbers that sum equal to a special number
    public Set<Integer> findNumbers(List<Integer> array, int spNumber){
        Set<Integer> set = new HashSet<>();

        // Sort array
        Collections.sort(array);

        for (Integer item : array) {
            int submission = spNumber - item;
            if (submission > 0){
                int tmp = binarySearch(array,0,array.size(),submission);
                if (tmp > 0){
                    set.add(submission);
                    set.add(item);
                }
            }
        }
        return set;
    }

    // A method for search in array
    private int binarySearch(List<Integer> arr, int l, int r, int x){
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr.get(mid) == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr.get(mid) > x)
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
