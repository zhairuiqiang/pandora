package main.java.com.example.demo.chain;

public class Process698Step3 implements  IProcessor{
    @Override
    public void doProcess(String token,ProcessChain chain) {
        System.out.println("======step 698=3    ");
        chain.doProcess(token,chain);
    }
}
