// Write a program to print all numbers from 1 to N that are divisible by both 2 and 3.
class Logic
{
    void Divisible(int iNo)
    {
        int iCnt = 0;
        
        for(iCnt = 0; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0 || iCnt % 3 == 0)
            {
                System.out.println(iCnt);
            }
        }

    }
}

class program5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.Divisible(20);

    }
}