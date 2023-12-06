package day6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RaceTest {

    @Test
    void calculateWinningHoldButtonTimes() {
        Race race = new Race(7L, 9L);
        assertArrayEquals(new long[]{ 2, 3, 4, 5 }, race.calculateWinningHoldButtonTimes(race));

        race = new Race(15L, 40L);
        assertArrayEquals(new long[]{ 4, 5, 6, 7, 8, 9, 10, 11 }, race.calculateWinningHoldButtonTimes(race));

        race = new Race(30L, 200L);
        assertArrayEquals(new long[]{ 11, 12, 13, 14, 15, 16, 17, 18, 19 }, race.calculateWinningHoldButtonTimes(race));
    }
}