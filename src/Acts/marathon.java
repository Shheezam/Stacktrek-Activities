package Acts;

import java.util.Arrays;

class marathon {

    public String convertToWall(long number) {
        String wall = Long.toBinaryString(number);
        int leadingZeros = 64 - wall.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < leadingZeros; i++) {
            sb.append('0');
        }
        sb.append(wall);
        return sb.toString();
    }

    public long convertToNumber(String wall) {
        return Long.parseLong(wall, 2);
    }

    public long generateFixedWall(long numberRepresentation, int repairkits, int[] attackedPlaces) {
        String wall = convertToWall(numberRepresentation);

        for (int place : attackedPlaces) {
            StringBuilder sb = new StringBuilder(wall);
            sb.setCharAt(place, '0');
            wall = sb.toString();
        }

        char[] wallArray = wall.toCharArray();
        int wallLength = wall.length();
        for (int i = wallLength - 1; i >= 1; i--) {
            if (wallArray[i] == '0' && wallArray[i - 1] == '0') {
                if (repairkits > 0) {
                    wallArray[i] = '1';
                    repairkits--;
                } else {
                    break;
                }
            }
        }

        return convertToNumber(String.valueOf(wallArray));
    }
}

class ExtendableWallSampleTest {

    public static void main(String[] args) {
        ExtendableWallSampleTest test = new ExtendableWallSampleTest();
        test.testGenerateFixedWall();
    }

    public void testGenerateFixedWall() {
        marathon ew = new marathon();

        long result1 = ew.generateFixedWall(23555678L, 2, new int[]{43, 54, 61});
        System.out.println(result1);  // Output: 23555546

        long result2 = ew.generateFixedWall(337463L, 6, new int[]{45, 10});
        System.out.println(result2);  // Output: 98295
    }
}
