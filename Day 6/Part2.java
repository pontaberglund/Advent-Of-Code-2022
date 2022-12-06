import java.io.*;

public class Part2 {
    public static void main(String[] args) throws Exception {

        File file = new File("C:/Users/ponta/Documents/Advent-Of-Code-2022/Day 6/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = br.readLine();
        char[] ch = line.toCharArray();
        for(int i = 0; i < ch.length - 14; i++) {
            int sum = 0;
            char[] ch2 = {ch[i], ch[i+1], ch[i+2], ch[i+3], ch[i+4], ch[i+5], ch[i+6], ch[i+7], ch[i+8], ch[i+9], ch[i+10], ch[i+11], ch[i+12], ch[i+13]};
            for(int j = 0; j < ch2.length; j++) {
                for(int k = 0; k < ch2.length; k++) {
                    if(j != k && ch2[j] != ch2[k])
                        sum++;
                }
            }
            if(sum == 13*14) {
                System.out.println(i + 14);
                break;
            }
        }

    }
}