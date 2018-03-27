package main.java.com.example.demo.chain;

public class Process698Step1 implements  IProcessor{
    @Override
    public void doProcess(String token,ProcessChain chain) {
        System.out.println("======step 698=1    ");
        chain.doProcess(token,chain);
    }
}
