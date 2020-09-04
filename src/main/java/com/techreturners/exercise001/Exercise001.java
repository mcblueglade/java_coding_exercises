package com.techreturners.exercise001;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0)); 
    }

    public double addVat(double originalPrice, double vatRate) {
        return Double.parseDouble(String.format("%.2f", originalPrice * (1 + (vatRate / 100))));
    }

    public String reverse(String sentence) {

        String reversed="";
        String[] words = sentence.split(" ");
                
        List<String> reversedWords = new ArrayList<String>();
        reversedWords = Arrays.asList(words);
        
        Collections.reverse(reversedWords);
        
        Iterator strIterator = reversedWords.iterator();
        while (strIterator.hasNext()){
            reversed += new StringBuilder(strIterator.next().toString()).reverse().toString();
            if (strIterator.hasNext()) {
                reversed += " ";
            }
        }

        return reversed;
    }

    public int countLinuxUsers(List<User> users) {
        return 0;
    }
}
