import java.util.Arrays;
import java.util.PriorityQueue;

//디스크 컨트롤러
public class Solution14 {
    public int solution(int[][] jobs) {
        int answer = 0;
        int index =0;
        int count =0;
        int end =0;


        Arrays.sort(jobs,(s1, s2)->s1[0]-s2[0]);


        PriorityQueue<int[]> pq =new PriorityQueue<>(
                (s1,s2)->s1[1] -s2[1]);


        while(count<jobs.length){

            while(index<jobs.length && jobs[index][0]<=end ){
                pq.offer(jobs[index++]);
            }

            if(pq.isEmpty()){
                end=jobs[index][0];
            }else{
                int [] tmp =pq.poll();
                answer+=tmp[1] +end-tmp[0];
                end+= tmp[1];
                count++;


            }
        }

        return (int) Math.floor(answer/jobs.length);
    }

}
