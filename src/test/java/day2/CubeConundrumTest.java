package day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CubeConundrumTest {

    @Test
    void checkIfGamePossible() {

        boolean isGamePossible = CubeConundrum.checkIfGamePossible("Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green");
        assertTrue(isGamePossible);

        isGamePossible = CubeConundrum.checkIfGamePossible("Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue");
        assertTrue(isGamePossible);

        isGamePossible = CubeConundrum.checkIfGamePossible("Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red");
        assertFalse(isGamePossible);

        isGamePossible = CubeConundrum.checkIfGamePossible("Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red");
        assertFalse(isGamePossible);

        isGamePossible = CubeConundrum.checkIfGamePossible("Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green");
        assertTrue(isGamePossible);
    }

    @Test
    void extractGameId() {

        int gameId = CubeConundrum.extractGameId("Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green");
        assertEquals(1, gameId);

        gameId = CubeConundrum.extractGameId("Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue");
        assertEquals(2, gameId);

        gameId = CubeConundrum.extractGameId("Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red");
        assertEquals(3, gameId);

        gameId = CubeConundrum.extractGameId("Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red");
        assertEquals(4, gameId);

        gameId = CubeConundrum.extractGameId("Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green");
        assertEquals(5, gameId);
    }

    @Test
    void findCombinationOfMinCubesForGame() {
    }

    @Test
    void calculatePowerOfNumbersFromCubeCounts() {
    }
}