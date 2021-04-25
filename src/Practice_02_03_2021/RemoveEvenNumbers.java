package Practice_02_03_2021;

import java.util.*;

public class RemoveEvenNumbers {

    public static void main(String[] args) {

        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        Set<Integer> set = new LinkedHashSet();
        set.addAll(Arrays.asList(numbers));
        set.removeIf(p-> p%2 == 0);
        System.out.println(set);
        System.out.println("=====================================================================");

        for(Iterator<Integer> it = set.iterator(); it.hasNext(); ){
            Integer p = it.next();
            if(p % 2 == 0){
                it.remove();
            }
        }
        System.out.println(set);

        System.out.println("====================================================================");

        Integer[] arr = {10,10 ,11,11, 9,9,9,9, 5,5,5,6,7,4,3,2,1};

        arr = new TreeSet<Integer>(Arrays.asList(arr)).toArray(new Integer[0]);  // returns array

        System.out.println(Arrays.toString(arr));

        System.out.println("======================================================================");

        String[] names = {"J","J","A","A","A","A","D","C","C","B","A","A"};
        Set<String> st = new TreeSet<>();
        st.addAll(Arrays.asList(names));

        names = st.toArray(new String[0]);

        System.out.println(Arrays.toString(names));

    }


}
