import java.util.LinkedList;
import java.util.Queue;

public class Solution12 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum =0;
        Queue<Integer> bridge = new LinkedList<>();

        for(int truck : truck_weights){

            while(true){
                if(bridge.isEmpty()){
                    bridge.offer(truck);
                    sum+=truck;
                    answer++;
                    break;
                }else if(bridge_length==bridge.size()){
                    sum-=bridge.poll();
                }else{
                    if(sum+truck<=weight){
                        bridge.offer(truck);
                        sum+=truck;
                        answer++;
                        break;
                    }else{
                        bridge.offer(0);
                        answer++;
                    }
                }
            }
        }


        return answer+bridge_length;
    }
}
