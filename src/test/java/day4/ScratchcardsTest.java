package day4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ScratchcardsTest {

    public static String testInput;
    public static List<List<Integer>> winningCombinations = new ArrayList<>();
    public static List<List<Integer>> scratchedCombinations = new ArrayList<>();

    @BeforeAll
    static void setTestInput() {
        testInput = """
                Card 1: 41 48 83 86 17 | 83 86  6 31 17  9 48 53
                Card 2: 13 32 20 16 61 | 61 30 68 82 17 32 24 19
                Card 3:  1 21 53 59 44 | 69 82 63 72 16 21 14  1
                Card 4: 41 92 73 84 69 | 59 84 76 51 58  5 54 83
                Card 5: 87 83 26 28 32 | 88 30 70 12 93 22 82 36
                Card 6: 31 18 13 56 72 | 74 77 10 23 35 67 36 11
                """;

        winningCombinations.add(Arrays.asList(new Integer[]{41, 48, 83, 86, 17}));
        winningCombinations.add(Arrays.asList(new Integer[]{13, 32, 20, 16, 61}));
        winningCombinations.add(Arrays.asList(new Integer[]{1, 21, 53, 59, 44}));
        winningCombinations.add(Arrays.asList(new Integer[]{41, 92, 73, 84, 69}));
        winningCombinations.add(Arrays.asList(new Integer[]{87, 83, 26, 28, 32}));
        winningCombinations.add(Arrays.asList(new Integer[]{31, 18, 13, 56, 72}));

        scratchedCombinations.add(Arrays.asList(new Integer[]{83, 86, 6, 31, 17, 9, 48, 53}));
        scratchedCombinations.add(Arrays.asList(new Integer[]{61, 30, 68, 82, 17, 32, 24, 19}));
        scratchedCombinations.add(Arrays.asList(new Integer[]{69, 82, 63, 72, 16, 21, 14, 1}));
        scratchedCombinations.add(Arrays.asList(new Integer[]{59, 84, 76, 51, 58, 5, 54, 83}));
        scratchedCombinations.add(Arrays.asList(new Integer[]{88, 30, 70, 12, 93, 22, 82, 36}));
        scratchedCombinations.add(Arrays.asList(new Integer[]{74, 77, 10, 23, 35, 67, 36, 11}));
    }

    @Test
    void extractWinningNumbers() {

        // Arrange
        Scratchcards scratchcards = new Scratchcards();
        List<Integer> expectedNumbers = new ArrayList<>();
        expectedNumbers.addAll(winningCombinations.get(0));
        // Act
        List<Integer> winningNumbers = scratchcards.extractWinningNumbers("Card 1: 41 48 83 86 17 | 83 86  6 31 17  9 48 53");
        // Assert
        assertIterableEquals(expectedNumbers, winningNumbers);

        // Arrange
        expectedNumbers = new ArrayList<>();
        expectedNumbers.addAll(winningCombinations.get(1));
        // Act
        winningNumbers = scratchcards.extractWinningNumbers("Card 2: 13 32 20 16 61 | 61 30 68 82 17 32 24 19");
        // Assert
        assertIterableEquals(expectedNumbers, winningNumbers);

        // Arrange
        expectedNumbers = new ArrayList<>();
        expectedNumbers.addAll(winningCombinations.get(2));
        // Act
        winningNumbers = scratchcards.extractWinningNumbers("Card 3:  1 21 53 59 44 | 69 82 63 72 16 21 14  1");
        // Assert
        assertIterableEquals(expectedNumbers, winningNumbers);

        // Arrange
        expectedNumbers = new ArrayList<>();
        expectedNumbers.addAll(winningCombinations.get(3));
        // Act
        winningNumbers = scratchcards.extractWinningNumbers("Card 4: 41 92 73 84 69 | 59 84 76 51 58  5 54 83");
        // Assert
        assertIterableEquals(expectedNumbers, winningNumbers);

        // Arrange
        expectedNumbers = new ArrayList<>();
        expectedNumbers.addAll(winningCombinations.get(4));
        // Act
        winningNumbers = scratchcards.extractWinningNumbers("Card 5: 87 83 26 28 32 | 88 30 70 12 93 22 82 36");
        // Assert
        assertIterableEquals(expectedNumbers, winningNumbers);

        // Arrange
        expectedNumbers = new ArrayList<>();
        expectedNumbers.addAll(winningCombinations.get(5));
        // Act
        winningNumbers = scratchcards.extractWinningNumbers("Card 6: 31 18 13 56 72 | 74 77 10 23 35 67 36 11");
        // Assert
        assertIterableEquals(expectedNumbers, winningNumbers);
    }

    @Test
    void extractScratchedNumbers() {

        // Arrange
        Scratchcards scratchcards = new Scratchcards();
        List<Integer> expectedNumbers = new ArrayList<>();
        expectedNumbers.addAll(scratchedCombinations.get(0));
        // Act
        List<Integer> scratchedNumbers = scratchcards.extractScratchedNumbers("Card 1: 41 48 83 86 17 | 83 86  6 31 17  9 48 53");
        // Assert
        assertIterableEquals(expectedNumbers, scratchedNumbers);

        // Arrange
        expectedNumbers = new ArrayList<>();
        expectedNumbers.addAll(scratchedCombinations.get(1));
        // Act
        scratchedNumbers = scratchcards.extractScratchedNumbers("Card 2: 13 32 20 16 61 | 61 30 68 82 17 32 24 19");
        // Assert
        assertIterableEquals(expectedNumbers, scratchedNumbers);

        // Arrange
        expectedNumbers = new ArrayList<>();
        expectedNumbers.addAll(scratchedCombinations.get(2));
        // Act
        scratchedNumbers = scratchcards.extractScratchedNumbers("Card 3:  1 21 53 59 44 | 69 82 63 72 16 21 14  1");
        // Assert
        assertIterableEquals(expectedNumbers, scratchedNumbers);

        // Arrange
        expectedNumbers = new ArrayList<>();
        expectedNumbers.addAll(scratchedCombinations.get(3));
        // Act
        scratchedNumbers = scratchcards.extractScratchedNumbers("Card 4: 41 92 73 84 69 | 59 84 76 51 58  5 54 83");
        // Assert
        assertIterableEquals(expectedNumbers, scratchedNumbers);

        // Arrange
        expectedNumbers = new ArrayList<>();
        expectedNumbers.addAll(scratchedCombinations.get(4));
        // Act
        scratchedNumbers = scratchcards.extractScratchedNumbers("Card 5: 87 83 26 28 32 | 88 30 70 12 93 22 82 36");
        // Assert
        assertIterableEquals(expectedNumbers, scratchedNumbers);

        // Arrange
        expectedNumbers = new ArrayList<>();
        expectedNumbers.addAll(scratchedCombinations.get(5));
        // Act
        scratchedNumbers = scratchcards.extractScratchedNumbers("Card 6: 31 18 13 56 72 | 74 77 10 23 35 67 36 11");
        // Assert
        assertIterableEquals(expectedNumbers, scratchedNumbers);
    }

    @Test
    void calculatePointsForCard() {

        Scratchcards scratchcards = new Scratchcards();
        List<Integer> winningNumbers = new ArrayList<>();
        List<Integer> scratchedNumbers = new ArrayList<>();

        winningNumbers.addAll(winningCombinations.get(0));
        scratchedNumbers.addAll(scratchedCombinations.get(0));
        Integer scoredPoints = scratchcards.calculatePointsForCard(winningNumbers, scratchedNumbers);
        Integer expectedPoints = 8;

        assertEquals(expectedPoints, scoredPoints);

        winningNumbers.clear();
        scratchedNumbers.clear();
        winningNumbers.addAll(winningCombinations.get(1));
        scratchedNumbers.addAll(scratchedCombinations.get(1));
        scoredPoints = scratchcards.calculatePointsForCard(winningNumbers, scratchedNumbers);
        expectedPoints = 2;

        assertEquals(expectedPoints, scoredPoints);

        winningNumbers.clear();
        scratchedNumbers.clear();
        winningNumbers.addAll(winningCombinations.get(2));
        scratchedNumbers.addAll(scratchedCombinations.get(2));
        scoredPoints = scratchcards.calculatePointsForCard(winningNumbers, scratchedNumbers);
        expectedPoints = 2;

        assertEquals(expectedPoints, scoredPoints);

        winningNumbers.clear();
        scratchedNumbers.clear();
        winningNumbers.addAll(winningCombinations.get(3));
        scratchedNumbers.addAll(scratchedCombinations.get(3));
        scoredPoints = scratchcards.calculatePointsForCard(winningNumbers, scratchedNumbers);
        expectedPoints = 1;

        assertEquals(expectedPoints, scoredPoints);

        winningNumbers.clear();
        scratchedNumbers.clear();
        winningNumbers.addAll(winningCombinations.get(4));
        scratchedNumbers.addAll(scratchedCombinations.get(4));
        scoredPoints = scratchcards.calculatePointsForCard(winningNumbers, scratchedNumbers);
        expectedPoints = 0;

        assertEquals(expectedPoints, scoredPoints);

        winningNumbers.clear();
        scratchedNumbers.clear();
        winningNumbers.addAll(winningCombinations.get(5));
        scratchedNumbers.addAll(scratchedCombinations.get(5));
        scoredPoints = scratchcards.calculatePointsForCard(winningNumbers, scratchedNumbers);
        expectedPoints = 0;

        assertEquals(expectedPoints, scoredPoints);
    }

    @Test
    void calculateTotalPoints() {
        Scratchcards scratchcards = new Scratchcards();
        assertEquals(13, scratchcards.calculateTotalPoints(Arrays.asList(new Integer[]{8, 2, 2, 1, 0, 0})));
    }
}