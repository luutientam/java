/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package titv40;

/**
 *
 * @author luuti
 */
public class Main {

    public static void main(String[] args) {
        //        Dog dog = new Dog();
        //        dog.eat();    

        BabyDog baby = new BabyDog();
        baby.bark();
        baby.weep();
        baby.name = "tung anh";
//        baby.setName("sdfskdjfnsd");
        System.out.println(baby.name);
    }
}
