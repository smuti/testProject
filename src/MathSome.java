/**
 * Created by sabrimutlucag on 25/04/16.
 */
public class MathSome {
    private int numberOne;
    private int numberTwo;

    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public MathSome(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int addNumbers(){
        return this.numberOne + this.numberTwo;
    }

    public int multiplyNumbers(){
        return this.numberOne * this.numberTwo;
    }

    public int substractNumbers(){
        return this.numberOne - this.numberTwo;
    }
}
