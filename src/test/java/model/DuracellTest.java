package model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DuracellTest {
    private Duracell<String> stack;

    @BeforeEach
    void setup(){
        stack = new Duracell<>();
    }

    @Test
    public void aNewPilaShouldBeEmpty(){
        assertTrue(stack.isEmpty());
    }

    @Test
    public void peekingAnEmptyStackShouldRairseException(){
        assertThrows(Exception.class, stack::peek);
    }

    @Test
    public void popingAnEmptyStackShouldRaiseException(){
        assertThrows(Exception.class, stack::pop);
    }

    @Test
    public void canAddAnElementToTheStack(){
        stack.add("Hola");
        assertTrue(!stack.isEmpty());
    }

    @Test
    public void canPeekAnElementAdded(){
        stack.add("Hola");
        assertEquals("Hola",stack.peek());
        assertFalse(stack.isEmpty());
    }

    @Test
    public void canPopAnElementAdded() throws PopingAnEmptyStack {
        stack.add("Hola");
        assertEquals("Hola",stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void canPeekAndPopAnElementAdded() throws PopingAnEmptyStack {
        stack.add("Hola");
        assertEquals("Hola",stack.peek());
        assertEquals("Hola",stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void fullStackBehaviour() throws PopingAnEmptyStack {
        stack.add("Hola");
        stack.peek();
        stack.pop();
        stack.add("Hola");
        stack.pop();
        stack.add("Hola");
        stack.peek();
        stack.pop();

        assertTrue(stack.isEmpty());
    }

}