package dynamicarrays;

import java.util.ArrayList;

public class DynamicArrays {

    public static void main(String[] args) {
        ArrayList<String> nameList;
        nameList = new ArrayList<>();
        
        nameList.add("Jerry");
        nameList.add("Terry");
        nameList.add("Evelyn");
        
        System.out.printf("list has %d items in it\n", nameList.size());        
        System.out.printf("Item at index 0 is %s\n", nameList.get(0));
        
        nameList.remove(0); // Remove "Jerry"
        
        System.out.printf("list has %d items in it\n", nameList.size());        
        System.out.printf("Item at index 0 is %s\n", nameList.get(0));
        
        for (String name : nameList) {
            System.out.println("Name is: " + name);
        }
        
        for (int i=0; i<nameList.size(); i++) {
            System.out.printf("Name #%d is: %s\n", i, nameList.get(i));
        }
        
    }
    
}
