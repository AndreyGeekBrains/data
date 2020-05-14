package homework.lesson5;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        // Рюкзак
        List<Item> items = new ArrayList<>();
        items.add(new Item("Книга",   1, 100));
        items.add(new Item("Бинокль", 2, 2000));
        items.add(new Item("Аптечка", 4, 1500));
        items.add(new Item("Ноутбук", 2, 55000));
        items.add(new Item("Котелок", 1, 200));


        Backpack backpack = new Backpack(5);
        backpack.calcBestSet(items);

        for (Item item : backpack.getBestSet()) {
            System.out.println(item.getName() + " " + item.getPrice());
        }

        System.out.println("Лучшая цена: " + backpack.getBestPrice());
    }

}
