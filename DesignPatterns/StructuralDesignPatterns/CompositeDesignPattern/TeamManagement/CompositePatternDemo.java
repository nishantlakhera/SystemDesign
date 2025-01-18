public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee employee1 = new Developer("Nishant Lakhera", "Backend Developer");
        Employee employee2 = new Manager("Namratha", "ITCOE");
        Employee manager = new Developer("Aasim", "FrontEnd Developer");

        //Create a team and add employees
        Team developerTeam = new Team();
        developerTeam.add(employee1);
        developerTeam.add(employee2);
        developerTeam.add(manager);

        //Create another team with a manager
        Employee generalManager = new Manager("Diana", "Operations");
        Team operationsTeam = new Team();
        operationsTeam.add(generalManager);

        //Create a larger team
        Team company = new Team();
        company.add(developerTeam);
        company.add(operationsTeam);

        company.showDetails();

    }

}
