package day3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GearRatiosTest {

    static String dataSchema = "";

    @BeforeAll
    static void setUpTestData() {
        dataSchema = """
                467..114..
                ...*......
                ..35..633.
                ......#...
                617*......
                .....+.58.
                ..592.....
                ......755.
                ...$.*....
                .664.598..
                """;
    }

    @Test
    void extractAllNumbersInSchema() {
        int[] extractedNumbers = GearRatios.extractAllNumbersInSchema(dataSchema);
        assertArrayEquals( new int[] { 467, 114, 35, 633, 617, 58, 592, 755, 664, 598 }, extractedNumbers);
    }
}