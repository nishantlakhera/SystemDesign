//Concrete Builder
public class GamingComputerBuilder implements ComputerBuilder{
    private Computer computer;

    public GamingComputerBuilder(){
        this.computer = new Computer();
    }
    @Override
    public void buildCpu() {
        computer.setCpu("Intel Core i9");
    }

    @Override
    public void buildRam() {
        computer.setRam("32 GB Ram");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("1TB Storage");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("Nvidia Graphics Card");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }

}
