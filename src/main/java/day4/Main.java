package day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //\\//\\//\\//\\//\\ Part 1
        File dataSource = new File("src\\main\\resources\\dataInputs\\day4-dataInput.txt");
        Scanner sc = new Scanner(dataSource);

        Scratchcards scratchcards = new Scratchcards();
        List<Integer> scoredPoints = new ArrayList<>();

        while(sc.hasNext()) {
            String nextCardInput = sc.nextLine();

            List<Integer> winningNumbers = scratchcards.extractWinningNumbers(nextCardInput);
            List<Integer> scratchedNumbers = scratchcards.extractScratchedNumbers(nextCardInput);
            scoredPoints.add( scratchcards.calculatePointsForCard(winningNumbers, scratchedNumbers) );
        }

        System.out.println(scratchcards.calculateTotalPoints(scoredPoints));

        //\\//\\//\\//\\//\\ Part 2
        dataSource = new File("src\\main\\resources\\dataInputs\\day4-dataInput.txt");
        sc = new Scanner(dataSource);

        System.out.println("TODO: solve part2");
    }
}