import java.util.HashMap;
import java.util.Map;

public class Solution6 {
    public boolean solution(String[] phone_book) {

        boolean answer = true;
        Map<String,Integer> map = new HashMap<>();


        for(String pb : phone_book){
            map.put(pb,0);
        }

        for(String pb: phone_book){
            for(int i=0;i<pb.length();i++){
                if(map.containsKey(pb.substring(0,i))) return false;
            }
        }

        return answer;
    }
}
