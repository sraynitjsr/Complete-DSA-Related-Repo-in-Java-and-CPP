// Java program to print Fizz Buzz
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class FizzBuzz
{
	public static void main(String args[]) throws IOException
	{
        System.out.println("Enter a Number");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int in = Integer.parseInt(reader.readLine());
        for (int i=1; i<in; i++)								
		{
			if (i%15==0)												
			System.out.print("FizzBuzz"+" ");
			else if (i%5==0)	
			System.out.print("Buzz"+" ");
			else if (i%3==0)	
			System.out.print("Fizz"+" ");				
			else
			System.out.print(i+" ");						
		}
	}
}
