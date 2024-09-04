import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        Container cont = new Container();
        BeanCoffee b=new BeanCoffee();
        FreshMilk f=new FreshMilk();
        Premix p=new Premix();
        Espresso e=new Espresso();
        int counter=0;

        int choice;
        while(true){
            System.out.println("-------Menu------");
            System.out.println("1.Make Bean Coffee");
            System.out.println("2.Make Fresh Milk COffee");
            System.out.println("3.Make Premix Tea");
            System.out.println("4.Make Espresso Coffee");
            System.out.println("5.Refill Container ");
            System.out.println("6.Container Status ");
            System.out.println("0.Exit");
            System.out.println("----------------- ");
            System.out.print("Enter Your Choice--");
            choice=in.nextInt();
            switch(choice){
                case 1:
                    b.onMakeBeanCoffee();
                    break;
                case 2:
                    f.onMakeFreshCoffee();
                    break;
                case 3:
                    p.onMakePremixTea();
                    break;
                case 4:
                    e.onMakeEspressoCoffee();
                    break;
                case 5:
                    cont.setCoffeebean_container(2000);
                    cont.setCoffeepremix_container(2000);
                    cont.setTeapremix_container(2000);
                    cont.setSugar_container(8000);
                    cont.setWater_container(15000);
                    cont.setMilk_container(1000);
                    counter = counter + 1;
                    System.out.println("Container Refilled Successful");
                    System.out.println("Container Refilled "+counter+" Times.");
                    break;
                case 6:
                    System.out.println("Container Status:");
                    System.out.println("");
                    System.out.println("Coffee Bean Container = "+cont.getCoffeebean_container()+" Grams");
                    System.out.println("Coffee Premix Container = "+cont.getCoffeepremix_container()+" Grams");
                    System.out.println("Tea Premix Container = "+cont.getTeapremix_container()+" Grams");
                    System.out.println("Sugar Container = "+cont.getSugar_container()+" Grams");
                    System.out.println("Milk Container = "+cont.getMilk_container()+" ml");
                    System.out.println("Water Container = "+cont.getWater_container()+" ml");
                    break;
                case 0:
                    System.out.println("Thank You For Using Our Service. ");
                    System.exit(0);
                    break;
            }
        }
    }
}