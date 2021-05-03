public class MyClass {

    public static void main(String[] args) {

        int[] numbers = {32, 54, 21, 64, 4, 3, 21, 65};
        int numMax = findMax(numbers);
        System.out.println("Max number: " + numMax);    // 65

        int[] numbers2 = {-32, 4, 7, 64, 94, 3, 21, 65};
        int numMax2 = findMax(numbers2);
        System.out.println("Max number: " + numMax2);   // 94

    }




    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i=1 ; i < arr.length ; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }
        }
        return max;
    }

}
