package programme_21_abstractexample23;

public class TestAbstraction1 {

    public static void main(String[] args){
        Shape s = new Circle1(); //in a real scenario, object is provide through method, e.g.,get shape() method
        s.draw();
    }
}
