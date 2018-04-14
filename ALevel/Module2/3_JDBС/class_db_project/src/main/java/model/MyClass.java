package model;

public class MyClass {
    private int id;
    private String className;
    private int pupilsNumber;
    private String curatorName;

    public MyClass(int id, String className, int pupilsNumber, String curatorName) {
        setId(id);
        setClassName(className);
        setPupilsNumber(pupilsNumber);
        setCuratorName(curatorName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getPupilsNumber() {
        return pupilsNumber;
    }

    public void setPupilsNumber(int pupilsNumber) {
        this.pupilsNumber = pupilsNumber;
    }

    public String getCuratorName() {
        return curatorName;
    }

    public void setCuratorName(String curatorName) {
        this.curatorName = curatorName;
    }



    /*
    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", className=" + className +
                ", pupilsNumber=" + pupilsNumber +
                ", curatorName=" + curatorName +
                '}';
    }
    */


    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ",className="+className+
                ",pupilsNumber="+pupilsNumber+
                ",curatorName="+curatorName+
        "}";
    }


}