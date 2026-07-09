// Write a program to print all odd numbers up to N.
class Logic
{    void OddNumber(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                System.out.println( iCnt);
            }
        }
    }

}

class program3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.OddNumber(20);
    }
}