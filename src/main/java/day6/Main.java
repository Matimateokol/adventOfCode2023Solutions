package day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //\\//\\//\\//\\//\\ Part 1
        File dataSource = new File("src\\main\\resources\\dataInputs\\day6-dataInput.txt");
        Scanner sc = new Scanner(dataSource);

        List<Race> races = new ArrayList<>();
        long[] times = Arrays.stream(sc.nextLine().split("\s+")).skip(1L).mapToLong(Long::parseLong).toArray();
        long[] distances = Arrays.stream(sc.nextLine().split("\s+")).skip(1L).mapToLong(Long::parseLong).toArray();

        for (int i = 0; i < times.length; i++) {
            races.add(new Race(times[i], distances[i]));
        }

        long resultPart1 = races.stream()
                .mapToLong( race -> race.calculateWinningHoldButtonTimes(race).length )
                .reduce(1, (subval, val) -> subval * val );

        System.out.println(resultPart1);

        //\\//\\//\\//\\//\\ Part 2

        long timeLimit = Long.parseLong(
                Arrays.stream(times).mapToObj(v -> String.valueOf(v)).reduce("", (subval, val) -> subval + val)
        );
        long distanceTarget = Long.parseLong(
                Arrays.stream(distances).mapToObj(v -> String.valueOf(v)).reduce("", (subval, val) -> subval + val)
        );

        Race finalRace = new Race(timeLimit, distanceTarget);

        long resultPart2 = finalRace.calculateWinningHoldButtonTimes(finalRace).length;

        System.out.println(resultPart2);
    }
}