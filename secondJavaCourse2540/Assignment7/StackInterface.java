package secondJavaCourse2540.Assignment7;

public interface StackInterface<E> {
    /**
     * Determines whether the stack is empty.
     * @return True if the stack is empty and false otherwise
     */
    public boolean isEmpty();


    /**
     * Removes all the items from the stack.
     * Postcondition: Stack is empty.
     */
    public void popAll();


    /**
     * Adds an item to the top of the stack.
     * @param newItem The item to be added.
     */
    public void push(E newItem);


    /**
     * Removes the top of a stack.
     * @return The item that was most recently added to the stack.
     * @throws StackException if the stack is empty.
     */
    public E pop() throws StackException;


    /**
     * Retrieves the top of a stack.
     * @return The item that was most recently added to the stack.
     * @throws StackException if the stack is empty.
     */
    public E peek() throws StackException;

}