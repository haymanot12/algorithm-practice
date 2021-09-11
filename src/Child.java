public class Child extends Parent{

    @Override
    public void setX(int x) {
        x = x+1;
    }
    @Override
    public static int sum(int a, int y){
        return a+y;

    }

}
