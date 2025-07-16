import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

//이중 우선순위 큐
public class Solution15 {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];

        //작슨 수부터
        PriorityQueue<Integer> minPq = new PriorityQueue<>();

        //큰수부터
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());

        List<Integer> delList= new ArrayList<>();

        int count =0;

        for(String oper : operations){
            String[] tmp = oper.split(" ");

            if(tmp[0].equals("I")){
                minPq.offer(Integer.valueOf(tmp[1]));
                maxPq.offer(Integer.valueOf(tmp[1]));
            }
            else{
                if(tmp[1].equals("-1")){
                    maxPq.remove(minPq.poll());
                }
                else{
                    minPq.remove(maxPq.poll());
                }
            }

        }

        answer[0]= maxPq.isEmpty()?0:maxPq.poll();
        answer[1]= minPq.isEmpty()?0:minPq.poll();

        return answer;
    }
}
