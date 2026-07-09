// Write a program to find the sum of all even numbers up to N.
class Logic
{
    void SumEven(int iNo)
    {
       int iCnt = 0;
       int iSum = 0;

       for(iCnt = 0; iCnt <= iNo; iCnt++)
       {
            if(iCnt % 2 == 0)
            {
                iSum = iSum + iCnt;
            }
       } 
       System.out.println("Sum of All Even numbers : "+iSum);
    }

}
class program1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.SumEven(20);
    }
}