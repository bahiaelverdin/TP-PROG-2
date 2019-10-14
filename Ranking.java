import java.util.ArrayList;

public class Ranking {
    public Zona laZona;
    public Cliente [] ranking;

    public Ranking(Zona zonaDelRanking) {
        laZona=zonaDelRanking;
        ranking = new Cliente[10];
    }

    public void llenarRanking(Cliente nuevoCliente){
        for (int i = 0; i < ranking.length; i++) {
            if (ranking [i] == null) {
                ranking[i] = nuevoCliente;
                break;
            }else if(ranking[i].getPuntosRanking()<nuevoCliente.getPuntosRanking()){
                for (int j = i; j < ranking.length-1; j++) {
                    ranking[j+1] = ranking[j];
                }
                ranking[i] = nuevoCliente;
            }
        }

    }

    public void imprimirRanking(){
        for (int i = 0; i < ranking.length; i++) {
            int posicion = i+1;
            System.out.println("/n" + posicion + ") " + ranking[i].getNombre() + " con " + ranking[i].getPuntosRanking() + "puntos");
        }
    }

    public boolean primerosTresEnRanking(Cliente unCliente){
        for (int i = 0; i < 3; i++) {
            if(ranking[i].getNombre().equals(unCliente.getNombre())){
                return true;
            }
        }
        return false;
    }
}

