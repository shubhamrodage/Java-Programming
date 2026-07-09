// Write a program to check whether a number is a perfect number or not.
class Logic
{
    void PerfectNumber(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= iNo/2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        if(iSum == iNo)
        {
            System.out.println("it is perfect number");
        }
        else
        {
            System.out.println("it is not perfect number");
        }
        
    }

}

class program3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.PerfectNumber(29);
    }

}