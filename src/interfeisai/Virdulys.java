package interfeisai;

public class Virdulys implements Elektra {

    private int temp;
        
    public Virdulys() {
    this.temp = 20;        
    }
    
    public void ijunk() {
        this.temp = 100;
        System.out.println("Virdulys verda " + this.temp);
    }

    @Override
    public void isjunk() {
        this.temp = 20;
        System.out.println("Virdulys austa " + this.temp);
    }
    
}
