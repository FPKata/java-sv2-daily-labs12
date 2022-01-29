package day05;

import java.util.HashMap;
import java.util.Map;

public class StringStatistics {
    public Map<Character, Integer> numberOfCharactersByCharacter(String s){
        Map<Character, Integer> result = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if (!result.containsKey(s.charAt(i))){
                result.put(s.charAt(i), 1);
            }else{
                result.put(s.charAt(i), result.get(s.charAt(i)) + 1);
            }
        }
        return result;
    }
}
