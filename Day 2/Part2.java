import java.io.*;

public class D2Part2 {
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
                    //Draw
                    if(ch[2] == 'Y')
                        score += (1 + 3);
                    //Lose
                    else if(ch[2] == 'X')
                        score += (3 + 0);
                    //Win
                    else
                        score += (2 + 6);
                }
                //Opponent plays scissor
                else if(ch[0] == 'C') {
                    //Lose
                    if(ch[2] == 'X')
                        score += (2 + 0);
                    //Win
                    else if(ch[2] == 'Z')
                        score += (1 + 6);
                    //Draw
                    else
                        score += (3 + 3);
                }
                //Opponent plays paper
                else {
                    //Win
                    if(ch[2] == 'Z')
                        score += (3 + 6);
                    //Draw
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