package com.kmcheung.designpattern.factory;
public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
    //Below are dummy pizza classes, not used
    class NYStyleVeggiePizza extends Pizza {
    }
    class NYStyleClamPizza extends Pizza {
    }
    class NYStylePepperoniPizza extends Pizza {
    }
}
