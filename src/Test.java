/**
 *
 * @author Thiwanka
 */
public class Test {

    
    public static void main(String[] args) {
        
        A a = new A(10);
        B b = new B(20);
        
        Visitor visitor = new SubVisitor1();
        System.out.println(a.m(visitor));
        System.out.println(b.n(visitor));
        
    }
    
}


class A{
  int x; 

    public A(int x) {
        this.x= x;
    }
    public int m(Visitor visitor){
        return visitor.visit(this);
    }
}
class B{
  int y;

    public B(int y) {
        this.y = y;
    }
    public int n(Visitor visitor){
        return visitor.visit(this);
    }
}

interface Visitor{
    public abstract int visit(A a);
    public abstract int visit(B b);
}

class SubVisitor1 implements Visitor{

    @Override
    public int visit(A a) {
        return a.x+10;
    }

    @Override
    public int visit(B b) {
       return b.y*2; 
    }
    
}
class SubVisitor2 implements Visitor{

    @Override
    public int visit(A a) {
        return a.x*2;
    }

    @Override
    public int visit(B b) {
       return b.y/2; 
    }
    
}