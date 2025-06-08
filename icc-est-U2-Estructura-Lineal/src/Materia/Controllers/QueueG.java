package Materia.Controllers;

import java.util.NoSuchElementException;

import Materia.Models.NodeGeneric;

public class QueueG<T> {
    private NodeGeneric<T> primero;
    private NodeGeneric<T> ultimo;
    private int size;

    public QueueG(){
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }
    public void add(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        if (isEmpty()) {
            primero = newNode;
            ultimo = newNode;
        } else {
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public T remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        T aux = primero.getValue();
        primero = primero.getNext();
        size--;
        if (primero == null) {
            ultimo = null; // La cola quedó vacía
        }
        return aux;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        return primero.getValue();
    }

    public int size() {
        return size;
    }

    public void printCola() {
        NodeGeneric<T> current = primero;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

}
