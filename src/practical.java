/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiwanka
 */
public class practical {
    public static void main(String[] args) {
        
        Vegetables v1=new Vegetables("Beans", 20, 70);
        Vegetables v2=new Vegetables("Pumpkin", 1.5, 85);
        Books b1=new Books("IT", 12353252, 160);
        Drinks d1=new Drinks("Coke", 100);
        
        Cart c=new SubCart();
        
        c.visit(v1);
        c.visit(v2);
        c.visit(b1);
        double tot=c.visit(d1);
        
        System.out.println(tot);
        
    }
}

class Vegetables{
    
    String name;
    double weightInKg;
    double pricePerKg;

    public Vegetables(String name, double weightInKg, double pricePerKg) {
        this.name = name;
        this.weightInKg = weightInKg;
        this.pricePerKg = pricePerKg;
    }
    
    public double addToCart(Cart cart){
        return cart.visit(this);
    }
    
}

class Books{
    
    String name;
    int isbn;
    double price;

    public Books(String name, int isbn, double price) {
        this.name = name;
        this.isbn = isbn;
        this.price = price;
    }
    
    public double addToCart(Cart cart){
        return cart.visit(this);
    }
    
}

class Drinks{
    
    String name;
    double price;

    public Drinks(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public double addToCart(Cart cart){
        return cart.visit(this);
    }
    
}

interface Cart{
    public abstract double visit(Vegetables v);
    public abstract double visit(Books b);
    public abstract double visit(Drinks d);
}

class SubCart implements Cart{
    
    double total;

    @Override
    public double visit(Vegetables v) {
        double price=v.pricePerKg*v.weightInKg;
        total=total+price;
        return total;
    }

    @Override
    public double visit(Books b) {
        total=total+b.price;
        return total;
    }

    @Override
    public double visit(Drinks d) {
        total=total+d.price;
        return total;
    }
    
}
