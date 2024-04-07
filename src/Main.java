import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to RCOEM Pizza ");
        System.out.println("Would you like to order a 'Pizza Mania' or a 'Delux Pizza'\n 1. Delux Pizza   2.Pizza Mania");
        int pizza=sc.nextInt();
        System.out.println("Do You Want veg/non-veg pizza?\n 1. YES   2. NO");
        int veg=sc.nextInt();
        if(pizza==2){
            System.out.println("Would you like to add extra cheese?\n 1. YES   2. NO");
            int cheese = sc.nextInt();
            System.out.println("Would you like to add extra toppings?\n 1. YES   2. NO");
            int tops = sc.nextInt();
            Pizza mania=new Pizza(veg == 1);
            if(tops==1) mania.addtoppings();
            if(cheese==1)mania.addExtraCheese();
            System.out.println("Would you Take away or Dine in\n 1. Take Away   2. Dine in");
            int take=sc.nextInt();
            if(take==1) mania.takeaway();
            mania.getBill();
        }
        else {
            DeluxPizza delux=new DeluxPizza(veg==1);
            System.out.println("Would you Take away or Dine in\n 1. Take Away   2. Dine in");
            int take=sc.nextInt();
            if(take==1) delux.takeaway();

        }


    }
}