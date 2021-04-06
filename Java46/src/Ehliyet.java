import helper.EhliyetInterface;

import java.util.Date;

public class Ehliyet extends BaseBilgiler implements EhliyetInterface {
    private final String ehliyetTuru;

    public Ehliyet(String isim, Date dogumyeri, Cinsiyet cinsiyet, String ehliyetTuru) {
        super(isim, dogumyeri, cinsiyet);
        this.ehliyetTuru = ehliyetTuru;
    }

    @Override
    public String getEhliyetTürü() {
        return this.ehliyetTuru;
    }
}
