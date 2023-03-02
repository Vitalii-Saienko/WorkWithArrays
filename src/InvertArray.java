import java.util.Arrays;

public class InvertArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] newArr = reverseArr(arr);
        System.out.println(Arrays.toString(newArr));
        System.out.println("= = = = =");
        int[] juja = merge(arr, arr2);
        System.out.println(Arrays.toString(juja));

    }
    // write method that reverse the array:
    public static int[] reverseArr(int[] array){
        int [] result = new int[array.length];
        int j = 0;
        for (int i = array.length-1; i >= 0; i--) {
            result[j] = array[i];
            j++;
        }
        return result;
    }
    //implement merging of arrays sorted in ascending order:
    public static int[] merge(int[] fst, int[] snd) {
        int[] result = new int[fst.length + snd.length];
        int fstIndex = 0;
        int sndIndex = 0;
        while (fstIndex + sndIndex != result.length) {
            if (fstIndex == fst.length || sndIndex == snd.length ){
                break;
            }
            if (fst[fstIndex] < snd[sndIndex]) {
                result[fstIndex + sndIndex] = fst[fstIndex++];
            }
            else {
                result[fstIndex + sndIndex] = snd[sndIndex++];
            }
        }
        if (fstIndex == fst.length){
            while (sndIndex != snd.length){
                result[fstIndex + sndIndex] = snd[sndIndex++];
            }
        }
        if (sndIndex == snd.length){
            while (fstIndex != fst.length){
                result[fstIndex + sndIndex] = fst[fstIndex++];
            }
        }
        return result;
    }
}