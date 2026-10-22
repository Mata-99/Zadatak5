public class Polaznik {

    private String ime;
    private String prezime;
    private String email;

    public Polaznik(String ime, String prezime, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    @Override
    public String toString(){
        return "Ime:" + ime + "Prezime: " + prezime + " email: " + email;
    }

    @Override
    public boolean equals(Object p){
      if(this == p ){
          return true;
      }
        if (p == null || getClass() != p.getClass()) {
            return false;
        }
        Polaznik polaznik = (Polaznik) p;
        return  email.equalsIgnoreCase(polaznik.email);

    }
    @Override
    public int hashCode(){
        return email.toLowerCase().hashCode();
    }
}