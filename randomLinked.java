import java.util.LinkedList;
import java.util.Random;

public class randomLinked {



    public static LinkedList<Integer> randomList (int n) {
        LinkedList<Integer> list = new LinkedList<>();
        Random randomGen = new Random();

        for ( int i = 0; i < n; i++) {
            list.add(randomGen.nextInt(100));
        }
        return list;
    }

    /*/ public boolean belongs (Integer m) {
        boolean belong = false;
        for ( int i = 0; 0 < list.size(); i++) {
            if ( m == i ) {
                return true;
            }
        }
        return belong;
    }  /*/

}