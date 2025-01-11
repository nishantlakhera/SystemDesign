//Director Class
public class ComputerDirector {
    private ComputerBuilder computerBuilder;
    public ComputerDirector(ComputerBuilder computerBuilder){
        this.computerBuilder = computerBuilder;
    }

    public Computer buildComputer(){
        computerBuilder.buildCpu();
        computerBuilder.buildRam();
        computerBuilder.buildStorage();
        computerBuilder.buildGraphicsCard();
        return computerBuilder.getComputer();
    }

}
