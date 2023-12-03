package day3;

import day2.CubeConundrum;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //\\//\\//\\//\\//\\ Part 1
        File dataSource = new File("src\\main\\resources\\dataInputs\\day3-dataInput.txt");
        Scanner sc = new Scanner(dataSource);

        int partNumberSum = 0;

        while(sc.hasNext()) {
            String nextLine = sc.nextLine();

        }

        System.out.println(partNumberSum);
    }
}