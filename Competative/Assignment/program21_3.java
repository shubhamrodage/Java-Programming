// Write a program to display all factors of a given number
class Logic
{
    void DisplayFactor(int iNo)
    {
        int iCnt = 0;
        int iFact = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }

    }
}
class program3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.DisplayFactor(15);
    }
}