package day4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Scratchcards {

    public List<Integer> extractWinningNumbers(String cardInput) {

        int startIndex = cardInput.indexOf(":") + 1;
        int stopIndex = cardInput.indexOf("|");

        String winningNumbersPart = cardInput.substring(startIndex, stopIndex);
        List<Integer> winningNumbers = Arrays
                .stream(winningNumbersPart.split(" "))
                .filter(v -> v != " " && v != "")
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        return winningNumbers;
    }

    public List<Integer> extractScratchedNumbers(String cardInput) {

        int startIndex = cardInput.indexOf('|') + 1;
        int stopIndex = cardInput.length();

        String scratchedNumbersPart = cardInput.substring(startIndex, stopIndex);
        List<Integer> scratchedNumbers = Arrays
                .stream(scratchedNumbersPart.split(" "))
                .filter(v -> v != " " && v != "")
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        return scratchedNumbers;
    }

    public Integer calculatePointsForCard(List<Integer> winningNumbers, List<Integer> scratchedNumbers) {
        int hitNumbers = (int) scratchedNumbers.stream().filter(v -> winningNumbers.contains(v)).count();

        return hitNumbers == 0 ? 0 : (int) Math.pow(2, hitNumbers - 1);
    }

    public Integer calculateTotalPoints(List<Integer> scoredPoints) {

        return scoredPoints.stream().reduce(0, (subtotal, element) -> subtotal + element);
    }
}
