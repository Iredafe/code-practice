import java.util.*;

public class GroupAnagrams {

    private static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs){
            char [] sortedWord = word.toCharArray();
            Arrays.sort(sortedWord);
            String sortedKey = new String (sortedWord);
            if(map.containsKey(sortedKey)){
               map.get(sortedKey).add((word));
            }else{
                map.put(sortedKey, new ArrayList<>(List.of(word)));
            }
        }


        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(words);
        System.out.println(result);
    }
}
