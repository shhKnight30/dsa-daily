import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 1;
        HashMap <Character,Integer> map = new HashMap();
        int start = 0;
        for(int end =0;end<s.length();end++){
            char curr = s.charAt(end);
            if(map.containsKey(curr) && map.get(curr)>=start){
                start = map.get(curr)+1;
            }
            map.put(curr, end);
            maxLen = Math.max(maxLen, end-start+1);
        }
        return maxLen;
    }
}
        /* int i = 0;
        int j = 1;
        HashSet<Character> set = new HashSet();
        set.add(s.charAt(i));
        while(j<s.length()){
            
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                len++;
                maxLen = Math.max(len, maxLen);
            }
            else{
                set.remove(s.charAt(i));
                len--;
                i++;
            }
        } */
       

       
/*         int len = 1;
        int maxLen = 1;
        HashMap<Character,Integer> map = new HashMap<>();
        int start = 0; 
        for(int end=0;end<s.length();end++){
            char curr = s.charAt(end);
            if(map.containsKey(curr) && map.get(curr)>=start){
                start = map.get(curr)+1;  
            }
            map.put(curr, end);
            maxLen = Math.max(maxLen, end-start+1);
        }        
        return maxLen; */