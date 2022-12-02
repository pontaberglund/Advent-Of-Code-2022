import java.io.*;

public class D2Part1 {
    public static void main(String[] args) throws Exception {

        File file = new File("C:/Users/ponta/Documents/Advent-Of-Code-2022/Day 1/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        int score = 0;
        while(true) {
            String line = br.readLine();
            if(line == null) {
                break;
            } else {
                char[] ch = line.toCharArray();
                //Opponent plays rock
                if(ch[0] == 'A') {
                    if(ch[2] == 'Y')
                        score += (2 + 6);
                    else if(ch[2] == 'X')
                        score += (1 + 3);
                    else
                        score += (3);
                }
                //Opponent plays scissor
                else if(ch[0] == 'C') {
                    if(ch[2] == 'X')
                        score += (1 + 6);
                    else if(ch[2] == 'Z')
                        score += (3 + 3);
                    else
                        score += (2);
                }
                //Opponent plays paper
                else {
                    if(ch[2] == 'Z')
                        score += (3 + 6);
                    else if(ch[2] == 'Y')
                        score += (2 + 3);
                    else
                        score += (1);
                }
            }
        }
        System.out.println(score);
    }
}