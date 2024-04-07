public class Pizza {
    private double price;
    boolean veg;
    private double cheese=50.00;
    private double toppings=30.00;
    private double bag=10.00;
    private boolean extraCheese=false;
    private boolean extraToping=false;
    private double basePrice;
    Pizza(boolean veg){
        this.veg=veg;
        if(this.veg){
            this.price=300.00;
            basePrice=this.price;
        }
        else {
            this.price = 400.00;
            basePrice=this.price;
        }
    }
    public void getPrice(){
        System.out.println("Price :"+this.price);
    }
    public void addExtraCheese(){
        extraCheese=true;
        this.price+=cheese;
    }
    public void addtoppings(){
        extraToping=true;
         this.price+=toppings;
    }
    public void takeaway(){
        System.out.println("Order ---> Take away");
        this.price+=bag;
    }
    public void getBill(){
        System.out.println("\n\n  <---Your Bill--->");
        System.out.println("Pizza            --->"+basePrice);
        if(extraToping){
            System.out.println("Extra Toppings   --->"+toppings);
        }
        if(extraCheese){
            System.out.println("Extra Cheese     --->"+cheese);
        }
        this.price+=((double) 18 /100)*this.price;
        System.out.println("Total Bill: "+this.price);
    }
}
