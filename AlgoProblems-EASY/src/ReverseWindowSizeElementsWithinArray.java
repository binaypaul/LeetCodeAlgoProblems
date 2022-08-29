import java.util.Arrays;

public class ReverseWindowSizeElementsWithinArray {
    public static void main(String[] args) {
        int arr[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                            // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        int window = 5;

        int len = arr.length;
        int i = 0;
        while(i < len - (window - 1)) {
            int startIndex = i;
            int endIndex = i + window - 1;
            reverse(arr, startIndex, endIndex);
            i += window;
        }
        int startIndex = i;
        int endIndex = len-1;
        reverse(arr, startIndex, endIndex);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int startIndex, int endIndex) {
        while(startIndex < endIndex) {
            int startEle = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = startEle;

            startIndex++;
            endIndex--;
        }
    }
}
