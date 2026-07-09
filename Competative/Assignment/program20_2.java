// Write a program to print numbers from N down to 1 in reverse order.
class Logic
{
    void ReverseNo(int iNo)
    {
        int iCnt = 0;

        for(iCnt = iNo; iCnt > 0; iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}
class program2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.ReverseNo(10);
    }
}