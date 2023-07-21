// Creating and doing basic operations on Vector
import java.util.*;
class new12 {

    public static void main(String args[]){
            
        Vector<Integer> v = new Vector<>(5, 2);
       

        v.add(2);
        v.add(4);
        v.add(1);
        v.add(11);
        v.remove(0);
        Collections.sort(v);
        System.out.print(v);



    }
    
}
