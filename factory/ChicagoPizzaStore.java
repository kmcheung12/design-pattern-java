package com.kmcheung.designpattern.factory;
public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
    //Below are dummy pizza classes, not used
    class ChicagoStyleVeggiePizza extends Pizza {
    }
    class ChicagoStyleClamPizza extends Pizza {
    }
    class ChicagoStylePepperoniPizza extends Pizza {
    }
}
