import junit.framework.AssertionFailedError;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class FindSpecificNumberTest {
    private FindSpecificNumber findSpecificNumber = new FindSpecificNumber();

    @Test
    public void findNumbersTest(){
        List<Integer> list = Arrays.asList(2,4,6,8,3,6,12,7,21,14,15,9,1,22,16,18);
        int spNumber = 21;
        List<Integer> expectedValue = Arrays.asList(18,3,6,7,9,12,14,15);
        Set<Integer> actualValue = findSpecificNumber.findNumbers(list,spNumber);
        List actValue = new ArrayList();
        for (Integer item : actualValue) {
            actValue.add(item);
        }

        Assert.assertArrayEquals(new List[]{expectedValue}, new List[]{actValue});
    }


    @Test
    public void findNumbersTestError(){
        List<Integer> list = Arrays.asList(2,4,6,8,3,6,12,7,21,14,15,9,1,22,16,18);
        int spNumber = 21;
        List<Integer> expectedValue = Arrays.asList(18,3,7,9,12,14,15);
        Set<Integer> actualValue = findSpecificNumber.findNumbers(list,spNumber);
        List actValue = new ArrayList();
        for (Integer item : actualValue) {
            actValue.add(item);
        }

        Assert.assertArrayEquals(new List[]{expectedValue}, new List[]{actValue});
    }


}
