public class BuilderPatterExample {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new GamingComputerBuilder();
        ComputerDirector computerDirector = new ComputerDirector(computerBuilder);
        Computer gamingComputer = computerDirector.buildComputer();
        System.out.println(gamingComputer);
    }
}
