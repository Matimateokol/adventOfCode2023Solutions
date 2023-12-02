package day1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActualTrebuchetCalibratorTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void parseStringInput() {
        Integer parsedStringInput = ActualTrebuchetCalibrator.parseStringInput("two1nine");
        assertEquals( 29, parsedStringInput);

        parsedStringInput = ActualTrebuchetCalibrator.parseStringInput("eightwothree");
        assertEquals( 83, parsedStringInput);

        parsedStringInput = ActualTrebuchetCalibrator.parseStringInput("abcone2threexyz");
        assertEquals(13, parsedStringInput);

        parsedStringInput = ActualTrebuchetCalibrator.parseStringInput("xtwone3four");
        assertEquals( 24, parsedStringInput);

        parsedStringInput = ActualTrebuchetCalibrator.parseStringInput("4nineeightseven2");
        assertEquals( 42, parsedStringInput);

        parsedStringInput = ActualTrebuchetCalibrator.parseStringInput("zoneight234");
        assertEquals( 14, parsedStringInput);

        parsedStringInput = ActualTrebuchetCalibrator.parseStringInput("7pqrstsixteen");
        assertEquals( 76, parsedStringInput);
    }

    @Test
    void findFirstDigitInString() {
        Integer firstDigit = ActualTrebuchetCalibrator.findFirstDigitInString("two1nine");
        assertEquals( 2, firstDigit);

        firstDigit = ActualTrebuchetCalibrator.findFirstDigitInString("eightwothree");
        assertEquals( 8, firstDigit);

        firstDigit = ActualTrebuchetCalibrator.findFirstDigitInString("abcone2threexyz");
        assertEquals(1, firstDigit);

        firstDigit = ActualTrebuchetCalibrator.findFirstDigitInString("xtwone3four");
        assertEquals( 2, firstDigit);

        firstDigit = ActualTrebuchetCalibrator.findFirstDigitInString("4nineeightseven2");
        assertEquals( 4, firstDigit);

        firstDigit = ActualTrebuchetCalibrator.findFirstDigitInString("zoneight234");
        assertEquals( 1, firstDigit);

        firstDigit = ActualTrebuchetCalibrator.findFirstDigitInString("7pqrstsixteen");
        assertEquals( 7, firstDigit);
    }

    @Test
    void findLastDigitInString() {
        Integer lastDigit = ActualTrebuchetCalibrator.findLastDigitInString("two1nine");
        assertEquals( 9, lastDigit);

        lastDigit = ActualTrebuchetCalibrator.findLastDigitInString("eightwothree");
        assertEquals( 3, lastDigit);

        lastDigit = ActualTrebuchetCalibrator.findLastDigitInString("abcone2threexyz");
        assertEquals(3, lastDigit);

        lastDigit = ActualTrebuchetCalibrator.findLastDigitInString("xtwone3four");
        assertEquals( 4, lastDigit);

        lastDigit = ActualTrebuchetCalibrator.findLastDigitInString("4nineeightseven2");
        assertEquals( 2, lastDigit);

        lastDigit = ActualTrebuchetCalibrator.findLastDigitInString("zoneight234");
        assertEquals( 4, lastDigit);

        lastDigit = ActualTrebuchetCalibrator.findLastDigitInString("7pqrstsixteen");
        assertEquals( 6, lastDigit);
    }
}