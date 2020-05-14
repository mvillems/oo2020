/* Teha programm, milles on kasutusel klass ja selle klassi eksemplaaride hoidla.
Hoidlal peavad olema vajalikud käsklused ja sisaldama eksemplaare. */

public class Raamat {
    private String tiitel;
    private String autor;
    private String aasta;


    public Raamat(String tiitel, String autor, String aasta) {
        this.tiitel = tiitel;
        this.autor = autor;
        this.aasta = aasta;
    }


    public String getTiitel() {
        return tiitel;
    }

    public String getAutor() {
        return autor;
    }

    public String getAasta() {
        return aasta;
    }

    public String toString() {
        return "tiitel = " + tiitel + " autor= " + autor + " aasta= " + aasta;
    }
}