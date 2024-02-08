package cw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Interval {

public static int sumIntervals(int[][] intervals) {
  if (intervals == null || intervals.length == 0) {
        return 0;
    }
        // Sort intervals based on their start points
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));

        List<int[]> mergedIntervals = new ArrayList<>();
        mergedIntervals.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] current = intervals[i];
            int[] lastMerged = mergedIntervals.get(mergedIntervals.size() - 1);

            if (current[0] <= lastMerged[1]) {
                // Overlapping intervals, merge them
                lastMerged[1] = Math.max(lastMerged[1], current[1]);
            } else {
                // Non-overlapping interval, add to the merged intervals list
                mergedIntervals.add(current);
            }
        }

        int sum = 0;
        for (int[] interval : mergedIntervals) {
            sum += interval[1] - interval[0];
        }

        return sum;
    }
}
