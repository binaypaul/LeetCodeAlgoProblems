package CommonDSUtility.SingleLinkedList;

import java.util.Arrays;

public class SingleLinkedListUtil {
    public static SingleLinkedList createSingleLinkedListFromArray(int[] array) {
        SingleLinkedList singleLinkedList = null;
        int len = array.length;
        for(int i = len-1; i>=0; i--) {
            singleLinkedList = new SingleLinkedList(array[i], singleLinkedList);
        }
        return singleLinkedList;
    }

    //example
    public static void main(String[] args) {
        System.out.println(createSingleLinkedListFromArray(new int[] {2,4,3}));
    }
}
