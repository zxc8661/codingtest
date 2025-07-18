import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

//이중 우선순위 큐
public class Solution16 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        List<Integer> list;

        for(int i=0;i<commands.length;i++){
            list = new ArrayList<>();

            int[] command = commands[i];

            for(int j =command[0]-1;j<command[1];j++){
                list.add(array[j]);

            }

            for(int k : list){
                System.out.print(k);
            }
            System.out.println("");
            Collections.sort(list);

            for(int k : list){
                System.out.print(k);
            }
            System.out.println("");
            answer[i]=list.get(command[2]-1);


        }

        return answer;
    }
}
