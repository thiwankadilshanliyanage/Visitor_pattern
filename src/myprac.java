/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiwanka
 */
public class myprac {
    public static void main(String[] args) {
        
        vegetabales v1 = new vegetabales("carrot", 2, 50);
        Book b1 = new Book("Harry Potter", 1234, 100);
        cart c = new subCart();
        
        c.visit(v1);
        c.visit(b1);
        double tot = c.visit(b1);
        
        System.out.println(tot);
        
    }
 
}

class vegetabales{
    
    String Name;
    double Weight;
    double Price_per_Kg;

    public vegetabales(String Name,double Weight,double Price_per_Kg) {
        this.Name = Name;
        this.Weight = Weight;
        this.Price_per_Kg = Price_per_Kg;
    }
   
}
class Book{
    String Title;
    int ISBN;
    double Price;

    public Book(String Title, int ISBN, double Price) {
        this.Title = Title;
        this.ISBN = ISBN;
        this.Price = Price;
    }
    
}
class drink{
    String Name;
    double Price;

    public drink(String Name, double Price) {
        this.Name = Name;
        this.Price = Price;
    }
}
interface cart{
    public abstract double visit(vegetabales v);
    public abstract double visit(Book b);
    public abstract double visit(drink d);
}
class subCart implements cart{
double total;
    @Override
    public double visit(vegetabales v) {
        double price = v.Price_per_Kg*v.Weight;
        total = total+price;
        return total;
    }

    @Override
    public double visit(Book b) {
        total = total+b.Price;
        return total;
    }

    @Override
    public double visit(drink d) {
        total = total+d.Price;
        return total;
    }
    
}