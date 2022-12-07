import javafx.concurrent.Task;

import java.util.concurrent.Executor;

public class Invoker implements Executor {
    @Override
    public void execute(Runnable r) {
        r.run();
    }
    public void execute() {
        Executor exe = new Invoker();
        exe.execute( () -> System.out.println("select 'Enter' to continue"));{
            // task to be performed
        }

    }

}

