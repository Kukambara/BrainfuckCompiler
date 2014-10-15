package ua.nure.arseniuk.dmytro.command;

import ua.nure.arseniuk.dmytro.CommandVisitor;

/**
 * Created by dmytro on 10/2/14.
 */
public class Decrement extends OptimizedCommand {

    @Override
    public void accept(CommandVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Decrement newInstance() {
        return new Decrement();
    }
}
