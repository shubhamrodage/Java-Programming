// Write a program to count total number of factors of a given number.
class Logic
{
    void CountFactor(int iNo)
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iCount++;
            }
        }
        System.out.println("Number of factor are : \n"+iCount);
    }

}

class program4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.CountFactor(5);

    }
}