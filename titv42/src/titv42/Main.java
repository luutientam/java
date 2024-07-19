/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package titv42;

/**
 *
 * @author luuti
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.makeSound();
        Cat c = new Cat();
        c.eat();
        c.makeSound();
        Bird b = new Bird();
        b.eat();
        b.makeSound();
        System.out.println(b.name);
    }

}
