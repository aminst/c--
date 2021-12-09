package main;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CmmErrors {
    public static Set<String> errors = new HashSet<>();

    public static void addError(String error) {
        errors.add(error);
    }

    public static void printErrors() {
        TreeSet<String> treeSet = new TreeSet<String>(errors);
        for (String error: treeSet)
            System.out.println(error);
    }

    public static boolean hasErrors() {
        return errors.size() != 0;
    }
}
