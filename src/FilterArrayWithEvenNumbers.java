import java.util.Arrays;

public class FilterArrayWithEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 6, 7, 9};
        int[] newArr = filterEven(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
        System.out.println("==========");

    }

    /*
    Filter the array to leave only even elements.
    The outgoing array, for simplicity, should be the same size as the incoming array.
    {4, 3, 5, 6, 7, 9} -> {4, 6, 0, 0, 0, 0}
     */
    public static int[] filterEven(int[] nums) {
        int[] changedArr = new int[nums.length];
        int j = 0; //new
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                changedArr[j] = nums[i];
                j++;
            }
        }
        return changedArr;
    }
}
