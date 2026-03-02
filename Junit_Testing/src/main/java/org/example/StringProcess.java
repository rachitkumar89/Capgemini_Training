package org.example;

public class StringProcess {
    public String concatenate(String a , String b){
        if(a==null || b==null){
            throw new IllegalArgumentException("Strings cannot be null");
        }
        return a+b;
    }

    public boolean Ispalindrome(String str){
        if(str==null){
            return false;
        }
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }
}
