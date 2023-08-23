package com.teachmeskills.lesson6.part_1.store_service.model.store;

import com.teachmeskills.lesson6.part_1.store_service.model.container.ShipСontainer;

/**
 * Добавил метод добавления контейнера в существующий массив контейнеров;
 * Добавил метод подсчета общей суммы цен контейнеров в массиве;
 */

public class Warehouse {

    // Fields
    public String address;
    public ShipСontainer[] containers;


    // Constructors
    public Warehouse() {
        this.address = "Amsterdam";
    }


    public Warehouse(String address, ShipСontainer[] containers) {
        this.address = address;
        this.containers = containers;
    }


    // Methods
    public void setContainers(ShipСontainer[] containers){
        // System.out.println("Adding containers");
        this.containers = containers;
       // System.out.println("Containers are added");
    }

    public void addContainers(ShipСontainer[] containers){
        int total = containers.length + this.containers.length;
        ShipСontainer[] count = new ShipСontainer[total];


        for (int i = 0; i < this.containers.length; i++){
            count[i] = this.containers[i];

        }
        for (int j = 0; j < containers.length; j++){
            count[this.containers.length + j] = containers[j];
        }

        this.containers = count;

    }

public double getPriceAllContainer() {
        double[] getPrice = new double[this.containers.length];
        double sum = 0;
        for (int i = 0; i < this.containers.length; i++) {
            getPrice[i] = this.containers[i].price;
        }

        for (int j = 0; j < this.containers.length; j++) {
            sum += getPrice[j];
        }

        return sum;
    }

}