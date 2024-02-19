package goout;

public interface B {
    void methodA();
    default void methodB(){
        System.out.println("Say hi Method B");
    }
}
