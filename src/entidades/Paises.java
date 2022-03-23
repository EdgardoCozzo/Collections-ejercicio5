
package entidades;





public class Paises implements Comparable<Paises>{

private String pais;

    public Paises() {
    }

    public Paises(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return " _" + pais ;
    }



    @Override
    public int compareTo(Paises t) {
        return this.pais.compareToIgnoreCase(t.getPais());
    }

 



    
   


}
