package add_two_numbers_1;
//https://leetcode.com/problems/add-two-numbers/

import CommonDSUtility.SingleLinkedList.SingleLinkedList;
import CommonDSUtility.SingleLinkedList.SingleLinkedListUtil;

import java.math.BigInteger;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

Constraints:
The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        SingleLinkedList l1 = SingleLinkedListUtil.createSingleLinkedListFromArray(new int[] {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1});
        SingleLinkedList l2 = SingleLinkedListUtil.createSingleLinkedListFromArray(new int[] {5,6,4});
        System.out.println(l1);
        System.out.println(l2);

        String revStr1 = reversedListInteger(l1);
        String revStr2 = reversedListInteger(l2);
        BigInteger bgIntSum = new BigInteger(revStr1).add(new BigInteger(revStr2));
        System.out.println(bgIntSum);

        SingleLinkedList list = null;
        String sumInStr = String.valueOf(bgIntSum);
        for(char ch : sumInStr.toCharArray()) {
            list = new SingleLinkedList(Integer.parseInt(String.valueOf(ch)), list);
        }
        System.out.println(list);
    }

    public static String reversedListInteger(SingleLinkedList list) {
        StringBuilder reversedList = new StringBuilder("");
        while (list != null) {
            reversedList.append(list.data);
            list=list.next;
        }
        return reversedList.reverse().toString();
    }
}
