package study.designpattern.command.undofan;

public interface Command {
    public void execute();
    public void undo();
}
