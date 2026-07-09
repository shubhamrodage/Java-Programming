// Write a program to calculate the product of digits of a number.
class Logic
{
    void Product(int iNo)
    {
        int iCnt = 0;
        int iDigit = 0;
        int iProduct = 1;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iProduct = iProduct * iDigit;

            iNo = iNo/10;
        }
        System.out.println("Product of Digits are : "+iProduct);

    }
}
class program1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.Product(543);
    }
}