package aj.questions;
import  java.util.Map;
import java.util.HashMap;
import java.lang.*;
public class MaxOccuringChars2 {
    public static void main(String[] args) {
        String s = "abbcccddddd";
        char[] c = s.toCharArray();
        Map<Character, Integer> hm = new HashMap<>();
        for(char ch : c){
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }else{
                hm.put(ch,1);
            }
        }
        int maxCount =0;
        char maxChar =' ';
        for(Map.Entry<Character, Integer> me : hm.entrySet()){
            if(maxCount<me.getValue()){
                maxCount =me.getValue();
                maxChar = me.getKey();
            }
        }
        System.out.println(maxChar);

    }

}
