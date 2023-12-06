package day6;

import java.util.LinkedList;
import java.util.List;

public class Race {

    private Long time;

    private Long distance;

    public Race(Long time, Long distance) {
        this.time = time;
        this.distance = distance;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getDistance() {
        return distance;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    public long[] calculateWinningHoldButtonTimes(Race race) {
        long distanceRecord = race.getDistance();
        long timeLimit = race.getTime();

        List<Long> holdTimes = new LinkedList<>();

        for (long i = 1; i < timeLimit; i++) {
            if ((timeLimit - i) * i > distanceRecord) {
                holdTimes.add(i);
            }
        }

        return holdTimes.stream().mapToLong(v -> v).toArray();
    }
}
