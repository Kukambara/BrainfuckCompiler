package ua.nure.arseniuk.dmytro.command;

import ua.nure.arseniuk.dmytro.BrainfuckVM;
import ua.nure.arseniuk.dmytro.Interpreter;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by dmytro on 10/2/14.
 */
public class Cycle extends Command {

    private List<Command> commands;

    public Cycle() {
        commands = new LinkedList<Command>();
    }

    @Override
    public void execute(BrainfuckVM brainfuckVM) {
        while (brainfuckVM.getCurrentCell() != 0) {
            Interpreter.interpret(commands, brainfuckVM);
        }
    }

    public void add(Command command) {
        commands.add(command);
    }
}
