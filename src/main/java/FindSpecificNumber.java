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
                int tmp = Collections.binarySearch(array,submission);
                // int tmp = binarySearch(array,0,array.size(),submission);
                if (tmp > 0){
                    set.add(submission);
                    set.add(item);
                }
            }
        }

        if (set.size() == 0){
            System.err.println("  *** This list has not the input number ***");
        }
        return set;
    }
}
