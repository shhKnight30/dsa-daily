
import java.util.*;
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = arr.length-1;
        int max = arr[i];
        list.add(max);
        i--;
        while(i>=0){
            if(arr[i]>max){
                list.add(0,arr[i]);
                max = arr[i];
                
            }
            i--;
        }
        return list;
    }
}
