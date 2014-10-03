package ua.nure.arseniuk.dmytro;

import ua.nure.arseniuk.dmytro.command.Command;

import java.util.List;

/**
 * Created by dmytro on 10/2/14.
 */
public class Interpreter {

    public static void interpret(List<Command> commands) {
        BrainfuckVM brainfuckVM = new BrainfuckVM();
        Interpreter.interpret(commands, brainfuckVM);
    }

    public static void interpret(List<Command> commands, BrainfuckVM brainfuckVM) {
        for (Command command : commands) {
            command.execute(brainfuckVM);
        }
    }
}
