// Write a program to print the multiplication table of a number.
class Logic
{
    void Table(int iNo)
    {
        int iCnt = 1;
        int iTable = 0;
        
        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            iTable = iNo * iCnt;
            System.out.println(iTable);
        }     
    }
}
class program5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.Table(5);

    }
}