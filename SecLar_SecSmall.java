import java.util.*;
public class SecLar_SecSmall {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.

      int[] res = new int[2];
       Arrays.sort(a);
      int fsecond = a[1];
      int lsecond = a[n-2];
     

       res[0] = lsecond;
       res[1] = fsecond;
       return res; 

    }
}
