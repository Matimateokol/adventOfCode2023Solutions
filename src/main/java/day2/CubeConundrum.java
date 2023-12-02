package day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CubeConundrum {

    public final static int RED_CAPACITY = 12;

    public final static int GREEN_CAPACITY = 13;

    public final static int BLUE_CAPACITY = 14;

    public static boolean checkIfGamePossible(String gameDetails) {

        // Example data input:
        // Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green
        // Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue
        // Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red
        // Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red
        // Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green

        Set<Integer> redCubesCounts = new HashSet<>();
        Set<Integer> greenCubesCounts = new HashSet<>();
        Set<Integer> blueCubesCounts = new HashSet<>();

        String regex = "[0-9]?[0-9]\s(?:red|green|blue)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(gameDetails);

        while (matcher.find()) {
            String[] cubeRoll = matcher.group().split(" ");
            Integer cubeCount = Integer.parseInt(cubeRoll[0]);
            switch(cubeRoll[1]) {
                case "red":
                    redCubesCounts.add( cubeCount );
                    break;
                case "blue":
                    blueCubesCounts.add( cubeCount );
                    break;
                case "green":
                    greenCubesCounts.add( cubeCount );
                default:
            }
        }

        boolean isRedCountsOk = redCubesCounts.stream().mapToInt(v -> v)
                .max().orElseThrow(NoSuchElementException::new) <= RED_CAPACITY;

        boolean isGreenCountsOk = greenCubesCounts.stream().mapToInt(v -> v)
                .max().orElseThrow(NoSuchElementException::new) <= GREEN_CAPACITY;

        boolean isBlueCountsOk = blueCubesCounts.stream().mapToInt(v -> v)
                .max().orElseThrow(NoSuchElementException::new) <= BLUE_CAPACITY;

        return isRedCountsOk && isGreenCountsOk && isBlueCountsOk;
    }

    public static Integer extractGameId(String gameDetails) {

        int indexOfSpace = 0;
        int indexOfColon = 0;
        for (int i = 0; i < gameDetails.length(); i++) {
            if(gameDetails.charAt(i) == ' ') indexOfSpace = i;
            if(gameDetails.charAt(i) == ':') {
                indexOfColon = i;
                break;
            }
        }

        Integer gameId = Integer.parseInt(gameDetails.substring(indexOfSpace+1, indexOfColon));

        return gameId;
    }

    public static Integer[] findCombinationOfMinCubesForGame(String gameDetails) {

        Set<Integer> redCubesCounts = new HashSet<>();
        Set<Integer> greenCubesCounts = new HashSet<>();
        Set<Integer> blueCubesCounts = new HashSet<>();

        String regex = "[0-9]?[0-9]\s(?:red|green|blue)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(gameDetails);

        while (matcher.find()) {
            String[] cubeRoll = matcher.group().split(" ");
            Integer cubeCount = Integer.parseInt(cubeRoll[0]);
            switch(cubeRoll[1]) {
                case "red":
                    redCubesCounts.add( cubeCount );
                    break;
                case "blue":
                    blueCubesCounts.add( cubeCount );
                    break;
                case "green":
                    greenCubesCounts.add( cubeCount );
                default:
            }
        }

        int redCount = redCubesCounts.stream().mapToInt(v -> v)
                .max().orElseThrow(NoSuchElementException::new);

        int greenCount = greenCubesCounts.stream().mapToInt(v -> v)
                .max().orElseThrow(NoSuchElementException::new);

        int blueCount = blueCubesCounts.stream().mapToInt(v -> v)
                .max().orElseThrow(NoSuchElementException::new);

        return new Integer[] { redCount, greenCount, blueCount };
    }

    public static Integer calculatePowerOfNumbersFromCubeCounts(Integer[] cubeCountsArray) {
        return Arrays.stream(cubeCountsArray).reduce(1, (subpower, element) -> subpower * element);
    }
}
