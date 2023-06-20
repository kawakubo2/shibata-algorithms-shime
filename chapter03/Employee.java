package chapter03;

public class Employee {
    private int number; // 社員番号
    private String name; // 名前
    private String email; // Email
    private double weight; // 体重
    private double height; // 身長
    public Employee(int number, String name, String email, double weight, double height) {
        this.number = number;
        this.name = name;
        this.email = email;
        this.weight = weight;
        this.height = height;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "Employee [number=" + number + ", name=" + name + ", email=" + email + ", weight=" + weight + ", height="
                + height + "]";
    }

}
