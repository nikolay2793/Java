public class Student extends Person
{
    public String _idNumber;
    public double _gpa;

    public  Student (String name, String gender, int age, String idNumber, double gpa)
    {
        super(name,gender,age);

        _idNumber = idNumber;
        _gpa = gpa;
    }

    //gpa

    public double getGpa()
    {
        return _gpa;
    }

    public void setGpa (double gpa)
    {
        this._gpa = gpa;
    }

    //id

    public String getIdNumber()
    {
        return _idNumber;
    }

    public void setIdNumber (String idNumber)
    {
        this._idNumber = idNumber;
    }

    @Override
    public String toString()
    {
        return  _name + ", gender: " + _gender + ", age: " + _age + ", idNumber: " + _idNumber + ", gpa: " + _gpa;
    }


}
