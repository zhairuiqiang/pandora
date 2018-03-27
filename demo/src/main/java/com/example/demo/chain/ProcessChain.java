package main.java.com.example.demo.chain;

import java.util.ArrayList;
import java.util.List;

public class ProcessChain  implements  IProcessor{
    private List<IProcessor> steps = new ArrayList<IProcessor>();
    private  int index = 0;
    public ProcessChain addProcess(IProcessor process)
    {
        steps.add(process);
        return this;
    }

    @Override
    public void doProcess(String token, ProcessChain chain) {
        if(steps.size() == 0)
            return;
        IProcessor processor = steps.get(index++);
        processor.doProcess(token,chain);
    }
}
