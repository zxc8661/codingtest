import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution1 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<commands.length;i++){
            int[] com = commands[i];

            int start = com[0]-1;
            int end = com[1]-1;
            int k = com[2]-1;

            for(int q=start ; q<=end;q++){
                list.add(array[q]);
            }

            list.sort(Comparator.naturalOrder());

            answer[i]=list.get(k);
            list.clear();

        }
        return answer;
    }
}
