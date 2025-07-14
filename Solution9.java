import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution9 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        List<Integer> result = new ArrayList<>();

        Queue<Integer> progressQ = new LinkedList<>();

        Queue<Integer> speedQ = new LinkedList<>();

        for(int i=0;i<speeds.length;i++){
            progressQ.offer(progresses[i]);
            speedQ.offer(speeds[i]);
        }

        int count =0;
        int workDay= 0;

        while(!progressQ.isEmpty()){
            int progress = progressQ.poll();
            int speed = speedQ.poll();

            int tmp = (100-progress)/speed;
            if((100-progress)%speed!=0) tmp++;

            if(workDay==0){
                workDay=tmp;
                count++;
            }else if(workDay>=tmp){
                count++;
            }else{
                result.add(count);
                count=1;
                workDay=tmp;
            }

        }
        result.add(count);

        return result.stream().mapToInt(i->i).toArray();
    }
}
