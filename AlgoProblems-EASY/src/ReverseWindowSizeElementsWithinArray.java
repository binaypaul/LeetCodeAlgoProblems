import java.util.Arrays;

public class ReverseWindowSizeElementsWithinArray {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int k = 5;
        //o/p: [3,2,1,6,5,4,9,8,7,11,10]
        System.out.println(Arrays.toString(array));
        int currentI = 0;
        for(int i = 0; i < array.length; i=i+k) {
            int start = i;
            int end  = i + k - 1;
            if(end < array.length-1) {
                //reverse logic
                while (start < end) {
                    int temp = array[start];
                    array[start] = array[end];
                    array[end] = temp;
                    start++;
                    end--;
                }
            }
            currentI = i;
        }
        int endI = array.length-1;
        while (currentI < endI) {
            int temp = array[currentI];
            array[currentI] = array[endI];
            array[endI] = temp;
            currentI++;
            endI--;
        }
        System.out.println(Arrays.toString(array));
    }
}
