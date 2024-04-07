public class DeluxPizza extends Pizza{

    DeluxPizza(boolean veg) {
        super(veg);
        super.addtoppings();
        super.addExtraCheese();
    }
}
