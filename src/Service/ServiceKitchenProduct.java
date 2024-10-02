package Service;

import Model.*;

import java.util.ArrayList;
import java.util.List;

public class ServiceKitchenProduct {

    private List<KitchenProduct> inventary;

    public ServiceKitchenProduct() {
        this.inventary = new ArrayList<>();
    }

    public void addProduct(KitchenProduct k){
        inventary.add(k);
    }

    public void showInventary(){
        for (KitchenProduct k: inventary){
            System.out.println(k);
            System.out.println(k.getClass());
        }
    }

    public void getOffer(Double percentage){

        for (KitchenProduct k:inventary){

            Double priceWithDiscount = 0d;

            if(k instanceof Knife){
               priceWithDiscount = ((Knife) k).offerDiscount(percentage);
                System.out.println("al " + k.getName() + "se le aplico " + percentage+" de descuento su precio con descuento es " + priceWithDiscount);
            }if(k instanceof Blender){
               priceWithDiscount = ((Blender) k).offerDiscount(percentage);
                System.out.println("a la " + k.getName() + "se le aplico " + percentage+" de descuento su precio con descuento es " + priceWithDiscount);
            }
        }

    }

    public void newPrice(){

        for (KitchenProduct k:inventary){

            Double percentage = 0d;
            Double oldPrice = 0d;

            if (k instanceof Blender){
                percentage = 1.07;
                oldPrice = k.getPrice();
            }
            if (k instanceof Oven){
                percentage = 1.12;
                oldPrice = k.getPrice();

            }if (k instanceof Knife){
                percentage = 1.17;
                oldPrice = k.getPrice();

            }if (k instanceof Pan){
                percentage = 1.22;
                oldPrice = k.getPrice();

            }

            k.setPrice(k.calculatePrice(percentage));
            System.out.println("Precio anterior de " + k.getName() + " " + oldPrice + " con el aumento es " + k.getPrice());


        }

    }


}
