import java.util.ArrayList;
import java.util.List;

//Composite: Represents a team of employees
public class Team implements Employee{
    private List<Employee> employees = new ArrayList<>();
    public void add(Employee employee){
        employees.add(employee);
    }
    public void remove(Employee employee){
        employees.remove(employee);
    }
    @Override
    public void showDetails() {
        System.out.println("Team Details:");
        for(Employee employee: employees){
            employee.showDetails();
        }
    }
}
