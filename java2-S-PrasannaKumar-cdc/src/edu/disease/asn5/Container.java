package edu.disease.asn5;

/**
 * A generic container class that stores an array of objects of type T.
 *
 * @param <T> The type of objects to be stored in the container.
 */
public class Container<T> {
    private T[] obj;
    /**
     * Constructs a Container with the provided objects.
     *
     * @param object The objects to be stored in the container.
     * @throws IllegalArgumentException if no arguments are provided.
     */
    public Container(T... ts) {
        if (ts.length == 0) {
            throw new IllegalArgumentException("No arguments provided.");
        }
        this.obj = ts;
    }

    /**
     * Returns the number of elements in the container.
     *
     * @return The number of elements in the container.
     */
    public int size() {
        return obj.length;
    }

    /**
     * Retrieves the element at the specified index.
     *
     * @param index The index of the element to retrieve.
     * @return The element at the specified index.
     * @throws IllegalArgumentException if the index is out of bounds.
     */
    public T get(int index) {
        if (index >= obj.length || index < 0) {
            throw new IllegalArgumentException("Invalid index.");
        }
        return obj[index];
    }
}