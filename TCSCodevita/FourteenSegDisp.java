import java.util.*;

public class FourteenSegDisp {

    private static final Map<String, Character> CHAR_MAP = new HashMap<>();

    static {
        CHAR_MAP.put("01110100011000110001100011101110", 'A');
        CHAR_MAP.put("11110100011111010001100011111110", 'B');
        CHAR_MAP.put("01110100011000010000100010100110", 'C');
        CHAR_MAP.put("11110100011000110001100011111110", 'D');
        CHAR_MAP.put("11111100001111010000100001111111", 'E');
        CHAR_MAP.put("11111100001111010000100001100001", 'F');
        CHAR_MAP.put("01110100011000010111100011101110", 'G');
        CHAR_MAP.put("10001100011111110001100011000110", 'H');
        CHAR_MAP.put("01110001000010000100001001110110", 'I');
        CHAR_MAP.put("00011000010000100001000011001100", 'J');
        CHAR_MAP.put("10001100101110010011100101000110", 'K');
        CHAR_MAP.put("10000100001000010000100001111111", 'L');
        CHAR_MAP.put("10001110111010110101100011000110", 'M');
        CHAR_MAP.put("10001110011110111011100011000110", 'N');
        CHAR_MAP.put("01110100011000110001100011001110", 'O');
        CHAR_MAP.put("11110100011000111110100001000010", 'P');
        CHAR_MAP.put("01110100011000110001100111001111", 'Q');
        CHAR_MAP.put("11110100011000111110100101000110", 'R');
        CHAR_MAP.put("01110100001000001110100001001110", 'S');
        CHAR_MAP.put("11111001000010000100001000010000", 'T');
        CHAR_MAP.put("10001100011000110001100011001110", 'U');
        CHAR_MAP.put("10001100011000101010010100001000", 'V');
        CHAR_MAP.put("10001100011000110101110111100110", 'W');
        CHAR_MAP.put("10001100010101000101010010001100", 'X');
        CHAR_MAP.put("10001100011000101010001000010000", 'Y');
        CHAR_MAP.put("11111000010001000100010001111111", 'Z');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        String[] grid = new String[9];
        for (int i = 0; i < 9; i++) {
            grid[i] = scanner.nextLine();
        }

        int colNum = grid[0].length(); 
        StringBuilder result = new StringBuilder();

        for (int col = 0; col < colNum; ) {
           
            StringBuilder segment = new StringBuilder();
            boolean isValidSegment = true;

            for (int row = 0; row < 9; row++) {
                if (col + 5 > colNum) { 
                    isValidSegment = false;
                    break;
                }
                segment.append(grid[row], col, col + 5);
            }

            if (isValidSegment) {
                String segmentStr = segment.toString();
                System.out.println("Segment: " + segmentStr); 

                if (CHAR_MAP.containsKey(segmentStr)) {
                    result.append(CHAR_MAP.get(segmentStr)); 
                    col += 5; 
                } else {
                    System.out.println("Invalid segment: " + segmentStr);
                    col++; 
                }
            } else {
                break; 
            }

            while (col < colNum && isColEmpty(grid, col)) {
                col++;
            }
        }

        System.out.println(result.toString());
    }

 
    private static boolean isColEmpty(String[] grid, int col) {
        for (String row : grid) {
            if (row.charAt(col) != '0') {
                return false;
            }
        }
        return true;
    }
}
