package com.teachmeskills.lesson6.part_1.store_service;

import com.teachmeskills.lesson6.part_1.store_service.model.container.ShipСontainer;
import com.teachmeskills.lesson6.part_1.store_service.model.store.Warehouse;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Старт");

        Warehouse warehouse = new Warehouse();

        ShipСontainer container1 = new ShipСontainer();
        ShipСontainer container2 = new ShipСontainer(10, 20, 30, 1000);
        ShipСontainer container3 = new ShipСontainer(
                11, 22, 33, "Мой кастомный контейнер", 888.0);


        ShipСontainer[] containers = {container1, container2};

        ShipСontainer[] array = {container3};
        warehouse.setContainers(containers);

        warehouse.addContainers(array);
        System.out.println(Arrays.toString(warehouse.containers));
        System.out.println("Сумма всех контейнеров: " + warehouse.getPriceAllContainer());

        System.out.println("Конец");
    }

}


