public class ShapeFactoryExample {
    public static void main(String[] args) {
        ShapeFactory factory;
        String shapeType = "square";

        if("circle".equalsIgnoreCase(shapeType)){
            factory = new CircleFactory();
        }else if ("square".equalsIgnoreCase(shapeType)){
            factory = new SquareFactory();
        }else{
            throw new IllegalArgumentException("Unknown shape");
        }

        Shape shape = factory.createShape();
        System.out.println("Created Shape = "+shape.getType());
    }
}
