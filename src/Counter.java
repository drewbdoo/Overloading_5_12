public class Counter {
    private int value;

    public Counter(){
        value = 0;
    }

    public Counter(int startValue){
        value = startValue;
    }

    public int value(){
        return value;
    }
    public void increase(){
        value += 1;
    }
    public void increase(int increaseby){
        if(increaseby>0){
            value += increaseby;
        }
    }
    public void decrease(int decreaseby){
        if(decreaseby>0){
            value -= decreaseby;
        }
    }
    public void decrease(){
        value -= 1;
    }
}
