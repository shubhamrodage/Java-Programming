// Write a program to check whether a number is positive, negative, or zero.
class Logic
{
    void CheckNumber(int iNo)
    {
        if(iNo > 0)
        {
            System.out.println("Number is Positive : "+iNo);
        }
        else if(iNo < 0)
        {
            System.out.println("Number is Negative : "+iNo);
        }
        else
        {
            System.out.println("Number is Zero : "+iNo);
        }
    }
}
class program5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.CheckNumber(0);

    }
}