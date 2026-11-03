import java.util.Arrays;

class Solution {
public int minMeetingRooms(int[] start, int[] end) {


    Arrays.sort(start);
    Arrays.sort(end);

    int i = 0, j = 0;
    int rooms = 0;
    int maxRooms = 0;

    while (i < start.length) {

        if (start[i] < end[j]) {
            rooms++;
            i++;
        }
        else {
            rooms--;
            j++;
        }

        maxRooms = Math.max(maxRooms, rooms);
    }

    return maxRooms;
}


}
