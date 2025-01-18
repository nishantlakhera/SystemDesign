//Leaf
public class Manager implements Employee{
    private String name;
    private String department;
    public Manager(String name, String department){
        this.name = name;
        this.department = department;
    }
    @Override
    public void showDetails() {
        System.out.println(name+ " manages the "+department+" department");
    }
}
