package Command;

public class ExitCommand extends Command {
    @Override
    public void execute(String input) {
        System.exit(0);
    }
}
