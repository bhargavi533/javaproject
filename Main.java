package xyz;

abstract class Abstractexample {
    abstract void Atm();
     public void Atm2() {
        System.out.println("without abstract atm");
    }
}

class B extends Abstractexample {
    void Atm() {
        System.out.println("with abstract atm");
    }
}

public class Main {
    public static void main(String[] args) {
        Abstractexample b = new B(); 
        b.Atm(); 
        b.Atm2(); 
    }
}
