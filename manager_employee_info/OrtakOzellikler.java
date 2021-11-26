package manager_employee_info;

public class OrtakOzellikler {
    String human = "female";
    String rules = "basla";
    private double salary = 4789.2;

    public void method() {
        System.out.println("method calisti");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public OrtakOzellikler(String human, String rules, double salary) {
        this.human = human;
        this.rules = rules;
        this.salary = salary;
    }

    public OrtakOzellikler() {
    }

    @Override
    public String toString() {
        return "OrtakOzellikler{" +
                "human='" + human + '\'' +
                ", rules='" + rules + '\'' +
                ", salary=" + salary +
                '}';
    }
}
