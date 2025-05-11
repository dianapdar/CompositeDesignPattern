// Leaf class - Student
public class Student extends AbstractEducationalUnit {
    private String studentId;
    private double tuitionFee;
    
    public Student(String name, String studentId, double tuitionFee) {
        super(name);
        this.studentId = studentId;
        this.tuitionFee = tuitionFee;
    }
    
    @Override
    public String getDetails() {
        return "Student: " + name + ", ID: " + studentId + ", Tuition Fee: $" + 
               String.format("%.2f", tuitionFee);
    }
    
    @Override
    public int getStudentCount() {
        return 1; // Each student counts as 1
    }
    
    @Override
    public double getBudget() {
        return -tuitionFee; // Students contribute negatively to budget (income)
    }
}