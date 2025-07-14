import java.util.HashMap;
import java.util.Map;

public class Solution5 {
    public int solution(int[] nums) {
        int get = nums.length/2;

        Map<Integer,Integer> map = new HashMap<>();


        for(int i=0;i<nums.length;i++){

            if(!map.containsKey(nums[i])){
                map.put(nums[i],0);
            }
        }

        System.out.println(map.size());

        System.out.println(get);

        int answer = 0;


        if(map.size()<get){
            answer=map.size();
        }else{
            answer =get;
        }


        return answer;
    }
}
