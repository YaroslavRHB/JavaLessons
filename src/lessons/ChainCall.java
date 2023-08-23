package lessons;

public class ChainCall {

    public ChainCall action1() {
        System.out.println("action1");
        return this;
    }

    public ChainCall action2() {
        System.out.println("action2");
        return this;
    }
}

class TestChainCall {
    public static void main(String[] args) {
        ChainCall call1 = new ChainCall();

       /* call1.action1();
        call1.action2();*/

        call1
                .action1()//return this
                .action2()
                .action2()
                .action1();

//        new StringBuilder().append().append()
    }
}
