import helper.IdKimlikInterface;

import java.util.Date;

public class BaseBilgiler implements IdKimlikInterface {
    private String isim;

    public String getIsim() {
        return isim;
    }

    public String getDogumyeri() {
        return String.valueOf(dogumyeri);
    }

    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public BaseBilgiler(String isim, Date dogumyeri, Cinsiyet cinsiyet) {
        this.isim = isim;
        this.dogumyeri = dogumyeri;
        this.cinsiyet = cinsiyet;
    }

    private Date dogumyeri;
   private Cinsiyet cinsiyet;

   public String toString(){
       return isim+dogumyeri+cinsiyet;
   }

    @Override
    public String getDogumyyeri() {
        return this.getDogumyeri();
    }
}
