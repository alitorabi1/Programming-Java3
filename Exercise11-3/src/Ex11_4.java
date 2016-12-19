import java.util.ArrayList;
import java.util.Collections;

public class Ex11_4 {

    /*
    Write the following method that returns the
    maximum value in an ArrayList of integers. The method returns null if the
    list is null or the list size is 0.
     */
    public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> noDuplicates = new ArrayList<>();
        for (Integer i : list) {
            if (!noDuplicates.contains(i)) {
                noDuplicates.add(i);
            }
        }
        return noDuplicates;
    }

    public static Integer max(ArrayList<Integer> list) {
        return (list != null) ? Collections.max(list) : 0;
    }

//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(12);
//        list.add(124);
//        list.add(15462);
//        list.add(124);
//        list.add(21);
//        list.add(1);
//        list.add(12);
//        list.add(345);
//        list.add(345);
//        list.add(1);
//        list.add(12);
//        System.out.printf("Maximum number in array is:%d\n", max(list));
//        System.out.println("Numbers in array after removing douplicate values are:");
//        for (Integer i : removeDuplicate(list))
//            System.out.print(i + ", ");
//    }
}
