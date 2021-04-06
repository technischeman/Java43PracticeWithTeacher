import helper.PasaportInterface;

import java.util.Date;

public class Pasaport extends BaseBilgiler implements PasaportInterface {
    private final int pasaportNo;

    public Pasaport(String isim, Date dogumyeri, Cinsiyet cinsiyet, int pasaporto) {
        super(isim, dogumyeri, cinsiyet);
        this.pasaportNo = pasaporto;
    }

    @Override
    public int pasaportno() {
        return this.pasaportNo;
    }
}
