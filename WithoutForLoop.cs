using System;

public class WithoutForLoop


{
    static void Main()
    {
        Console.WriteLine("Enter the number of terms in Fibonacci series:");
        int n = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("Fibonacci Series:");

        PrintFibonacciSeries(n, 0);
    }

    static void PrintFibonacciSeries(int n, int currentIndex)
    {
        if (currentIndex < n)
        {
            Console.Write(Fibonacci(currentIndex) + " ");
            PrintFibonacciSeries(n, currentIndex + 1);
        }
    }

    static int Fibonacci(int n)
    {
        if (n <= 1)
        {
            return n;
        }
        else
        {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}


