public class Container {

    int teapremix_container = 2000;
    int coffeepremix_container = 2000;
    int coffeebean_container = 2000;
    int sugar_container = 8000;
    int water_container = 15000;
    int milk_container = 10000;
    public Container() {
    }

    public int getTeapremix_container() {
        return teapremix_container;
    }

    public void setTeapremix_container(int teapremix_container) {
        this.teapremix_container = teapremix_container;
    }
    public int getCoffeepremix_container() {
        return coffeepremix_container;
    }

    public void setCoffeepremix_container(int coffeepremix_container) {
        this.coffeepremix_container = coffeepremix_container;
    }

    public int getCoffeebean_container() {
        return coffeebean_container;
    }

    public void setCoffeebean_container(int coffeebean_container) {
        this.coffeebean_container = coffeebean_container;
    }

    public int getSugar_container() {
        return sugar_container;
    }

    public void setSugar_container(int sugar_container) {
        this.sugar_container = sugar_container;
    }

    public int getWater_container() {
        return water_container;
    }

    public void setWater_container(int water_container) {
        this.water_container = water_container;
    }

    public int getMilk_container() {
        return milk_container;
    }

    public void setMilk_container(int milk_container) {
        this.milk_container = milk_container;
    }

    public Container(int teapremix_container,int coffeepremix_container, int coffeebean_container, int sugar_container, int water_container, int milk_container) {
        this.teapremix_container=teapremix_container;
        this.coffeepremix_container = coffeepremix_container;
        this.coffeebean_container = coffeebean_container;
        this.sugar_container = sugar_container;
        this.water_container = water_container;
        this.milk_container = milk_container;
        setTeapremix_container(teapremix_container);
        setCoffeepremix_container(coffeepremix_container);
        setCoffeebean_container(coffeebean_container);
        setSugar_container(sugar_container);
        setWater_container(water_container);
        setMilk_container(milk_container);
    }
}
