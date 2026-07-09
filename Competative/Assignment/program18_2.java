// Write a program to print all even numbers up to N.
class Logic
{
    void EvenNumber(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.println( iCnt);
            }
        }
    }

}
class program2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.EvenNumber(20);
        
    }
}