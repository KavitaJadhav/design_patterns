package strategy.com.app;

public class OperationManager {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute(int num1, int num2) {
        System.out.println(strategy.execute(num1, num2));
    }
}
