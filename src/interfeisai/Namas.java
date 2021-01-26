package interfeisai;

public class Namas extends NamoDalis implements Elektra, Vent, Vanduo { //paveldeta nuo object
    
    public Namas() { //jeigu nenurodziau parametru(kiek aukstu bus)
        super(5);
    }
    public Namas(int aukstai) {
        super(aukstai);
    }
    
    //isjunk metodas irasytas NamoDalis klaseje, kuri paveldim
    
    @Override
    public void ijunk() {
        dega = true;
        System.out.println("sviesa name ijungta");
    }
//isjunk metodas yra NamoDalis klaseje
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
    
    public void uzrakintiLaiptine() {
        System.out.println("reikalavimas kad butu metodas uzrakinti laiptine");
    }
        
}
