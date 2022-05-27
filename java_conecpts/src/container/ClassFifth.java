package container;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ClassFifth {


    public static void main(String[] args) {


        for (int i=0; i<=10; i++){
            System.out.println(i);
        }




      /*  ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Manish");
        arrayList.add("Rakesh");
        arrayList.add("Sandeep");

      //  arrayList.add(2, "Ravi");
       // System.out.println(arrayList.get(3));
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("ab");
        arrayList1.add("cd");
        arrayList1.add("ef");
        arrayList.addAll(1, arrayList1);
        System.out.println(arrayList.equals(arrayList1));
        System.out.println(arrayList);*/
        setCollection();






    }


    public static void setCollection(){
        //because in set values are not stored on indexes
        Set<String> set= new HashSet<>();
        set.add("ass");
        set.add("dsfsdf");
        set.add("sdfdsf");
        set.add("rtet");
        System.out.println(set);


        for (String s: set) {
            System.out.println(s);
        }
    }
}
