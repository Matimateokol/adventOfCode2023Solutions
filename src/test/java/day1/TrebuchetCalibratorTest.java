package day1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrebuchetCalibratorTest {

    List<String> sampleData = new ArrayList<>();

    @BeforeAll
    private void prepareTestData() {
        sampleData.add("1abc2");
        sampleData.add("pqr3stu8vwx");
        sampleData.add("a1b2c3d4e5f");
        sampleData.add("treb7uchet");
    }

    @Test
    void parseStringInput() {
    }

    @Test
    void findFirstDigitInString() {
    }

    @Test
    void findLastDigitInString() {
    }
}