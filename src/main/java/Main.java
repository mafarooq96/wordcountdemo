import java.util.Iterator;
import java.util.Map;

import static sun.misc.Version.println;

/**
 * Created by mafar on 9/7/2016.
 */
public class Main {

    public static void main(String[] args) {

        String mystr="cow dog cow dog goat dog";

        Map<String,Integer> myMap= WordUtil.count(mystr);

        System.out.println("Results");

        Iterator it = myMap.entrySet().iterator();
        while (it.hasNext()){

            Map.Entry pair= (Map.Entry)it.next();

            System.out.println(pair.getKey()+ ": " + pair.getValue());

        }




    }

}
