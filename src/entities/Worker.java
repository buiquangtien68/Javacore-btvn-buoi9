package entities;

import java.time.LocalDate;

public class Worker {
    private int id;
    private static int autoId;
    private String name;
    private int age;
    private double salary;
    private String workPlace;
    private Enum STATUS;
    private LocalDate addWorkerTime;

    public Worker() {
        this.id = ++autoId;
    }

    public Worker(String name, int age, double salary, String workPlace) {
        this.id = ++autoId;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workPlace = workPlace;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Worker.autoId = autoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public  void setSalary(double changeSalary) {
        this.salary = changeSalary;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public Enum getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Enum STATUS) {
        this.STATUS = STATUS;
    }

    public LocalDate getAddWorkerTime() {
        return addWorkerTime;
    }

    public void setAddWorkerTime(LocalDate addWorkerTime) {
        this.addWorkerTime = addWorkerTime;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", workPlace='" + workPlace + '\'' +
                ", STATUS=" + STATUS +
                ", addWorkerTime=" + addWorkerTime +
                '}';
    }
}
