import java.util.ArrayList;
import java.util.Collections;

public class Compra implements Comparable<Compra>{

    private int id;
    private String raca;
    private int peso;
    private float precoVenda;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }


    @Override
    public int compareTo(Compra o) {
        if (peso > o.peso) {
            return 1;
        } else if (peso < o.peso) {
            return -1;
        }
        return 0;
    }

    public int compare(Compra[] o) {
        for(int i=0; i< o.length;i++) {
            if (Integer.parseInt(raca) > Integer.parseInt(o[i].raca)) {
                return 1;
            } else if (Integer.parseInt(raca) < Integer.parseInt(o[i].raca)) {
                return -1;
            }
        }
        return 0;
    }



}
