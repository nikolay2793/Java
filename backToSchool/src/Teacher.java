public class Teacher extends Person

{
    public double _salary;
    public String _subject;

    //The constructor will use five parameters
    //to initialize name, age, gender, subject, and salary
    public  Teacher (String name, String gender, int age, double salary, String subject)
    {
        // Use the super reference to use the constructor
        // in the Person superclass to initialize the inherited values
        super(name,gender,age);


        _salary = salary;
        _subject = subject;
    }

    //Write "setter" and "getter" methods for all of the class variables.
    //subject

    public String getSubject()
    {
        return _subject;
    }

    public void setSubject (String subject)
    {
        this._subject = subject;
    }

    //salary

    public double getSalary()
    {
        return _salary;
    }

    public void setSalary (double salary)
    {
        this._salary = salary;
    }

    //Write the toString() method for the Teacher class

    @Override
    public String toString()
    {
        return  _name + ", gender: " + _gender + ", age: " + _age + ", salary: " + _salary + "  " + _subject;
    }


}
