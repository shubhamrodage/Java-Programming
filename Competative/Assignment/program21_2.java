// Write a program to count how many even and odd numbers are present between 1 and N.
class Logic
{
    void CountEvenOdd(int iNo)
    {
        int EvenCount = 0;
        int OddCount = 0;
        int iCnt = 0;

        for(iCnt = 0; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                EvenCount++;
            }
            else
            {
                OddCount++;
            }
        }
        System.out.println("Number of even numbers : \n"+EvenCount);
        System.out.println("Number of Odd numbers : \n"+OddCount);
    }
}

class program2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.CountEvenOdd(10);
    }
}