// Write a program to find the sum of even and odd digits separately in a number.
class Logic
{
    void sum(int iNo)
    {
        int iCnt = 0;
        int iEven = 0;
        int iOdd = 0;

        for(iCnt = 0; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iEven = iEven + iCnt; 
            }
            else
            {
                iOdd = iOdd + iCnt;    
            }
        }       
        System.out.println("Sum of Even Digit :"+iEven);
        System.out.println("Sum of Odd Digit : "+iOdd);
    }
}

class program4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.sum(20);
    }
}