import helper.EhliyetInterface;
import helper.PasaportInterface;

import java.util.Date;

public class IdKimlik extends BaseBilgiler implements EhliyetInterface, PasaportInterface {
    private final String dogumyeri;
    public IdKimlik(String isim, Date dogumyeri, Cinsiyet cinsiyet, String dogumyeri1) {
        super(isim, dogumyeri, cinsiyet);
        this.dogumyeri = dogumyeri1;
    }
    public String getDogumyeri(){
        return dogumyeri;
    }

    @Override
    public String getEhliyetTürü() {
        return this.getEhliyetTürü();
    }

    @Override
    public int pasaportno() {
        return this.pasaportno();
    }
}
