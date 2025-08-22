package javatopic.day10_collections_set.exercises;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> emailList=new HashSet<>();
        emailList.add("raj@company.com");
        emailList.add("priya@company.com");
        emailList.add("amiti@company.com");
       // emailList.add("raj@company.com");
        emailList.add("zara@company.com");
        System.out.println(emailList);
        emailList.remove("raj@company.com");
        emailList.remove("priya@company.com");
        System.out.println("after removing ");
        System.out.println(emailList);

        for(String email:emailList){
            System.out.println(email);
        }

        Set<String> linkedHashEmail=new LinkedHashSet<>();
        linkedHashEmail.add("raj@company.com");
        linkedHashEmail.add("priya@company.com");
        linkedHashEmail.add("amiti@company.com");
        linkedHashEmail.add("raj@company.com");
        linkedHashEmail.add("zara@company.com");
        System.out.println("using linked hashset:"+linkedHashEmail);

       // TreeSet<String> treeSetEmail=new TreeSet<>();
        //treeSetEmail.addAll(emailList);
       // System.out.println("using tree set:"+treeSetEmail);


        // removing raj email from set
        emailList.remove("raj@company.com");
        emailList.remove("priya@company.com");
        linkedHashEmail.remove("raj@company.com");
      //  treeSetEmail.remove("raj@company");
        System.out.println("remove raj from set:"+emailList);
        System.out.println("remove raj from linked set:"+linkedHashEmail);
       // System.out.println("remove raj from tree set:"+treeSetEmail);

// demo with integer
        System.out.println("------------------------------------");
        Set<Integer> integerSet = new HashSet<>();

        //Set
        // no order
        // not sorted
        // no duplicates [at any given point of time]
        // Create
        integerSet.add(6);
        integerSet.add(3);
        integerSet.add(99);
        integerSet.add(11);
        System.out.println("6 got inserted ? :" + integerSet.add(6));
        System.out.println(integerSet);

        // read
        for (Integer data : integerSet) {
            System.out.println(data);
        }
        //
        System.out.println("Set contains 100 ?" + integerSet.contains(100));
        // Update i.e remove and add new element
        integerSet.remove(99);
        System.out.println(integerSet);
        integerSet.add(199);
        System.out.println(integerSet);
        // delete
        integerSet.remove(3);
        System.out.println(integerSet);

    }
}
