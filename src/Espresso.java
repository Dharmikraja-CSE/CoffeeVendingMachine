import java.util.*;

public class Espresso {
    public void onMakeEspressoCoffee() {

        Scanner in=new Scanner(System.in);
        Container cont = new Container();
        Integer productId = 4;
        String productName = "Espresso Coffee";
        System.out.println("How Many Cups of Espresso Coffee Do You Want to Order");
        Integer EspressoCoffeeQuantity = in.nextInt();
        Float amount = EspressoCoffeeQuantity*12.0F;

        if(cont.getCoffeepremix_container()>(10*EspressoCoffeeQuantity) && cont.getWater_container()>(30*EspressoCoffeeQuantity) &&
                cont.getMilk_container()>(60*EspressoCoffeeQuantity) && cont.getSugar_container()>(10*EspressoCoffeeQuantity)){

            Order order = new Order(productName,productId,amount,EspressoCoffeeQuantity);

            System.out.println("Taking Your Order Please Wait for a while\n");

            System.out.println("----------Bill----------\n"+"Id   "+"Product   "+"Quantity   "+"Price");
            System.out.println(productId+"   "+productName+"   "+EspressoCoffeeQuantity+"   "+amount);
            System.out.println("------------------------\n");

            System.out.println("Your Order is Ready. Please pay Rs."+amount+".\n");

            cont.setCoffeebean_container(cont.getCoffeebean_container());
            cont.setWater_container(cont.getWater_container() - EspressoCoffeeQuantity*30);
            cont.setMilk_container(cont.getMilk_container() - EspressoCoffeeQuantity*60);
            cont.setSugar_container(cont.getSugar_container() - EspressoCoffeeQuantity*10);
            cont.setCoffeepremix_container(cont.getCoffeepremix_container() - EspressoCoffeeQuantity*10);

        }else{
            System.out.println("Sorry Your Order cannot be processed because of Insufficient Raw Material.");
        }
    }
}
