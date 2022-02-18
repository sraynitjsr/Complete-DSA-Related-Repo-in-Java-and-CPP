//Program to print Fizz Buzz

#include <bits/stdc++.h>
using namespace std;

int main(void)
{
	int in;
	cout << "Enter a Number" << endl;
	cin >> in;
	for (int i=1; i<in; i++)
	{
		if (i%15 == 0)	
		printf ("FizzBuzz\t");
		else if ((i%3) == 0)
		printf("Fizz\t");		
		else if ((i%5) == 0)					
		printf("Buzz\t");				
		else		
		printf("%d\t", i);				
	}
	return 0;
}
