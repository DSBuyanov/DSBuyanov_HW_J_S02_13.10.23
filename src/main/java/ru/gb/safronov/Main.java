package ru.gb.safronov;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр класса Market
        Market market = new Market();

        // Создаем несколько экземпляров класса Person
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob");

        // Добавляем их в очередь в магазине
        market.addPersonToQueue(person1);
        market.addPersonToQueue(person2);

        // Обновляем состояние магазина
        market.update();

        
    }
}
