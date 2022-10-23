package elementary.string;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> anagramMap = new HashMap<>();
        if (s.length() != t.length())
            return false;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            anagramMap.put(ch, anagramMap.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            anagramMap.put(ch, anagramMap.getOrDefault(ch, 0) - 1);
        }
        for(int i = 0; i < s.length(); i++){
            if(anagramMap.get(s.charAt(i)) != 0){
                return false;
            }
        }
        return true;
    }
}
