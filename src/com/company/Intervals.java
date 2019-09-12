package com.company;

import java.util.ArrayList;

public class Intervals {
     private  int start;
     private  int finish;
    private static int maxEvenNumber;
     private  static int maxOddNumber;

    Intervals(  int x , int y)
    {
            start = x;
            finish = y;

    }


public void printAllOddElemens()
{
    for (int i = start; i < finish; i++) {
        if( i % 2 == 0)
        {
            System.out.println(i);
        }


    }
}

public  void printSumOddandEvenNumbers()
{
    int sum =0;
    for (int i = start; i <finish; i++) {
        sum += i;

    }

    System.out.println(sum);

}
private void findMinandMaxElemenst()
{
    for (int i = 0; i < finish; i++) {
        if( i % 2 == 0)
        {
            maxEvenNumber = i;
        }
        else{
            maxOddNumber = i;
        }
    }
}

void buildFibonachiRow(int lenght)
{

    int[] numbers = new int[lenght];
    findMinandMaxElemenst();
    numbers[0] = maxOddNumber;
    numbers[1] = maxEvenNumber;


    for (int i = 2; i < lenght; i++)
    {
        numbers[i] = numbers[i - 1] + numbers[ i  - 2];
        System.out.println(numbers[i]);
    }

    double  interestOddNumbers = 0;
    double  interestEvenNumbers = 0;

        double countOddNumbers =0;
        double countEvenNumbers =0;


    for (int i = 0; i < numbers.length ; i++)
    {
        if(numbers[i] % 2 == 0)
        {
            countEvenNumbers++;
        }
        else{
            countOddNumbers++;
        }


    }
        interestOddNumbers  = (countOddNumbers / numbers.length) * 100.0;
        interestEvenNumbers  = (countEvenNumbers / numbers.length) * 100.0;

    System.out.println("Odd numbers persent - " + interestOddNumbers);
    System.out.println("Even numbers persent - " + interestEvenNumbers);
}


}
