package ua.nure.arseniuk.dmytro;

/**
 * Created by dmytro on 10/2/14.
 */
public class BrainfuckVM {
    private byte[] memory;
    private Integer index;

    public BrainfuckVM(int memorySize) {
        index = 0;
        memory = new byte[memorySize];
    }

    public BrainfuckVM() {
        this(30000);
    }

    public byte[] getMemory() {
        return memory;
    }

    public void increaseCurrentCell() {
        increaseCurrentCell(1);
    }

    public void decreaseCurrentCell() {
        decreaseCurrentCell(1);
    }

    public void increaseIndex() {
        increaseIndex(1);
    }

    public void decreaseIndex() {
        decreaseIndex(1);
    }

    public void increaseCurrentCell(int count) {
        memory[index] += count;
    }

    public void decreaseCurrentCell(int count) {
        memory[index] -= count;
    }

    public void increaseIndex(int count) {
        index += count;
    }

    public void decreaseIndex(int count) {
        index -= count;
    }

    public byte getCurrentCell() {
        return memory[index];
    }

}