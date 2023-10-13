package ru.gb.safronov;

import java.util.LinkedList;
import java.util.Queue;

public class Market implements MarketBehaviour {
    private Queue<Person> queue;

    public Market() {
        this.queue = new LinkedList<>();
    }

    @Override
    public void enqueue(Person person) {
        queue.add(person);
    }

    @Override
    public Person dequeue() {
        return queue.poll();
    }

    @Override
    public int queueSize() {
        return queue.size();
    }

    @Override
    public void addPersonToQueue(Person person) {
        enqueue(person);
    }

    @Override
    public void removePersonFromQueue() {
        dequeue();
    }

    public void update() {
        // Обновление состояния магазина (принимает и отдаёт заказы)

    }
}
