package Collections.EMS;

public class emp {
    String id; // unique
    String name;
    String position;
    double salary;
    int age;

    public emp(String id, String name, String position, double salary, int age) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "emp [id=" + id + ", name=" + name + ", position=" + position + ", salary=" + salary + ", age=" + age
                + "]";
    }    
}
