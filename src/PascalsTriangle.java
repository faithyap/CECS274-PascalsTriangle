import java.util.*;
public class PascalsTriangle
{
    private static Scanner input;
    public static int computePascalEntry(int row, int column)
    {
        int returnValue = 0;
        if (column == 0 || row == 0 || column == row)
        {
            returnValue = 1;
        }
        else
        {
            returnValue = computePascalEntry(row-1, column-1) + computePascalEntry(row-1, column);
        }
        return returnValue;
    }
    public static void printPascal(int row)
    {
        for (int i = 0; i <= row; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(computePascalEntry(i, j) + "\t");
            }
            System.out.println("");
        }
    }
    public static ArrayList<Integer> nthPascalLine(int row)
    {
        ArrayList<Integer> returnLine = new ArrayList<Integer>();
        for (int i = 0; i <= row; i++)
        {
            returnLine.add(computePascalEntry(row, i));
        }
        return returnLine;
    }
	
    public static void main(String[] args)
    {
	input = new Scanner(System.in);
	System.out.println("Up to what row would you like to compute? ");
	int n = input.nextInt();
		
	System.out.print("Pascal's triangle up to row " + n + " is \n");
	printPascal(n);
	System.out.println("The " + n + "th row is " + nthPascalLine(n));
	}

	
}