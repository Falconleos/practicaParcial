import Model.*;
import Service.ServiceKitchenProduct;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ServiceKitchenProduct serviceKitchenProduct = new ServiceKitchenProduct();

        Blender blender = new Blender("Atma",13,120.0, Type.MANO);
        Blender blender1 = new Blender("Phillip",12,200.0, Type.PIE);
        Knife knife = new Knife("Tramontina",18,220.0,"Acero");
        Oven oven = new Oven("Kelvinator",4,500.0,28.0,28.0);
        Pan pan = new Pan("Gloriosa",20,60.0,1.5);

        serviceKitchenProduct.addProduct(blender);
        serviceKitchenProduct.addProduct(blender1);
        serviceKitchenProduct.addProduct(knife);
        serviceKitchenProduct.addProduct(oven);
        serviceKitchenProduct.addProduct(pan);

        serviceKitchenProduct.showInventary();

        serviceKitchenProduct.getOffer(15.0);

        serviceKitchenProduct.newPrice();

    }
}