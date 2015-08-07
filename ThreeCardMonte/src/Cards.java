import java.util.ArrayList;
	import java.util.List;
public class Cards 
{
	private double bet, earnings;

	private int answer;
	private String choice;
	private int k;
		
	public Cards()
	   {
	      choice = "";
	      bet = 0;
	   }
	public double getEarnings() 
	{
		return earnings;
	}

	public void setEarnings(double earnings) 
	{
		this.earnings = earnings;
	}
	public double getBet() 
	{
		return bet;
	}

	public void setBet(double bet) 
	{
		this.bet = bet;
	}

	public int getAnswer() 
	{
		return answer;
	}

	public void setAnswer(int answer) 
	{
		this.answer = answer;
	}

	public String getChoice() 
	{
		return choice;
	}

	public void setChoice(String choice) 
	{
		this.choice = choice;
	}

	public int getK() 
	{
		return k;
	}

	public void setK(int k) 
	{
		this.k = k;
	}


}
