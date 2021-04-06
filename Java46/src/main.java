import java.util.Calendar;

public class main {
    public static void main(String[] args) {
        Calendar dateOfBird=Calendar.getInstance();
        dateOfBird.set(2021,0,2);
        IdKimlik kimlik1=new IdKimlik("ali",dateOfBird.getTime(),Cinsiyet.ERKEK,"Ankara");
       Pasaport kimlik1passno=new Pasaport("ali",dateOfBird.getTime(),Cinsiyet.ERKEK,54546546);
       System.out.println(kimlik1.toString());


    }

}
