package CollectionFramework;
import java.util.*;

public class ALDemo{
    public static void main(String[] args){
        ArrayList l = new ArrayList();
        l.add("a");
        l.add(10);
        l.add(null);
        l.add("aj");
        System.out.println(l);

        System.out.println(l.size());
        System.out.println(l.contains("a"));
        System.out.println(l.indexOf(10));
        System.out.println(l.isEmpty());

        ListIterator listIterator = l.listIterator();
        while (listIterator.hasNext()) {
            
            
        }

        
    }
}