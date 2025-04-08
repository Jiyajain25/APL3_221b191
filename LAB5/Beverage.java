abstract class Beverage{
    private void pourBeverage(int qty){
        System.out.println("Pour "+qty+"ml of beverage into glass");
    }
    protected abstract void addContiment();
    protected void stir(){}
    private void serve(){
        System.out.println("Serve through waiter");
    }
    public void templateMethod(int qty){
        pourBeverage(qty);
        addContiment();
        stir();
        serve();
    }
}