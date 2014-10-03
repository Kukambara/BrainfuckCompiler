package ua.nure.arseniuk.dmytro.command;

import ua.nure.arseniuk.dmytro.BrainfuckVM;

/**
 * Created by dmytro on 10/2/14.
 */
public class MoveRight extends OptimizedCommand {

    @Override
    public void execute(BrainfuckVM brainfuckVM) {
        brainfuckVM.increaseIndex(super.count);
    }

}
