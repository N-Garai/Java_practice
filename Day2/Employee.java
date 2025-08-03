class Employee {
    String name;
    int id;
    double salary;
    
    public Employee() {
        this("Unknown", 0, 0.0);
    }
    
    public Employee(String name) {
        this(name, 0, 0.0);
    }
    
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    public void show() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
    }
    
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Alice");
        Employee e3 = new Employee("Bob", 101, 50000);
        
        e1.show();
        e2.show();
        e3.show();
    }
}

