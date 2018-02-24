 class Person
{
    public String _name;
    public String _gender;
    public int _age;

    //Constructor
    public Person (String name, String gender, int age)
    {
        _name = name; _gender = gender; _age = age;
    }

    //name

    public String getName()
    {
        return _name;
    }

    public void  setName(String name)
    {
        _name = name;
    }

    //Gender

    public String getGender()
    {
        return _gender;
    }

    public void  setGender(String gender)
    {
        _gender = gender;
    }

    //age
    public int getAge()
    {
        return  _age;
    }

    public void setAge (int age)
    {
        this._age = age;
    }


    //toString
    @Override
    public String toString()
    {
        return  _name + ", gender: " + _gender + ", age: " + _age;
    }

}
