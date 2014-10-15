package ua.nure.arseniuk.dmytro.command;

import ua.nure.arseniuk.dmytro.CommandVisitor;

/**
 * Created by dmytro on 10/15/14.
 */
public class EndCycle implements Command {

    @Override
    public void accept(CommandVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public EndCycle newInstance() {
        return new EndCycle();
    }
}
