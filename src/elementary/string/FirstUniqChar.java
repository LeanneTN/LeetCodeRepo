package elementary.string;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {
    public int firstUniqChar(String s) {
        int n = s.length();
        Map<Character, Integer> statistics = new HashMap<>();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            statistics.put(ch, statistics.getOrDefault(ch, 0) + 1);
        }
        for(int i = 0; i <  n; ++i){
            if(statistics.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
