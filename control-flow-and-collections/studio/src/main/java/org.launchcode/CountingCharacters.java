

package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

    public class CountingCharacters {
        public static void main(String[] args) {

            HashMap<Character, Integer> characterCount = new HashMap<>();

            Scanner input = new Scanner(System.in);

            System.out.println("Enter the following String: " +
                    "If the product of two terms is zero then common " +
                    "sense says at least one of the two terms has to be zero to start with. " +
                    "So if you move all the terms over to one side, you can put the quadratics " +
                    "into a form that can be factored allowing that side of the equation to equal zero. " +
                    "Once you’ve done that, it’s pretty straightforward from there.");

//        String hiddenFigures = "If the product of two terms is zero then " +
//                "common sense says at least one of the two terms has to be zero to start with. " +
//                "So if you move all the terms over to one side, " +
//                "you can put the quadratics into a form that can be " +
//                "factored allowing that side of the equation to equal zero. " +
//                "Once you’ve done that, " +
//                "it’s pretty straightforward from there.";

            String hiddenFigures= input.nextLine().toLowerCase();
            hiddenFigures = hiddenFigures.replaceAll("[^a-zA-Z0-9]", "");


            for (char c : hiddenFigures.toCharArray()) {
                if (characterCount.containsKey(c)) {
//                c = characterCount.toLowerCase(c);
                    characterCount.put(c, characterCount.get(c) + 1);
                } else {
                    characterCount.put(c, 1);
                }
            }

            for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }


