import java.util.PriorityQueue;

public class Solution2 {
    public int solution(int[] scoville, int K) {


        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i:scoville){
            pq.offer(i);
        }

        if(K==0){
            return 0;
        }

        int answer = 0;

        while(true){
            int food1 = pq.poll();
            if(food1>=K) break;

            if(pq.size()==0){
                return -1;
            }

            int food2 = pq.poll();

            int newFood = food1+food2*2;

            pq.offer(newFood);

            answer ++;
        }


        return answer;
    }
}
