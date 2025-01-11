//Builder interface
public interface ComputerBuilder {
    void buildCpu();
    void buildRam();
    void buildStorage();
    void buildGraphicsCard();
    Computer getComputer();
}
