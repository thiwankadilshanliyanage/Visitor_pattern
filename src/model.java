
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Thiwanka
 */
public class model {

    public static void main(String[] args) {

        Element1 element1 = new Element1();
        Element2 element2 = new Element2();

        visitor visitor = new Subvisitor();
        element1.method1(visitor);
        element2.method2(visitor);
    }
}

class Element1 {

    public int method1(visitor v) {
        return v.visit(this);
    }
}

class Element2 {

    public int method2(visitor v) {
        return v.visit(this);
    }
}

interface visitor {

    public abstract int visit(Element1 element1);

    public abstract int visit(Element2 element2);
}

class Subvisitor implements visitor {

    @Override
    public int visit(Element1 element1) {
        System.out.println("Sub visitor visit 1");
        return 10;
    }

    @Override
    public int visit(Element2 element2) {
        System.out.println("Sub visitor visit 2");
        return 20;
    }

}
