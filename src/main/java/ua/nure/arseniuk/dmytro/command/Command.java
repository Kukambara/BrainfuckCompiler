package ua.nure.arseniuk.dmytro.command;

import ua.nure.arseniuk.dmytro.BrainfuckVM;

/**
 * Created by dmytro on 10/2/14.
 */
public abstract class Command {
    public abstract void execute(BrainfuckVM brainfuckVM);
}
