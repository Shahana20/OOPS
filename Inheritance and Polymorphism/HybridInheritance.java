interface Leadership {
    void job();    
}

class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
}

class Developer extends Employee {
    Developer(String name) {
        super(name);
    }
    public void job() {
        System.out.println(this.name + " codes");
    }
}

class Designer extends Employee {
    Designer(String name) {
        super(name);
    }
    public void job() {
        System.out.println(this.name + " designs");
    }
}

class TechLead extends Developer implements Leadership {
    TechLead(String name) {
        super(name);
    }
    @Override
    public void job() {
        super.job();
        System.out.println(this.name + " leads");
    }
    public static void main(String[] args) {
        Developer obj1 = new Developer("John");
        obj1.job();
        Designer obj2 = new Designer("Joel");
        obj2.job();
        TechLead obj3 = new TechLead("Jonathan");
        obj3.job();
    }
}