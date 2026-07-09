// Write a program to print each digit of a number separately.
class Logic
{
    void Digit(int iNo)
    {
        if(iNo == 0)
        {
            return;
        }
        Digit(iNo / 10);

        System.out.println(iNo % 10);
        
    }

}
class program4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.Digit(3456);
    }
}