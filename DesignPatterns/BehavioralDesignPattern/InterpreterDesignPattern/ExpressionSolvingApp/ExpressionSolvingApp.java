public class ExpressionSolvingApp {
    public static void main(String[] args) {
        // (2 + 3) + 4
        Expression expression = new AddExpression(
                new AddExpression(new NumberExpression(2), new NumberExpression(3)), new NumberExpression(4));
        Context context = new Context();
        int result = expression.interpret(context);
        System.out.println("Result = "+ result);
    }
}
