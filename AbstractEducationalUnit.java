public abstract class AbstractEducationalUnit implements EducationalUnit {
     protected String name;
    
    public AbstractEducationalUnit(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
