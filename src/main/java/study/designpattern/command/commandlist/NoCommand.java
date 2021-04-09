package study.designpattern.command.commandlist;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println();
    }
}
