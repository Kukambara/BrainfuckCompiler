package ua.nure.arseniuk.dmytro.command;

import ua.nure.arseniuk.dmytro.BrainfuckVM;

/**
 * Created by dmytro on 10/2/14.
 */
public class Print extends Command {
    @Override
    public void execute(BrainfuckVM brainfuckVM) {
        System.out.print((char) brainfuckVM.getCurrentCell());
    }
}
