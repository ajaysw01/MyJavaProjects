package CollectionFramework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Cmp{
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new myComparator());
        ts.add("Ajay");
        ts.add(new StringBuffer("Om"));
        ts.add("nilu");
        ts.add("Akshu");
        ts.add("Krishna");
        System.out.println(ts);
    }
        
}
class myComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
       String s1 = o1.toString();
       String s2 = o2.toString();
        return -s2.compareTo(s1);
    }

}
