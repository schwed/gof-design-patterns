package com.icoderman.behavioral.templatemethod.example1;

public class TemplateMethodDemo1 {
    public static void main(String[] args) {
        System.out.println("Web Order: ");
        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();

        System.out.println("Store Order: ");
        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();
    }
}
