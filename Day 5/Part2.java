import java.io.*;
import java.util.LinkedList;

public class Part2 {
    public static void main(String[] args) throws Exception {

        File file = new File("C:/Users/ponta/Documents/Advent-Of-Code-2022/Day 1/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        LinkedList<Character> crate1 = new LinkedList<Character>();
        LinkedList<Character> crate2 = new LinkedList<Character>();
        LinkedList<Character> crate3 = new LinkedList<Character>();
        LinkedList<Character> crate4 = new LinkedList<Character>();
        LinkedList<Character> crate5 = new LinkedList<Character>();
        LinkedList<Character> crate6 = new LinkedList<Character>();
        LinkedList<Character> crate7 = new LinkedList<Character>();
        LinkedList<Character> crate8 = new LinkedList<Character>();
        LinkedList<Character> crate9 = new LinkedList<Character>();
        LinkedList[] crates = {null, crate1, crate2, crate3, crate4, crate5, crate6, crate7, crate8, crate9};

        crate1.addLast('B');
        crate1.addLast('G');
        crate1.addLast('S');
        crate1.addLast('C');

        crate2.addLast('T');
        crate2.addLast('M');
        crate2.addLast('W');
        crate2.addLast('H');
        crate2.addLast('J');
        crate2.addLast('N');
        crate2.addLast('V');
        crate2.addLast('G');

        crate3.addLast('M');
        crate3.addLast('Q');
        crate3.addLast('S');

        crate4.addLast('B');
        crate4.addLast('S');
        crate4.addLast('L');
        crate4.addLast('T');
        crate4.addLast('W');
        crate4.addLast('N');
        crate4.addLast('M');

        crate5.addLast('J');
        crate5.addLast('Z');
        crate5.addLast('F');
        crate5.addLast('T');
        crate5.addLast('V');
        crate5.addLast('G');
        crate5.addLast('W');
        crate5.addLast('P');

        crate6.addLast('C');
        crate6.addLast('T');
        crate6.addLast('B');
        crate6.addLast('G');
        crate6.addLast('Q');
        crate6.addLast('H');
        crate6.addLast('S');

        crate7.addLast('T');
        crate7.addLast('J');
        crate7.addLast('P');
        crate7.addLast('B');
        crate7.addLast('W');

        crate8.addLast('G');
        crate8.addLast('D');
        crate8.addLast('C');
        crate8.addLast('Z');
        crate8.addLast('F');
        crate8.addLast('T');
        crate8.addLast('Q');
        crate8.addLast('M');

        crate9.addLast('N');
        crate9.addLast('S');
        crate9.addLast('H');
        crate9.addLast('B');
        crate9.addLast('P');
        crate9.addLast('F');

        LinkedList<Character> temp = new LinkedList<Character>();
        while(true) {
            String line = br.readLine();
            if(line == null) {
                break;
            } else {
                String[] parts = line.split(" ");
                int first = Integer.parseInt(parts[1]);
                int second = Integer.parseInt(parts[3]);
                int third = Integer.parseInt(parts[5]);
                for(int i = first; i > 0; i--) {
                    Character x = (Character) crates[second].removeLast();
                    temp.addFirst(x);
                }
                for (int i = first; i > 0; i--) {
                    Character x = temp.removeFirst();
                    crates[third].addLast(x);
                }
            }
        }

        String result = "";
        result = result + crate1.getLast().toString();
        result = result + crate2.getLast().toString();
        result = result + crate3.getLast().toString();
        result = result + crate4.getLast().toString();
        result = result + crate5.getLast().toString();
        result = result + crate6.getLast().toString();
        result = result + crate7.getLast().toString();
        result = result + crate8.getLast().toString();
        result = result + crate9.getLast().toString();
        System.out.println(result);

    }
}