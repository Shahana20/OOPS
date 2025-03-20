class Employee {
    String name;
    public Employee(String name) {
        this.name = name;
    }
}

class Developer extends Employee {
    public Developer(String name) {
        super(name);
    }
    public void job() {
        System.out.println(this.name + " codes");
    }
}

class Designer extends Employee {
    public Designer(String name) {
        super(name);
    }
    public void job() {
        System.out.println(this.name + " designs");
    }
}

class Main {
    public static void main(String[] args) {
        Developer dev = new Developer("John");
        dev.job();
        Designer des = new Designer("Joel");
        des.job();
    }
}
