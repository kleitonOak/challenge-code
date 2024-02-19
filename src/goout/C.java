package goout;

public class C implements A, B{

    enum Level{
        LOW("LOW"),
        MEDIUM("MEDIUM"),
        HIGH("HIGH");

        Level(String levelName){
            this.label = levelName;
        }
        private String label;
    }
    public void methodA() {
        System.out.println("Say hi Method A");
    }

    public static void main(String[] args) {
        B element = new C();
        element.methodA();
        element.methodB();
        System.out.println(MyEnum.RIGHT);
        System.out.println(Level.HIGH);


        System.out.println("================");
        for(Level level: Level.values()){

            System.out.println(level);
        }

        System.out.println(crazyMethod());

    }

    public static String crazyMethod(){
        String result = null;
        try{
            result.charAt(1);
        }catch(Exception any){
            return "Exception";
        }finally {
            return "Finally";
        }
    }
}
