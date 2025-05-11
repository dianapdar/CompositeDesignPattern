public class Teacher extends AbstractEducationalUnit {
    private String subject;
    private double salary;
    
    public Teacher(String name, String subject, double salary) {
        super(name);
        this.subject = subject;
        this.salary = salary;
    }
    
    @Override
    public String getDetails() {
        return "Teacher: " + name + ", Subject: " + subject + ", Salary: $" + 
               String.format("%.2f", salary);
    }
    
    @Override
    public int getStudentCount() {
        return 0; // Teachers don't count as students
    }
    
    @Override
    public double getBudget() {
        return salary; // Teacher's budget is their salary
    }
}