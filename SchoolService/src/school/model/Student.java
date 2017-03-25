package school.model;

public class Student {

    private String voornaam;
    private String achternaam;
    private int leeftijd;
    private String woonplaats;
    private boolean propedeuse;

    public Student(String vn, String an, int lt, String wp, Boolean p){
        voornaam = vn;
        achternaam = an;
        leeftijd = lt;
        woonplaats = wp;
        propedeuse = p;
    }
    public String getVoornaam() {
        return voornaam;
    }
    public String getAchternaam() {
        return achternaam;
    }
    public int getLeeftijd() {
        return leeftijd;
    }
    public String getWoonplaats() {
        return woonplaats;
    }
    public boolean isPropedeuse() {
        return propedeuse;
    }
    public void setPropedeuse(boolean propedeuse) {
        this.propedeuse = propedeuse;
    }
    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }
    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

}