package ua.nure.arseniuk.dmytro.command;

/**
 * Created by dmytro on 10/2/14.
 */
public abstract class OptimizedCommand extends Command {
    protected int count = 1;

    public void increase() {
        count++;
    }

}
