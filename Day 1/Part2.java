import java.io.*;
import java.util.Arrays;

public class Part2 {
    public static void main(String[] args) throws Exception {

        File file = new File("C:/Users/ponta/Documents/Advent-Of-Code-2022/Day 1/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        int maxSum = 0;
        int[] podium = new int[3];
        int currentSum = 0;
        while(true) {
            String line = br.readLine();
            if(line == null) {
                break;
            } else if(!line.equals("")) {
                currentSum += Integer.parseInt(line);
            } else {
                if(currentSum > podium[0]) {
                    podium[0] = currentSum;
                    Arrays.sort(podium);
                }
                currentSum = 0;
            }
        }
        maxSum = podium[0] + podium[1] + podium[2];
        System.out.println(maxSum);
    }
}