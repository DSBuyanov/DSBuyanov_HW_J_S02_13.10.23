package ru.gb.safronov;

public interface QueueBehaviour {
    void enqueue(Person person);
    Person dequeue();
    int queueSize();
}
