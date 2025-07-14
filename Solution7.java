import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution7 {
    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String,Integer> map = new HashMap<>();

        for(String[] clothe :clothes){
            if(map.isEmpty()){
                map.put(clothe[1],1);
            }else if(map.containsKey(clothe[1])){
                map.replace(clothe[1],map.get(clothe[1])+1);
            }else{
                map.put(clothe[1],1);
            }

        }


        List<Integer> list = new ArrayList<>(map.values());

        for(Integer i : list){
            answer *=i+1;
        }


        return answer-1;
    }
}
