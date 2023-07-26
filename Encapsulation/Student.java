public class Student{
    private String name ;
    private int age;


    Student(String newName,int newAge)
    {
        this.name = newName;
        this.age = newAge;
    }

    public void getName()
    {
        System.out.println(this.name);
    }

    public void setName(String newName)
    {
        this.name = newName;
    }

    public void getAge()
    {
        System.out.println(this.age);
    }

    public void setAge(int newAge)
    {
        age = newAge;
    }
}