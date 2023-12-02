package day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //\\//\\//\\//\\//\\ Part 1
        File dataSource = new File("src\\main\\resources\\dataInputs\\day2-dataInput.txt");
        Scanner sc = new Scanner(dataSource);

        int idSum = 0;

        while(sc.hasNext()) {
            String nextLine = sc.nextLine();

            if (CubeConundrum.checkIfGamePossible(nextLine)) {
                idSum += CubeConundrum.extractGameId(nextLine);
            }
        }

        System.out.println(idSum);

        //\\//\\//\\//\\//\\ Part 2

        dataSource = new File("src\\main\\resources\\dataInputs\\day2-dataInput.txt");
        sc = new Scanner(dataSource);

        idSum = 0;

        while(sc.hasNext()) {
            String nextLine = sc.nextLine();
            Integer[] cubesCombination = CubeConundrum.findCombinationOfMinCubesForGame(nextLine);
            idSum += CubeConundrum.calculatePowerOfNumbersFromCubeCounts(cubesCombination);
        }

        System.out.println(idSum);
    }
}