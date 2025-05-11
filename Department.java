import java.util.List;
import java.util.ArrayList;

// Composite class - Department
public class Department extends AbstractEducationalUnit {
    private List<EducationalUnit> components = new ArrayList<>();
    
    public Department(String name) {
        super(name);
    }
    
    public void add(EducationalUnit unit) {
        components.add(unit);
    }
    
    public void remove(EducationalUnit unit) {
        components.remove(unit);
    }
    
    @Override
    public String getDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Department: ").append(name).append("\n");
        details.append("Number of Students: ").append(getStudentCount()).append("\n");
        details.append("Budget: $").append(String.format("%.2f", getBudget())).append("\n");
        details.append("Components:\n");
        
        for (EducationalUnit unit : components) {
            // Indent the details of child components
            String[] lines = unit.getDetails().split("\n");
            for (String line : lines) {
                details.append("  ").append(line).append("\n");
            }
        }
        
        return details.toString();
    }
    
    @Override
    public int getStudentCount() {
        int totalStudents = 0;
        for (EducationalUnit unit : components) {
            totalStudents += unit.getStudentCount();
        }
        return totalStudents;
    }
    
    @Override
    public double getBudget() {
        double totalBudget = 0;
        for (EducationalUnit unit : components) {
            totalBudget += unit.getBudget();
        }
        return totalBudget;
    }
}