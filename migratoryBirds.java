import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import hankerrank.easy.list;

public class migratoryBirds {
    public static void main(String[] args) {
        int[] arr ={1, 4, 5, 5, 5, 3};
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i =0; i< arr.length; i++)
            if(hm.containsKey(arr[i]))
                hm.put(arr[i], hm.get(arr[i])+1);
            else
               hm.put(arr[i],1);    

        int maxNum = Collections.max(hm.values());
        int count =0;
        List<Integer> list = new ArrayList<>();
        for(Entry<Integer,Integer> entry : hm.entrySet()){
           
            if(entry.getValue().equals(maxNum))
                list.add(entry.getKey());
                count++;
                
        }
        // System.out.println(list);
        
        for(Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue().equals(maxNum))
               if(count ==1 )
                    System.out.println(entry.getKey());
               else if(count >1){
                   Arrays.sort(list.toArray());
                  
               }
        }  
         System.out.println(list.get(0));

        // int count1=0, count2=0 ,count3=0, count4=0,count5 =0;
        // List<Integer> list = new ArrayList();

        // for(int i : arr){
        //     switch(i){
        //         case 1: count1++; break;
        //         case 2: count2++; break;
        //         case 3: count3++; break;
        //         case 4: count4++; break;
        //         case 5: count5++; break;
                
        //     }

        // }

        // list.add(count1);
        // list.add(count2);
        // list.add(count3);
        // list.add(count4);
        // list.add(count5);

        

        // System.out.println(Collections.max(list));
        
        
    }
}
