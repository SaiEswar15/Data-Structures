abstract class Student{

    String name;
    int age;

    Student(String newName, int newAge)
    {
        this.name = newName;
        this.age = newAge;
    }

    public void print(){
        System.out.println(this.name);
    }
    

    public  abstract void doNothing();
}