package interfeisai;

public class DidelisNamas extends NamoDalis { //vaikas ir tevas
    
    public DidelisNamas(int aukstai) {
        super(aukstai);
    }
    
    public void ijunk() { //tik ijunk metoda aprasom, nes isjunk paveldi is tevo
        dega = true;
        System.out.println("Dedeliame name sviesa dega");
    }
    public void uzrakintiLaiptine() {
        System.out.println("reikalavimas kad butu metodas uzrakinti laiptine");
    }

}
