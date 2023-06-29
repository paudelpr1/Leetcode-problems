
import java.util.*;

public class longestSubstring {

    public static void main(String args[]) {
        String s = "abcdefge";
        int answer = lengthOfLongestSubstring(s);
        System.out.println(answer);
    }

    public static int lengthOfLongestSubstring(String s) {
        Stack<Character> sub1 = new Stack<>();
        int count = 0;
        int output = 0;
        // System.out.println(s.charAt(0));
        // sub1.push(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            if (sub1.search(s.charAt(i)) == -1) {
                System.out.println(s.charAt(i));
                sub1.push(s.charAt(i));
            } else {
                int find = sub1.search(s.charAt(i));
                for (int j = 0; j <= find; j++) {
                    // System.out.println("PoP " + sub1.pop());
                    sub1.remove(j);
                    count++;
                }
                if (count >= output) {
                    output = count;
                    count = 0;
                }
                i--;
            }
        }
        while (!sub1.isEmpty()) {
            System.out.println("PoP " + sub1.pop());
            // sub1.pop();
            count++;
        }
        if (count >= output) {
            output = count;
            count = 0;
        }
        return output;

    }
}