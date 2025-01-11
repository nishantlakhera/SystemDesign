//Product Class
public class Computer {
    private String cup;
    private String ram;
    private String storage;
    private String graphicsCard;

    public void setCpu(String cpu){
        this.cup = cpu;
    }

    public void setRam(String ram){
        this.ram = ram;
    }

    public void setStorage(String storage){
        this.storage = storage;
    }

    public void setGraphicsCard(String graphicsCard){
        this.graphicsCard = graphicsCard;
    }

    @Override
    public String toString(){
        return "Computer Configurations: "+ "\n"+
                "Cpu: "+cup+"\n"+
                "Ram: "+ram+"\n"+
                "Storage: "+storage+"\n"+
                "Graphics Card: "+graphicsCard+"\n";
    }

}
