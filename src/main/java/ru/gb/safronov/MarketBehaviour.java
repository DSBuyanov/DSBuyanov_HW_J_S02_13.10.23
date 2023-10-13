package ru.gb.safronov;

public interface MarketBehaviour extends QueueBehaviour {
    void addPersonToQueue(Person person);
    void removePersonFromQueue();
}
