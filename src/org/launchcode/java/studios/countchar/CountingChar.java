package org.launchcode.java.studios.countchar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter new word: ");
        String word = input.nextLine();
        char[] stringChars = word.toCharArray();
        HashMap<Character, Integer> charCountsMap = new HashMap<>();
        for (char oneLetter: stringChars) {
            if (charCountsMap.containsKey(oneLetter)){
                Integer count = charCountsMap.get(oneLetter) + 1;
                charCountsMap.put(oneLetter, count);
            } else if (Character.isLetter(oneLetter)) {
                charCountsMap.put(oneLetter, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry: charCountsMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }



}
