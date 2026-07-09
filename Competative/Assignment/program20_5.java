// Write a program to find the smallest digit in a given number.
class Logic
{
    void SmallestDigit(int iNo)
    {
        int iCnt = 0;
        int iDigit = 0;
        int iSmall = 9;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit <= iSmall)
            {
                iSmall = iDigit;
            }
            iNo = iNo/10;
        }
        System.out.println(iSmall);
    }


}
class program5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.SmallestDigit(89454);
    }
}