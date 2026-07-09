// Write a program to find the largest digit in a given number.
class Logic
{
    void LargestDigit(int iNo)
    {
        int iCnt = 0;
        int iDigit = 0;
        int iLarge = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit >= iLarge)
            {
                iLarge = iDigit;
            }
            iNo = iNo /10;
        }
        System.out.println(iLarge);
    }
}
class program4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.LargestDigit(4053);
    }
}