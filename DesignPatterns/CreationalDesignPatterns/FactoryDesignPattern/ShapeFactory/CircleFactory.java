//Concrete Creators
public class CircleFactory extends ShapeFactory{
    @Override
    public Shape createShape(){
        return new Circle();
    }
}
