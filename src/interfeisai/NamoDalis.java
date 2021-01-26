package interfeisai;

public abstract class NamoDalis implements Elektra { //modifikatorius abstract
    
    private int aukstai; //tik toje pacioje kalseje pasiekiami
    protected boolean dega = false; //savo ir vaiko klasese
    
    public NamoDalis(int aukstai) {
        this.aukstai = aukstai;
    }

    public int getAukstai() {
        return aukstai;
    }

    public void setAukstai(int aukstai) {
        this.aukstai = aukstai;
    }
    public abstract void uzrakintiLaiptine(); //metodas be kuno
    
    public void isjunk() {
        dega = false;
        System.out.println("sviesa name isjungta");
    }
    
}

