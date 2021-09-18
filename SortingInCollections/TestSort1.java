
package SortingInCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestSort1 {
    
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("raj");
        list.add("roshan");
        list.add("mohan");
        list.add("shivam");
        
        Collections.sort(list);
        
        System.out.println(list);
        
        Iterator itr = list.iterator();
        
        while(itr.hasNext()){
            System.out.print(itr.next()+"\t");
        }
           
        System.out.println("");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("papaya");
        list2.add("lemon");
        list2.add("watermelon");
        
        Collections.sort(list2,Collections.reverseOrder());
        
        itr = list2.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() +"\t");
        }
        
        //sort wraper class object
        
        System.out.println("");
        ArrayList list3=new ArrayList();
        list3.add(Integer.valueOf(181));
        list3.add(Integer.valueOf(12));
        list3.add(Integer.valueOf(103));
        list3.add(104);
        
        Collections.sort(list3);
        
        itr = list3.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
