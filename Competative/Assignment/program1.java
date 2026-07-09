// Write a program to find the sum of digits of a number.

class Logic
{
    void SumofDigits(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo/10;
        }
        System.out.println(iSum);
    }

}
class program1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.SumofDigits(4444);

    }
}