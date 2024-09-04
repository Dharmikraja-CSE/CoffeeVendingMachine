import java.util.*;

public class FreshMilk {
    public void onMakeFreshCoffee() {

        Scanner in=new Scanner(System.in);
        Container cont = new Container();
        Integer productId = 2;
        String productName = "Fresh Milk Coffee";
        System.out.println("How Many Cups of Fresh Milk Coffee Do You Want to Order");
        Integer FreshCoffeeQuantity = in.nextInt();
        Float amount = FreshCoffeeQuantity*12.0F;

        if(cont.getCoffeepremix_container()>(5*FreshCoffeeQuantity) && cont.getWater_container()>(50*FreshCoffeeQuantity) &&
                cont.getMilk_container()>(45*FreshCoffeeQuantity) && cont.getSugar_container()>(10*FreshCoffeeQuantity)){

            Order order = new Order(productName,productId,amount,FreshCoffeeQuantity);

            System.out.println("Taking Your Order Please Wait for a while\n");

            System.out.println("----------Bill----------\n"+"Id   "+"Product   "+"Quantity   "+"Price");
            System.out.println(productId+"   "+productName+"   "+FreshCoffeeQuantity+"   "+amount);
            System.out.println("------------------------\n");

            System.out.println("Your Order is Ready. Please pay Rs."+amount+".\n");

            cont.setCoffeebean_container(cont.getCoffeebean_container());
            cont.setWater_container(cont.getWater_container() - FreshCoffeeQuantity*50);
            cont.setMilk_container(cont.getMilk_container() - FreshCoffeeQuantity*45);
            cont.setSugar_container(cont.getSugar_container() - FreshCoffeeQuantity*10);
            cont.setCoffeepremix_container(cont.getCoffeepremix_container() - FreshCoffeeQuantity*5);

        }else{
            System.out.println("Sorry Your Order cannot be processed because of Insufficient Raw Material.");
        }
    }
}
