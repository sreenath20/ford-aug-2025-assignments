//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        object for Electronics is created
       Electronics electronics = new Electronics();
       electronics.setBrand("Mobile");
       electronics.setPrice(20000.0);
       electronics.displayProductInfo();


//       object for clothing is created
       Clothing tShirt = new Clothing();
        tShirt.setProductName("H&M");
       tShirt.setFabric("cotten");
        tShirt.setDescription("Clothed Shirt");
        tShirt.setPrice(600.0);
        tShirt.displayProductInfo();

//        object for groceries is created

        Groceries dal=new Groceries();
        dal.setPrice(150.0);
        dal.setExpiryInMonths(6);
        dal.setProductName("Dal");
        dal.displayProductInfo();



    }
}