// Client Program
public class UniversitySystem {
    public static void main(String[] args) {
        // Create the root college (university)
        College newEraUniversity = new College("New Era University");
        
        // Create colleges
        College engineeringCollege = new College("College of Engineering");
        College businessCollege = new College("College of Business");
        
        // Create departments
        Department computerScienceDept = new Department("Department of Computer Science");
        Department informationTechDept = new Department("Department of Information Technology");
        Department accountingDept = new Department("Department of Accounting");
        Department managementDept = new Department("Department of Management");
        
        // Create teachers
        Teacher csTeacher1 = new Teacher("Dr. Smith", "Algorithms", 75000);
        Teacher csTeacher2 = new Teacher("Prof. Johnson", "Data Structures", 70000);
        Teacher itTeacher1 = new Teacher("Dr. Brown", "Networking", 72000);
        Teacher itTeacher2 = new Teacher("Prof. Davis", "Web Development", 68000);
        Teacher accTeacher = new Teacher("Dr. Wilson", "Financial Accounting", 71000);
        Teacher mgmtTeacher = new Teacher("Prof. Taylor", "Strategic Management", 69000);
        
        // Create students
        Student csStudent1 = new Student("Alice", "CS001", 12000);
        Student csStudent2 = new Student("Bob", "CS002", 12000);
        Student csStudent3 = new Student("Charlie", "CS003", 12000);
        Student itStudent1 = new Student("Diana", "IT001", 11500);
        Student itStudent2 = new Student("Edward", "IT002", 11500);
        Student accStudent1 = new Student("Frank", "ACC001", 10500);
        Student accStudent2 = new Student("Grace", "ACC002", 10500);
        Student mgmtStudent1 = new Student("Hannah", "MGT001", 10000);
        Student mgmtStudent2 = new Student("Ian", "MGT002", 10000);
        
        // Build the organizational structure
        
        // Add departments to colleges
        engineeringCollege.add(computerScienceDept);
        engineeringCollege.add(informationTechDept);
        businessCollege.add(accountingDept);
        businessCollege.add(managementDept);
        
        // Add teachers to departments
        computerScienceDept.add(csTeacher1);
        computerScienceDept.add(csTeacher2);
        informationTechDept.add(itTeacher1);
        informationTechDept.add(itTeacher2);
        accountingDept.add(accTeacher);
        managementDept.add(mgmtTeacher);
        
        // Add students to departments
        computerScienceDept.add(csStudent1);
        computerScienceDept.add(csStudent2);
        computerScienceDept.add(csStudent3);
        informationTechDept.add(itStudent1);
        informationTechDept.add(itStudent2);
        accountingDept.add(accStudent1);
        accountingDept.add(accStudent2);
        managementDept.add(mgmtStudent1);
        managementDept.add(mgmtStudent2);
        
        // Add colleges to university
        newEraUniversity.add(engineeringCollege);
        newEraUniversity.add(businessCollege);
        
        // Display details of the university
        System.out.println(newEraUniversity.getDetails());
        
        // Calculate and display the total number of students in the university
        System.out.println("Total number of students in the university: " + 
                           newEraUniversity.getStudentCount());
        
        // Calculate and display the total budget of the university
        System.out.println("Total budget of the university: $" + 
                           String.format("%.2f", newEraUniversity.getBudget()));
        
        // Display details of a specific college
        System.out.println("\n--- Details of Engineering College ---");
        System.out.println(engineeringCollege.getDetails());
        
        // Display details of a specific department
        System.out.println("\n--- Details of Computer Science Department ---");
        System.out.println(computerScienceDept.getDetails());
    }
}