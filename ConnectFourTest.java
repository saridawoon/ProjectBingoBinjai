public class ConnectFourTest {
    public static void main(String[] args) {
    String[][] f = Pattern.createPattern();
    boolean loop = true;
    int count = 0;
    Pattern.printPattern(f);
    while (loop) {
        if (count % 2 == 0) Pattern.dropRedPattern(f);
        else Pattern.dropGreenPattern(f);
        count++;
        Pattern.printPattern(f);
        if (CheckWinner.checkWinner(f) != null) {
            if (CheckWinner.checkWinner(f) == "R")
                System.out.println("The red player won.");
            else if (CheckWinner.checkWinner(f) == "G")
                System.out.println("The green player won.");
            loop = false;
        }
    }
}
}