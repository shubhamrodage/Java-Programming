// Write a program to check whether a number is divisible by 5 and 11 or not.
class Logic
{
    void DivisibleNo(int iNo)
    {
        if(iNo % 5 == 0 || iNo % 11 == 0)
        {
            System.out.println("Divisible by 5 and 11");
        }
        else
        {
            System.out.println("Not Divisible by 5 and 11");
        }
    }

}

class program3
{
    public static void main (String A[])
    {
        Logic obj = new Logic();
        obj.DivisibleNo(25);
    }
}