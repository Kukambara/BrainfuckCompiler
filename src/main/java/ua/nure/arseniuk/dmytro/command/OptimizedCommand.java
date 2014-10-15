package ua.nure.arseniuk.dmytro.command;

/**
 * Created by dmytro on 10/2/14.
 */
public abstract class OptimizedCommand implements Command {
    private int count = 1;

    public void increase() {
        count++;
    }

    public int getCount() {
        return count;
    }

}
