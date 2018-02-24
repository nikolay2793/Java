public class CollegeStudent extends Student
{
    public String _major;
    public int _year;


    public  CollegeStudent (String name, String gender, int age, String idNumber, double gpa, String major, int year)
    {
        super(name, gender, age, idNumber, gpa);

        _major = major;
        _year = year;

    }



    //major

    public String getMajor()
    {
        return _major;
    }

    public void setMajor (String major)
    {
        this._major = major;
    }

    //year

    public int getYear (int year)
    {
        return _year;
    }


    public void setYear (int year)
    {
        this._year = year;
    }


    @Override
    public String toString()
    {
        return  _name + ", gender: " + _gender + ", age: " + _age + ", idNumber: " + _idNumber +
                ", gpa: " + _gpa + ", major: " + _major + ", year: " + _year;
    }
}
