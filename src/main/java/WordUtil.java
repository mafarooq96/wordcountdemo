import java.util.*;

/**
 * Created by mafar on 9/7/2016.
 */
public class WordUtil {

    public static Map<String, Integer> count (String mystr) {

   Map<String,Integer> myMap = new HashMap<String,Integer>();

        List<String> myList= new ArrayList<String>(Arrays.asList(mystr.split(" ")));

        for( String word:myList)
        {
           if (myMap.containsKey(word))
               myMap.put(word, myMap.get(word)+1);
           else
            myMap.put(word,1);
        }

        return myMap;
    }

}
