/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv42;

/**
 *
 * @author luuti
 */
public class Animal {

    protected String name;

//    public Animal() {
//    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("tao dang an ");
    }

    public void makeSound() {
        System.out.println("jkdfngdngsd");
    }

    public void sleep() {
        System.out.println("zzzzzzzzzzzzzz");
    }

}
