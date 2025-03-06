/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author luuti
 */
public class MiniCalculatorModel {

    private double firstValue;
    private double secondValue;
    private double answer;

    public MiniCalculatorModel() {

    }

    public double getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public void cong() {
        this.answer = this.firstValue + this.secondValue;

    }

    public void tru() {
        this.answer = this.firstValue - this.secondValue;

    }

    public void nhan() {
        this.answer = this.firstValue * this.secondValue;

    }

    public void chia() {
        this.answer = this.firstValue / this.secondValue;

    }

    public void mu() {
        this.answer = Math.pow(this.firstValue, this.secondValue);

    }

    public void chiaLayDu() {
        this.answer = this.firstValue % this.secondValue;

    }
}
