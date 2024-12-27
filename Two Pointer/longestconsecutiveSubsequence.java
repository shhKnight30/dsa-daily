
import java.util.*;



class Solution {

    public int longestConsecutive(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int maxLen = 0;

        HashSet<Integer> set = new HashSet();
        for (int i : nums) {
            set.add(i);
        }
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            int el = iter.next();
            if (!set.contains(el - 1)) {
                int len = 1;
                while (set.contains(el + 1)) {
                    len++;
                    el+=1;
                }
                if (len > maxLen) {
                    maxLen = len;
                }
            }
        }
        return maxLen;
    }
}