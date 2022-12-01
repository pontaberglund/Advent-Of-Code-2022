import java.io.*;

public class Part1 {
    public static void main(String[] args) throws Exception {
        
        File file = new File("C:/Users/ponta/Documents/Advent-Of-Code-2022/Day 1/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        int maxSum = 0;
        int currentSum = 0;
        int currentPos = 1;
        int maxPos = 1;
        while(true) {
            String line = br.readLine();
            if(line == null) {
                break;
            } else if(!line.equals("")) {
                currentSum += Integer.parseInt(line);
            } else {
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                    maxPos = currentPos;
                }
                if(currentSum != 0)
                    currentPos++;
                currentSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}