package ua.nure.arseniuk.dmytro;

import ua.nure.arseniuk.dmytro.command.*;

/**
 * Created by dmytro on 10/9/14.
 */
public interface CommandVisitor {

    public void visit(Increment increment);

    public void visit(Decrement decrement);

    public void visit(MoveLeft moveLeft);

    public void visit(MoveRight moveRight);

    public void visit(Print print);

    public void visit(Cycle cycle);

    public void visit(EndCycle endCycle);
}
