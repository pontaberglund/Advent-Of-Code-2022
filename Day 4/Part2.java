import java.io.*;

public class Part2 {
    public static void main(String[] args) throws Exception {

        File file = new File("C:/Users/ponta/Documents/Advent-Of-Code-2022/Day 1/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        int amountOfPairs = 0;
        while(true) {
            String line = br.readLine();
            if(line == null) {
                break;
            } else {
                String[] parts = line.split(","); // 6-9,7-9
                String[] subParts1 = parts[0].split("-"); //[6, 9]
                String[] subParts2 = parts[1].split("-"); //[7, 9]
                int rangeLength1 = Integer.parseInt(subParts1[1]) - Integer.parseInt(subParts1[0]) + 1;
                int rangeLength2 = Integer.parseInt(subParts2[1]) - Integer.parseInt(subParts2[0]) + 1;
                if(rangeLength1 < rangeLength2) {
                    int sum = 0;
                    for(int i = Integer.parseInt(subParts1[0]); i <= Integer.parseInt(subParts1[1]); i++) {
                        for(int j = Integer.parseInt(subParts2[0]); j <=  Integer.parseInt(subParts2[1]); j++) {
                            if(i == j)
                                sum++;
                        }
                    }
                    if(sum > 0)
                        amountOfPairs++;
                } else {
                    int sum = 0;
                    for(int i = Integer.parseInt(subParts2[0]); i <= Integer.parseInt(subParts2[1]); i++) {
                        for(int j = Integer.parseInt(subParts1[0]); j <=  Integer.parseInt(subParts1[1]); j++) {
                            if(i == j)
                                sum++;
                        }
                    }
                    if(sum > 0)
                        amountOfPairs++;
                }
            }
        }
        System.out.println(amountOfPairs);
    }
}