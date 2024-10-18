import java.util.ArrayList;

public abstract class numFound {

    public static Boolean perteneceA (ArrayList<Integer> lista, int n) {
        Boolean belongs = false;
        for (int i = 0 ; i < lista.size()   ; i++){
         if (lista.get(i) == n){
            belongs = true;
         }
        }
     return belongs;

    }
}
