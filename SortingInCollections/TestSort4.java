
package SortingInCollections;
import java.util.ArrayList;
import java.util.Collections;


class State implements Comparable<State>{
    String name;
    State(String name){
        this.name=name;
    }
    
    @Override
    public int compareTo(State obj){
        return name.compareTo(obj.name);
    }
}

public class TestSort4 {
    public static void main(String[] args) {
        ArrayList<State> list = new ArrayList<>();
        list.add(new State("bihar"));
        list.add(new State("chandigrah"));
        list.add(new State("arunachal Pradesh"));
        list.add(new State("delhi"));
        list.add(new State("punjab"));
        
        System.out.println("before sorting");
        for(State obj:list){
             System.out.println(obj.name);
        
        }
       
        System.out.println("");
        System.out.println("After sorting");
        Collections.sort(list, Collections.reverseOrder());
        
        list.forEach((s->{
            System.out.println(s.name);
        }));
    }
    
    
}
