package main.java.com.example.demo.chain;

public class TestChain {

    public  static  void  main(String[] args)
    {
        ProcessChain chain = new ProcessChain();
        chain.addProcess(new Process698Step1()).addProcess(new Process698Step2()).addProcess(new Process698Step3()).doProcess("testToke",chain);





    }
}
