package com.example;

import org.apache.commons.text.StringSubstitutor;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Safe method only.");
        safeMethod();
    }

    public static void safeMethod() {
        System.out.println("No vulnerability here.");
    }

    // ❌ DEAD CODE: This method is never called
    public static void vulnerableDeadCode() {
        StringSubstitutor substitutor = new StringSubstitutor();
        String result = substitutor.replace("Dangerous ${code} here");
        System.out.println(result);
    }
}
