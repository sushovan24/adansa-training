/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// convert arraylist to array
package ArrayListToArray;
import java.util.ArrayList;
import java.util.List;
public class ArrayListToArray {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        Integer[] intArray=new Integer[list.size()];
        list.toArray(intArray);
        for(Integer integer:intArray)
        {
            //System.out.print("array values="+integer+" ");
              System.out.print(integer);
        }
        System.out.println(" ");
    }
    
}
