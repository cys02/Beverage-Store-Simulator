//用于命令模式发出命令（遥控器）

public class Client {
    Command placeCommand;
    Command cancleCommand;
    Command undoCommand;

    public Client(){
        Command noCommand = new NoCommand();
        placeCommand = noCommand;
        cancleCommand = noCommand;
        undoCommand = noCommand;
    }
    public void setCommand(Command placeCommand,Command cancleCommand){
        this.placeCommand = placeCommand;
        this.cancleCommand = cancleCommand;
    }
    public void placeOrder(){
        placeCommand.execute();
        undoCommand = placeCommand;
    }
    public void cancelOrder(){
        cancleCommand.execute();
        undoCommand = cancleCommand;
    }
    public void undoOrder(){
        undoCommand.undo();
    }
}
