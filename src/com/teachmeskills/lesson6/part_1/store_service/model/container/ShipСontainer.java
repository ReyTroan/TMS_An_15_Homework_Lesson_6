package com.teachmeskills.lesson6.part_1.store_service.model.container;

/**
 * Добавил переменную price;
 * Доработал конструктор класса;
 * Переопределил метод toString()
 */
public class ShipСontainer {

    // Fields
    int width;
    int length;
    int depth;
    String containerModel;
    public double price;

    public ShipСontainer() {
        System.out.println("Без параметров");
        this.width = 1;
        this.length = 2;
        this.depth = 3;
        this.containerModel = "Кастомный контейнер";
    }

    public ShipСontainer(int width, int length, int depth) {
        System.out.println("С параметрами");
        this.width = width;
        this.length = length;
        this.depth = depth;
        this.containerModel = "Кастомный контейнер";
    }

    public ShipСontainer(int width, int length, int depth, double price) {
        System.out.println("С параметрами + цена");
        this.width = width;
        this.length = length;
        this.depth = depth;
        this.containerModel = "Еще один кастомный контейнер";
        this.price = price;
    }

    public ShipСontainer(int width, int length, int depth, String boxModel, double price) {
        System.out.println("С параметрами + цена + модель");
        this.width = width;
        this.length = length;
        this.depth = depth;
        this.containerModel = boxModel;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Container: [width:" + width + ", length:" + length + ", depth:" + depth + "]"
                + "model - " + "*" + containerModel + "*" + " price:" + price;

    }
}
