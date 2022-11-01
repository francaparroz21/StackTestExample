package model;

public class PopingAnEmptyStack extends Exception {
    @Override
    public String getMessage() {
        return "You are poping an empty stack, add an element and try";
    }
}
