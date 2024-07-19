/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv42;

/**
 *
 * @author luuti
 */
public class Cat extends Animal{
    
    public Cat() {
        super("cat");
    }


    @Override
    public void makeSound() {
        System.out.println("meo meo"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void eat() {
        System.out.println("toi an ca"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
