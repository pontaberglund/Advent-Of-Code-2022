import java.io.*;

public class Part1 {
    public static void main(String[] args) throws Exception {

        File file = new File("C:/Users/ponta/Documents/Advent-Of-Code-2022/Day 6/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = br.readLine();
        char[] ch = line.toCharArray();
        for(int i = 0; i < ch.length - 3; i++) {
            if(ch[i] != ch[i+1] &&
            ch[i+1] != ch[i+2] &&
            ch[i+2] != ch[i] &&
            ch[i] != ch[i+3] &&
            ch[i+1] != ch[i+3] &&
            ch[i+2] != ch[i+3]) {
                System.out.println(i+4);
                break;
            }
        }
    }
}