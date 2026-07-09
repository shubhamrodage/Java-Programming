// Write a program to display the grade of a student based on marks.
class Logic
{
    void DisplayGrade(int Marks)
    {
        if(Marks > 90 && Marks <= 100)
        {
            System.out.println("A Grade");
        }
        else if(Marks > 70 && Marks < 90)
        {
            System.out.println("B Grade");
        }
        else if(Marks > 50 && Marks < 70)
        {
            System.out.println("C Grade");
        }
        else if(Marks < 50 && Marks > 0)
        {
            System.out.println("Fail");
        }

    }
}
class program2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.DisplayGrade(95);

    }
}