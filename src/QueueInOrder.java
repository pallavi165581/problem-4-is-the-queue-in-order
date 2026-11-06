/**
 * Problem 4: Is the Queue in Order?
 *
 * One pass from index 1: the first position whose token is smaller than
 * the token just before it is where the order breaks. Equal neighbours
 * are allowed, so the check is strict '<'. An empty queue or a single
 * student never enters the loop and is reported in order (-1).
 *
 * Time: O(n). Space: O(1).
 */
public class QueueInOrder {

    public static int firstBreak(int[] tokens) {
        for (int i = 1; i < tokens.length; i++) {
            if (tokens[i] < tokens[i - 1]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstBreak(new int[]{3, 5, 5, 8, 6, 9})); // 4  (6 comes after 8)
        System.out.println(firstBreak(new int[]{1, 2, 2, 7}));       // -1
        System.out.println(firstBreak(new int[]{10, 9, 11}));        // own input -> 1
    }
}
