import java.io.*;
import java.util.Arrays;

public class D3Part2 {
    public static void main(String[] args) throws Exception {

        File file = new File("C:/Users/ponta/Documents/Advent-Of-Code-2022/Day 1/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        int sum = 0;
        char trip = 0;
        while(true) {
            String line1 = br.readLine();
            String line2 = br.readLine();
            String line3 = br.readLine();
            if(line1 == null || line2 == null || line3 == null) {
                break;
            } else {
                char[] ch1 = line1.toCharArray();
                char[] ch2 = line2.toCharArray();
                char[] ch3 = line3.toCharArray();
                for(int i = 0; i < ch1.length; i++) {
                    for(int j = 0; j < ch2.length; j++) {
                        for(int k = 0; k < ch3.length; k++) {
                            if(ch1[i] == ch2[j] && ch2[j] == ch3[k]) {
                                trip = ch1[i];
                                break;
                            }
                        }
                    }
                }
                if(trip >= 'a' && trip <= 'z')
                    sum += (trip - 96);
                else if(trip >= 'A' && trip <= 'Z')
                    sum += (trip - 38);
            }
        }
        System.out.println(sum);
    }
}