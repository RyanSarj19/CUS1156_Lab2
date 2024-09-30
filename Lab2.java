
import java.util.ArrayList;
import java.util.HashSet;

public class Lab2 {
    /**
     * Counts the number of unique strings in a list
     * @param list ArrayList of strings to be examined
     * @return number of unique strings in the list
     */
    public static int countUnique(ArrayList<String> list){
        // I used a Hash-Set to store unique strings
        HashSet<String> uniqueSet = new HashSet<>(list);
        
        // The size of the HashSet doubles as the count of unique strings
        
        return uniqueSet.size(); }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("orange");
        words.add("blackboard");
        words.add("apple");
        words.add("orange");
        words.add("sun");
        words.add("moon");
       
        int unique = countUnique(words);
        System.out.println(words + " has " + unique + " unique words");
    }
}
