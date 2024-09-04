import java.util.*;

public class BeanCoffee {
    public void onMakeBeanCoffee() {

        Scanner in=new Scanner(System.in);
        Container cont = new Container();
        Integer productId = 1;
        String productName = "Bean Coffee";
        System.out.println("How Many Cups of Bean Coffee Do You Want to Order");
        Integer BeanCoffeeQuantity = in.nextInt();
        Float amount = BeanCoffeeQuantity*10.0F;

        if(cont.getCoffeebean_container()>(8*BeanCoffeeQuantity) && cont.getWater_container()>(50*BeanCoffeeQuantity) &&
                cont.getMilk_container()>(25*BeanCoffeeQuantity) && cont.getSugar_container()>(10*BeanCoffeeQuantity)){

            Order order = new Order(productName,productId,amount,BeanCoffeeQuantity);

            System.out.println("Taking Your Order Please Wait for a while\n");

            System.out.println("----------Bill----------\n"+"Id   "+"Product   "+"Quantity   "+"Price");
            System.out.println(productId+"   "+productName+"   "+BeanCoffeeQuantity+"   "+amount+"\n");
            System.out.println("------------------------\n");

            System.out.println("Your Order is Ready. Please pay Rs."+amount+".\n");

            cont.setCoffeepremix_container(cont.getCoffeepremix_container());
            cont.setWater_container(cont.getWater_container() - BeanCoffeeQuantity*50);
            cont.setMilk_container(cont.getMilk_container() - BeanCoffeeQuantity*25);
            cont.setSugar_container(cont.getSugar_container() - BeanCoffeeQuantity*10);
            cont.setCoffeebean_container(cont.getCoffeebean_container() - BeanCoffeeQuantity*8);

        }else{
            System.out.println("Sorry Your Order cannot be processed because of Insufficient Raw Material.");
        }
    }
}
