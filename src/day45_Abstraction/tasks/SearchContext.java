package day45_Abstraction.tasks;

public interface SearchContext {
    public abstract void findElements(String locator); // public and abstract are by default
    public abstract void findElement(String locator);


}
