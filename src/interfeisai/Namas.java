package interfeisai;

public class Namas implements Elektra, Vent, Vanduo { //paveldeta nuo object
    
    private boolean dega = false;
    
    @Override
    public void ijunk() {
        dega = true;
        System.out.println("sviesa name ijungta");
    }
    @Override
    public void isjunk() {
        dega = false;
        System.out.println("sviesa name isjungta");
    }
    @Override
    public void pusk() {
        System.out.println("puca pucia");
    }

    @Override
    public String toString() {
        return "Namas{" + "dega=" + dega + '}';
    }

    @Override
    public void atsuk() {
        System.out.println("namie vanduo teka");
    }

    @Override
    public void uzsuk() {
        System.out.println("namie vanduo neteka");
    }

    @Override
    public void nuleisk() {
        System.out.println("nuleidziamas vanduo");
    }
        
}
