// Write a program to calculate the power of a number using loops.
class Logic
{
    void CalPower(int Base, int Power)
    {
        int iCnt = 0;
        int iPower = 1;

        for(iCnt = 1; iCnt < Power; iCnt++)
        {
            iPower = iPower * Base;
        }
        System.out.println("Power is : " + iPower);
    }
}

class program5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.CalPower(2,5);
    }
}