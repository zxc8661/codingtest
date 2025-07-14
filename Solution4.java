import java.util.HashMap;
import java.util.Map;

public class Solution4 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String,Integer> map= new HashMap<>();

        for(String p : participant){
            if(map.containsKey(p)){
                map.replace(p,map.get(p)+1);
            }else{
                map.put(p,1);
            }
        }

        for(String c : completion){
            map.replace(c,map.get(c)-1);
        }

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue()!=0){
                answer = entry.getKey();
                break;
            }
        }

        return answer;
    }
}
