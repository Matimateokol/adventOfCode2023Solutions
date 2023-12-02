package day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ActualTrebuchetCalibrator extends TrebuchetCalibrator {

    public static Map<String, Integer> DIGITS_IN_WORDS = new HashMap<>();

    static {
        DIGITS_IN_WORDS.put("zero", 0);
        DIGITS_IN_WORDS.put("one", 1);
        DIGITS_IN_WORDS.put("two", 2);
        DIGITS_IN_WORDS.put("three", 3);
        DIGITS_IN_WORDS.put("four", 4);
        DIGITS_IN_WORDS.put("five", 5);
        DIGITS_IN_WORDS.put("six", 6);
        DIGITS_IN_WORDS.put("seven", 7);
        DIGITS_IN_WORDS.put("eight", 8);
        DIGITS_IN_WORDS.put("nine", 9);
        DIGITS_IN_WORDS.put("ten", 10);
        DIGITS_IN_WORDS.put("eleven", 11);
        DIGITS_IN_WORDS.put("twelve", 12);
        DIGITS_IN_WORDS.put("thirteen", 13);
        DIGITS_IN_WORDS.put("fourteen", 14);
        DIGITS_IN_WORDS.put("fifteen", 15);
        DIGITS_IN_WORDS.put("sixteen", 16);
        DIGITS_IN_WORDS.put("seventeen", 17);
        DIGITS_IN_WORDS.put("eighteen", 18);
        DIGITS_IN_WORDS.put("nineteen", 19);
        DIGITS_IN_WORDS.put("twenty", 20);
        DIGITS_IN_WORDS.put("thirty", 30);
        DIGITS_IN_WORDS.put("forty", 40);
        DIGITS_IN_WORDS.put("fifty", 50);
        DIGITS_IN_WORDS.put("sixty", 60);
        DIGITS_IN_WORDS.put("seventy", 70);
        DIGITS_IN_WORDS.put("eighty", 80);
        DIGITS_IN_WORDS.put("ninety", 90);
        DIGITS_IN_WORDS.put("hundred", 100);
        DIGITS_IN_WORDS.put("thousand", 1_000);
        DIGITS_IN_WORDS.put("million", 1_000_000);
        DIGITS_IN_WORDS.put("billion", 1_000_000_000);
    }

    public static Integer parseStringInput(String lineInput) {
        String digit1 = String.valueOf(findFirstDigitInString(lineInput));
        String digit2 = String.valueOf(findLastDigitInString(lineInput));

        return Integer.parseInt(digit1 + digit2);
    }

    public static Integer findFirstDigitInString(String s) {
        int firstIndexOfDigitAsNum = -1;
        Integer firstNumber = 0;

        Iterator<String> it = Arrays.stream(s.split("")).iterator();
        while(it.hasNext()) {
            firstIndexOfDigitAsNum++;
            it.next();
            if(Character.isDigit(s.charAt(firstIndexOfDigitAsNum))) {
                firstNumber = Integer.parseInt(s.substring(firstIndexOfDigitAsNum, firstIndexOfDigitAsNum+1));
                break;
            }
        }

        for (Map.Entry<String, Integer> entry : DIGITS_IN_WORDS.entrySet()) {
            if (s.contains(entry.getKey())) {
                int index = s.indexOf(entry.getKey());
                if (firstIndexOfDigitAsNum > index) {
                    firstIndexOfDigitAsNum = index;
                    firstNumber = entry.getValue();
                }
            }
        }

        return firstNumber % 10;
    }

    public static Integer findLastDigitInString(String s) {
        int lastIndexOfDigitAsNum = -1;
        Integer lastNumber = 1;

        for (int i = s.length()-1 ; i >= 0 ; i--) {
            if(Character.isDigit(s.charAt(i))) {
                lastIndexOfDigitAsNum = i;
                lastNumber = Integer.parseInt(s.substring(i, i+1));
                break;
            }
        }

        for (Map.Entry<String, Integer> entry : DIGITS_IN_WORDS.entrySet()) {
            if (s.contains(entry.getKey())) {
                int index = s.lastIndexOf(entry.getKey());
                if (index > lastIndexOfDigitAsNum) {
                    lastIndexOfDigitAsNum = index;
                    lastNumber = entry.getValue();
                }
            }
        }

        return lastNumber % 10;
    }
}
