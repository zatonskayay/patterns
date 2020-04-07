package third;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Music {
    private final HashMap<String, Command> commands = new HashMap<>();
    private final List<Command> undoCommands = new LinkedList<>();
    private final List<Command> redoCommands = new LinkedList<>();
    private int countOfUndo = 0;

    public void register(String name, Command command){
        commands.put(name, command);
    }

    public void execute(String name){
        Command command = commands.get(name);
        command.execute();
        undoCommands.add(command);
        redoCommands.add(command);
    }

    public void undo(){
        if (undoCommands.size() > 0){
            undoCommands.remove(undoCommands.size() - 1).undo();
            ++countOfUndo;
        }
    }

    public void redo(){
        if (countOfUndo > 0){
            redoCommands.get(redoCommands.size() - 1 - countOfUndo).execute();
        } else if (redoCommands.size() > 0){
            redoCommands.get(redoCommands.size() - 1).execute();
        }
    }
}
