import java.util.Scanner;

public class Pattern {

    public static String[][] createPattern()
    {
        String[][] f = new String[7][15]; //สร้าง array

        for (int i =0;i<f.length;i++)
        {
            for (int j =0;j<f[i].length;j++)
            {
                if (j% 2 == 0) f[i][j] ="|";
                else f[i][j] = " ";
                if (i==6) f[i][j]= "-";
            }
        }
        return f;
    }
    public static void printPattern(String[][] f)
    {
        for (int i =0;i<f.length;i++)
        {
            for (int j=0;j<f[i].length;j++)
            {
                System.out.print(f[i][j]);
            }
            System.out.println();
        }
    }

    //หยอดเหรียญบิงโกของ red player
    public static void dropRedPattern(String[][] f)
    {
        System.out.println("Drop a red disk at between 0–6: ");
        Scanner scan = new Scanner (System.in);
        int c = 2*scan.nextInt()+1;
        for (int i =5;i>=0;i--)
        {
            if (f[i][c] == " ")
            {
                f[i][c] = "R";
                break;
            }
        }
    }

    //หยอดเหรียญบิงโกของ green player
    public static void dropGreenPattern(String[][] f)
    {
        System.out.println("Drop a green disk between 0–6: ");
        Scanner scan = new Scanner (System.in);
        int c = 2*scan.nextInt()+1;
        for (int i =5;i>=0;i--)
        {
            if (f[i][c] == " ")
            {
                f[i][c] = "G";
                break;
            }
        }
    }
}
