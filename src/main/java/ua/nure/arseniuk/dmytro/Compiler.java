package ua.nure.arseniuk.dmytro;

import ua.nure.arseniuk.dmytro.command.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by dmytro on 10/2/14.
 */
public class Compiler {
    public static List<Command> compile(String input) {
        List<Command> commands = new LinkedList<Command>();
        Stack<Cycle> cycleCommands = new Stack<Cycle>();
        Command lastCommand = null;                             // Store last command for optimization.
        Command command = null;

        for (char c : input.toCharArray()) {
            switch (c) {
                case '>':
                    if (lastCommand instanceof MoveRight) {
                        ((MoveRight) lastCommand).increase();
                    } else {
                        command = new MoveRight();
                    }
                    break;
                case '<':
                    if (lastCommand instanceof MoveLeft) {
                        ((MoveLeft) lastCommand).increase();
                    } else {
                        command = new MoveLeft();
                    }
                    break;
                case '+':
                    if (lastCommand instanceof Increment) {
                        ((Increment) lastCommand).increase();
                    } else {
                        command = new Increment();
                    }
                    break;
                case '-':
                    if (lastCommand instanceof Decrement) {
                        ((Decrement) lastCommand).increase();
                    } else {
                        command = new Decrement();
                    }
                    break;
                case '.':
                    command = new Print();
                    break;
                case '[':
                    cycleCommands.push(new Cycle());
                    lastCommand = null;
                    break;
                case ']':
                    command = cycleCommands.pop();
                    lastCommand = null;
                    break;
                default:
                    command = null;
            }
            if (command == null) {
                continue;
            } else if (cycleCommands.size() != 0) {
                cycleCommands.peek().add(command);
            } else {
                commands.add(command);
            }
            lastCommand = command;
        }
        return commands;
    }
}
