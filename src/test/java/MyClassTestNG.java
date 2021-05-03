import org.testng.Assert;
import org.testng.annotations.Test;

public class MyClassTestNG {

    @Test
    public void helloWorld() {
        int[] numbers = {32, 54, 21, 64, 4, 3, 21, 65};
        int numMax = findMax(numbers);      // 65
        Assert.assertEquals(numMax, 64, "Result1 is not as expected");
    }


    @Test
    public void helloWorld2() {
        int[] numbers2 = {-32, 4, 7, 64, 94, 3, 21, 65};
        int numMax2 = findMax(numbers2);
        Assert.assertEquals(numMax2, 94, "Result2 is not as expected");
    }



    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i=1 ; i < arr.length ; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


}
