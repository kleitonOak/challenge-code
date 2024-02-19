package oldone;

abstract public class ExampleAbs {
    abstract void method1();
    final void method2(){
        System.out.println("Here we go!!!");
        method3();
    }

    private void method3(){
        System.out.println("OK method3");
    }
}
