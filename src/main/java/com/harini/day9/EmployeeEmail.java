package com.harini.day9;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeEmail {
    public static void main(String[] args) {
        Set<String> emailSet = new HashSet<String>();

        emailSet.add("meena22@gmail.com");
        emailSet.add("bindu01@gmail.com");
        emailSet.add("rathu06@gmail.com");
        emailSet.add("harini21@gmail.com");
        emailSet.add("zoya@gmail.com");
        System.out.println(emailSet);
        Set<String> emailLinkedSet = new LinkedHashSet<String>(emailSet);
        System.out.println(emailLinkedSet);
        Set<String> emailTreeSet = new TreeSet<String>(emailSet);
        System.out.println(emailTreeSet);
        System.out.println(emailSet.contains("bindu01@gmail.com"));
        System.out.println(emailLinkedSet.contains("bindu01@gmail.com"));
        System.out.println(emailTreeSet.contains("bindu01@gmail.com"));
        emailSet.remove("rathu06@gmail.com");
        System.out.println(emailSet);
        emailLinkedSet.remove("rathu06@gmail.com");
        System.out.println(emailLinkedSet);
        emailTreeSet.remove("rathu06@gmail.com");
        System.out.println(emailTreeSet);
    }
}
