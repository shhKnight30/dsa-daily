
import java.util.*;

public class bagoftokens{
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i =0;
        int l = tokens.length;
        int j= l-1;
        int score =0;
        List<Integer> ans = new ArrayList();
        while(i<=j){
            if(power>= tokens[i]){
                power-=tokens[i];
                ans.add(++score);
                i++;
            }else if(power<tokens[i] && score>0){
                power+=tokens[j];
                score--;
                j--;
            }else{
                i++;
                j--;
            }
        }

        int result =0;
        for(int k=0;k<ans.size();k++){
            result = Math.max(result,ans.get(k));
        }
        return result;
    }    
}