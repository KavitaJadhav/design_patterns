//Structural design pattern
//Inheritance has limitation of extending 1 class only. (static behaviour)
//Uses Composition - Add behaviour dynamically
//run time object creation, behaviour can be changes dynamically
//Gives flexible alternation for subclasses(when multiple branching)


//create base beverage
//addon(base)

package decorator.com.app;

public class App {
    public static void main(String[] args) {
        Beverage beverage;

        beverage = new PlainBeverage();
        System.out.println(beverage.get_name() + " : " + beverage.get_cost());

        beverage = new MilkBeverage(new PlainBeverage());
        System.out.println(beverage.get_name() + " : " + beverage.get_cost());

        beverage = new SugarBeverage(new MilkBeverage(new PlainBeverage()));
        System.out.println(beverage.get_name() + " : " + beverage.get_cost());

        beverage = new SugarBeverage(new SugarBeverage(new MilkBeverage(new PlainBeverage())));
        System.out.println(beverage.get_name() + " : " + beverage.get_cost());
    }
}

//Beverage Interface(get_name, get_cost)
//PlainBeverage implements Beverage (get_name, get_cost)
//BeverageDecorator implements Beverage (get_name, get_cost, composition Beverage)
//MilkBeverage, SugarBeverage, CappuccinoBeverage extends BeverageDecorator
