// Write a program to check whether a given year is a leap year or not.
class Logic
{
    void CheckLeapYear(int Year)
    {
        if((Year % 4 == 0) || (Year % 400 == 0) && (Year % 100 != 0) )
        {
            System.out.println(Year+ " It is leap year");
        }
        else
        {
            System.out.println(Year+ " It is not leap year");
        }
    }

}
class program1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.CheckLeapYear(2020);

    }
}