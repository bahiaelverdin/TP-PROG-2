import java.util.ArrayList;

public class Terminal  {
    public String nombre;
    public ArrayList<Lote> vehiculos;
    public Zona zonaDeLaTerminal;

    //metodos: retirar y entregar -> da activo

    public Terminal(Zona zonaDeLaTerminal, ArrayList<Lote> vehiculos, String nombre) {
        this.zonaDeLaTerminal = zonaDeLaTerminal;
        this.vehiculos = vehiculos;
        this.nombre = nombre;
    }


    public Activo retirar(String nombreDelActivoQueQuieroRetirar){
        for (int i = 0; i < vehiculos.size() ; i++) {
            if(vehiculos.get(i).devuelveTipoDeActivo().equals(nombreDelActivoQueQuieroRetirar)){
               return vehiculos.get(i).retirarActivo();
            }
        }
        return null;
    }

    public Zona getZonaDeLaTerminal() {
        return zonaDeLaTerminal;
    }

    public void entregar(Activo activoADepositar){
        for (int i = 0; i < vehiculos.size() ; i++) {
            if(vehiculos.get(i).devuelveTipoDeActivo().equals(activoADepositar.nombreDelActivo)){
                vehiculos.get(i).depositarActivo(activoADepositar);
            }
        }
    }

    //b. Todo activo al ser alquilado por el cliente, debe ser retirado
    //de una terminal y cuando lo entregue debe ser también depositado
    //en otra terminal.
    //c. Opcionalmente, el cliente, puede elegir una hora de entrega y si
    //la cumple se le otorgan 20% más de puntos
}
