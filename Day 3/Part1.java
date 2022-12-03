import java.io.*;
import java.util.Arrays;

public class D3Part1 {
    public static void main(String[] args) throws Exception {

        File file = new File("C:/Users/ponta/Documents/Advent-Of-Code-2022/Day 1/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        int sum = 0;
        char dup = 0;
        while(true) {
            String line = br.readLine();
            if(line == null) {
                break;
            } else {
                char[] ch = line.toCharArray();
                for(int i = 0; i < ch.length/2; i++) {
                    for(int j = ch.length/2; j < ch.length; j++) {
                        if(ch[i] == ch[j]) {
                            dup = ch[i];
                            break;
                        }
                    }
                }
                if(dup >= 'a' && dup <= 'z')
                    sum += (dup - 96);
                else if(dup >= 'A' && dup <= 'Z')
                    sum += (dup - 38);
            }
        }
        System.out.println(sum);
    }
}