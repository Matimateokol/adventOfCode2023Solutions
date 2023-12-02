package day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //\\//\\//\\//\\//\\ Part 1
        File dataSource = new File("src\\main\\resources\\dataInputs\\day1-dataInput.txt");
        Scanner sc = new Scanner(dataSource);

        Integer totalSum = 0;
        String nextLine = "start0";
        int lineParsingResult = TrebuchetCalibrator.parseStringInput(nextLine);
        while (sc.hasNext()) {
            nextLine = sc.nextLine();
            lineParsingResult = TrebuchetCalibrator.parseStringInput(nextLine);

            if (lineParsingResult >= 0) {
                totalSum += lineParsingResult;
            }

        }

        System.out.println(totalSum);

        //\\//\\//\\//\\//\\ Part 2
        dataSource = new File("src\\main\\resources\\dataInputs\\day1-dataInput.txt");
        sc = new Scanner(dataSource);

        totalSum = 0;
        nextLine = "start0";
        lineParsingResult = ActualTrebuchetCalibrator.parseStringInput(nextLine);
        while (sc.hasNext()) {
            nextLine = sc.nextLine();
            lineParsingResult = ActualTrebuchetCalibrator.parseStringInput(nextLine);

            if (lineParsingResult >= 0) {
                totalSum += lineParsingResult;
            }

        }

        System.out.println(totalSum);
    }
}