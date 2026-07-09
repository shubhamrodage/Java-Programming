// Write a program to find the maximum of two numbers.

class Logic
{
    void Maximum(int iNo1, int iNo2)
    {
        if(iNo1 > iNo2)
        {
            System.out.println("iNo1 is maximum : "+iNo1);
        }
        else
        {
            System.out.println("iNo2 is maximum : "+iNo2);
        }

    }
}

class program3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.Maximum(20,15);
    }
}