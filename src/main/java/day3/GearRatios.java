package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class GearRatios {

//    public static Integer[] findNumberPartsInSchema(String schema) {
//        return new Integer[]{};
//    }

    public static int[] extractAllNumbersInSchema(String schema) {

        List<Integer> numbers = new ArrayList<>();

        Pattern integerPattern = Pattern.compile("\\d+");
        Matcher matcher = integerPattern.matcher(schema);

        while (matcher.find()) {
            numbers.add( Integer.parseInt( matcher.group() ) );
        }

        return numbers.stream().mapToInt(v -> v).toArray();
    }

    public static int[] extractNoPartNumbersFromSchema(String schema) {
        Scanner sc = new Scanner(schema);


        String[] upcomingLine = sc.nextLine().split("");
        String[] midLine = new String[upcomingLine.length];
        String[] previousLine = new String[upcomingLine.length];
        Arrays.fill(midLine, ".");


        while(sc.hasNext()) {
            previousLine = midLine;
            midLine = upcomingLine;
            upcomingLine = sc.nextLine().split("");

        }

        return new int[]{};
    }

    public static int[] checkLineForNoPartNumbers(String[] previousLine, String[] midLine, String[] upcomingLine) {
        List<Integer> noPartNumbers = new ArrayList<>();

        for (int i = 0; i < midLine.length; i++) {
            if ( Character.isDigit( midLine[i].charAt(0) ) ) {
                if (i == 0) {
                    if (previousLine[i] != "." || previousLine[i+1] != "." || upcomingLine[i] != "." || upcomingLine[i+1] != ".") {
                        // save index of digit
                    }
                } else if (i == midLine.length - 1) {

                } else {

                }
            } else {
                continue;
            }

            noPartNumbers.add();
        }
        return new int[]{};
    }
}
