import java.util.*;

public class Premix {
    public void onMakePremixTea() {

        Scanner in=new Scanner(System.in);
        Container cont = new Container();
        Integer productId = 3;
        String productName = "Premix Tea";
        System.out.println("How Many Cups of Premix Tea Do You Want to Order");
        Integer PremixTeaQuantity = in.nextInt();
        Float amount = PremixTeaQuantity*15.0F;

        if(cont.getTeapremix_container()>(10*PremixTeaQuantity) && cont.getWater_container()>(50*PremixTeaQuantity) &&
                cont.getMilk_container()>(25*PremixTeaQuantity) && cont.getSugar_container()>(15*PremixTeaQuantity)){

            Order order = new Order(productName,productId,amount,PremixTeaQuantity);

            System.out.println("Taking Your Order Please Wait for a while\n");

            System.out.println("----------Bill----------\n"+"Id   "+"Product   "+"Quantity   "+"Price");
            System.out.println(productId+"   "+productName+"   "+PremixTeaQuantity+"   "+amount);
            System.out.println("------------------------\n");

            System.out.println("Your Order is Ready. Please pay Rs."+amount+".\n");

            cont.setCoffeebean_container(cont.getCoffeebean_container());
            cont.setWater_container(cont.getWater_container() - PremixTeaQuantity*50);
            cont.setMilk_container(cont.getMilk_container() - PremixTeaQuantity*25);
            cont.setSugar_container(cont.getSugar_container() - PremixTeaQuantity*15);
            cont.setTeapremix_container(cont.getTeapremix_container() - PremixTeaQuantity*10);

        }else{
            System.out.println("Sorry Your Order cannot be processed because of Insufficient Raw Material.");
        }
    }
}
