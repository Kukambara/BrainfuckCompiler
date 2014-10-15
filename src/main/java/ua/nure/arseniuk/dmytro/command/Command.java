package ua.nure.arseniuk.dmytro.command;

import ua.nure.arseniuk.dmytro.CommandVisitor;

/**
 * Created by dmytro on 10/2/14.
 */
public interface Command {

    public void accept(CommandVisitor visitor);

    public Command newInstance();
}
