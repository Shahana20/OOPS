class Student {
    String name;
    public Student(String name) {
        this.name = name;
    }
}

class School extends Student {
    int percentage;
    public School(String name, int percentage) {
        super(name);
        this.percentage = percentage;
    }
    public void display() {
        System.out.print("Name : " + this.name + " Percentage : " + this.percentage );
    }
}

class College extends School {
    double cgpa;
    public College(String name, int percentage, double cgpa) {
        super(name, percentage);
        this.cgpa = cgpa;
    }
    @Override
    public void display() {
        super.display();
        System.out.println(" CGPA " + this.cgpa);
    }
    public static void main(String[] args) {
        School s = new School("Shahana", 97);
        s.display();
        System.out.println();
        College c = new College("Shahana", 96, 9.06);
        c.display();
    }
}
