public class main {
    public static void main(String[] args) {

        Pizza pizza=new Pizza("cheese pizza");
        pizza.prepare();
        pizza.deliver(12);

        System.out.println("-------------------");

        Burger burger=new Burger("chicken burger");
        burger.prepare();
        burger.deliver(5);

    }
}
