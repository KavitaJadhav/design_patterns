//Composition over inheritance
//Decide which to call at run time
//Ensure open close principle
//instanceOf method for decision making - code smell
//reduce cyclomatic complexity(avoid if else statement) - (no if independent lines vs branches)


package strategy.com.app;

public class App {
    public static void main(String[] args) {
        OperationManager operationManager = new OperationManager();

        operationManager.setStrategy(new Addition());
        operationManager.execute(10, 10);

        operationManager.setStrategy(new Multiplication());
        operationManager.execute(10, 10);
    }
}
