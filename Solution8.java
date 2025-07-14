import java.util.*;

public class Solution8 {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        Map<String,Integer> genreTotal = new HashMap<>();

        Map<String,Map<Integer,Integer>> music = new HashMap<>();


        for(int i=0;i<genres.length;i++){
            String genre = genres[i];
            int play = plays[i];

            if(genreTotal.containsKey(genre)){

                genreTotal.replace(genre,genreTotal.get(genre)+play);

                Map<Integer,Integer> tmpMusic = music.get(genre);
                tmpMusic.put(i,play);

            }else{
                genreTotal.put(genre,play);

                Map<Integer,Integer> tmpMusic = new HashMap<>();
                tmpMusic.put(i,play);
                music.put(genre,tmpMusic);
            }


        }

        List<String> keys = new ArrayList<>(genreTotal.keySet());

        Collections.sort(keys,(s1, s2)->genreTotal.get(s2) - genreTotal.get(s1) );

        ArrayList<Integer> result = new ArrayList<>();

        for(String key : keys){
            Map<Integer,Integer> tmpMap = music.get(key);

            List<Integer> musicKeys = new ArrayList<>(tmpMap.keySet());

            Collections.sort(musicKeys,(s1,s2) -> tmpMap.get(s2)-tmpMap.get(s1) );

            if(musicKeys.size()==1){
                result.add(musicKeys.get(0));
            }else{
                result.add(musicKeys.get(0));
                result.add(musicKeys.get(1));
            }
        }


        return result.stream().mapToInt(i->i).toArray();
    }
}
