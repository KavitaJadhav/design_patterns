package strategy.com.app;

public interface Strategy {
    public int execute(int num1, int num2);
}

//
//Strategy - interface
//Sum, sub, Multi - implement Strategy
//Operation Manager - set_strategy, execuge
//
//Main -