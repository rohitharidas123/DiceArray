/**
 * 
 * @author Rohit
 *
 */


public class DiceArray 
{
	public static void main(String[] args)
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int sum = 0;
		
		int [] values = new int[11];		
	
		for(int i=0;i<1000;i++)
		{
			int die1 = dice1.roll();
			int die2 = dice2.roll();
			sum = die1 + die2;
			if (sum == 2)
			{
				values[0] += 1;
			}
			else if (sum == 3)
			{
				values[1] += 1;
			}
			else if (sum == 4)
			{
				values[2] += 1;
			}
			else if (sum == 5)
			{
				values[3] += 1;
			}
			else if (sum == 6)
			{
				values[4] += 1;
			}
			else if (sum == 7)
			{
				values[5] += 1;
			}
			else if (sum == 8)
			{
				values[6] += 1;
			}
			else if (sum == 9)
			{
				values[7] += 1;
			}
			else if (sum == 10)
			{
				values[8] += 1;
			}
			else if (sum == 11)
			{
				values[9] += 1;
			}
			else if (sum == 12)
			{
				values[10] += 1;
			}
		}
		System.out.println("You rolled " + values[0] + " twos.");	
		System.out.println("You rolled " + values[1] + " threes.");
		System.out.println("You rolled " + values[2] + " fours.");
		System.out.println("You rolled " + values[3] + " fives.");
		System.out.println("You rolled " + values[4] + " sixs.");
		System.out.println("You rolled " + values[5] + " sevens.");
		System.out.println("You rolled " + values[6] + " eights.");
		System.out.println("You rolled " + values[7] + " nines.");
		System.out.println("You rolled " + values[8] + " tens.");
		System.out.println("You rolled " + values[9] + " elevens.");
		System.out.println("You rolled " + values[10] + " twelves.");
	}
}
	

