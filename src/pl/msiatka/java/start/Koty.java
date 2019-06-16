package pl.msiatka.java.start;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Koty {

   private String name;
   private float weight;
   private Date dateOfBirth;
   private String opiekunName;

   public Koty(String name, Float weight, Date dateOfBirth, String opiekunName) {
        this.name = name;
        this.weight = weight;
        this.dateOfBirth = dateOfBirth;
        this.opiekunName = opiekunName;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private float getWeight() {
        return weight;
    }

    private void setWeight(float weight) {
        this.weight = weight;
    }

    private Date getDateOfBirth() {
        return dateOfBirth;
    }

    private void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    private String getOpiekunName() {
        return opiekunName;
    }

    private void setOpiekunName(String opiekunName) {
        this.opiekunName = opiekunName;
    }

    private static Date setCatBirthDay(){
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println("podaj date urodzena kota w formacie yyyy-mm-dd:");
        Date newdate=null;
        String strdate = "2010-08-19";
        try {
           newdate = dateformat.parse(strdate);
//            System.out.println(newdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

       return newdate;

    }

    @Override
    public String toString() {
        return "Koty{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", dateOfBirth=" + dateOfBirth +
                ", opiekunName='" + opiekunName + '\'' +
                '}';
    }

    private static void przedstawSie(Koty kot){
        System.out.println("Jestem kotek : " +  kot.getName() + " ważę " + kot.getWeight() + " mój opiekun to: "
                        + kot.getOpiekunName() + " urodziłem się: " + kot.getDateOfBirth());
    }

    private void przedstawSie(){
        System.out.println("Jestem Jan Kotek : " + this.getName() + " ważę " + this.getWeight() + " mój opiekun to: "
                + this.getOpiekunName() + " urodziłem się: " + this.getDateOfBirth());
    }

    public static void main(String[] args) {


        Koty kot = new Koty("Filemon",15.21f,setCatBirthDay(),"Janusz");
        System.out.println(kot);
        przedstawSie(kot);
        kot.przedstawSie();
    }
}
