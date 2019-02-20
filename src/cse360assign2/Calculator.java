
package cse360assign2;

public class Calculator {
    /**
     * An accumulator for use in all of the calculator methods
     */
    private int total;
    
    /**
     * Keeps track of the history of actions made by the calculator 
     */
    private StringBuffer history;
    
    /**
     * Makes a new calculator with an initial value of 0
     */
    public Calculator () {
        total = 0;  // not needed - included for clarity
        history = new StringBuffer("0");
    }
    
    /**
     * Gets the current <code>total</code> value
     * 
     * @return <code>total</code> value that has accumulated
     */
    public int getTotal () {
        return total;
    }
    
    /**
     * Adds <code>value</code> to the current <code>total</code>
     * 
     * @param <code>value</code>
     */
    public void add (int value) {
        history.append(" + ").append(value);
        total += value;
    }
    
    /**
     * Subtracts <code>value</code> from the current <code>total</code>
     * 
     * @param <code>value</code>
     */
    public void subtract (int value) {
        history.append(" - ").append(value);
        total -= value;
    }
    
    /**
     * Multiplies <code>value</code> to the current <code>total</code>
     * 
     * @param <code>value</code>
     */
    public void multiply (int value) {
        history.append(" * ").append(value);
        total *= value;
    }
    
    /**
     * Divides <code>total</code> by <code>value</code>
     * 
     * note: if <code>value</code> is 0, then <code>total</code> is set to 0
     * 
     * @param <code>value</code>
     */
    public void divide (int value) {
        history.append(" / ").append(value);
        total /= value;
    }
    
    /**
     * Gets the current history of actions
     * 
     * @return history
     */
    public String getHistory () {
        return history.toString();
    }
}