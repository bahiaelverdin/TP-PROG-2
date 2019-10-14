import java.util.ArrayList;

public class Administrador extends Usuario {
    ArrayList<Descuento> descuentos;
    public Administrador() {
    }
//usa abm

    public void amenaza(Activo unActivoRobado, Cliente clienteMultado){
        unActivoRobado.agregarMulta();
        clienteMultado.bloquearCuenta();
    }
    //desbloquear cuenta

    //crear lotes de compras de activos.

    public Lote crearLotes(Activo tipoDeActivo, int cantidadDeActivos){
        ArrayList<Activo> vehiculos = new ArrayList<>(cantidadDeActivos);
        for (int i = 0; i <vehiculos.size() ; i++) {
            vehiculos.add(tipoDeActivo);
        }
        Lote loteCreado = new Lote(vehiculos);
        return loteCreado;
    }

    public void crearDescuento(Activo tipoDeActivo, int puntajeRequerido, Zona unaZona, int porcentajeDescuento){
        descuentos.add(new Descuento(tipoDeActivo, puntajeRequerido, unaZona, porcentajeDescuento));
    }

    public Terminal crearTerminal(Zona zonaDeLaTerminal, ArrayList<Lote> vehiculos, String nombre){
        return new Terminal(zonaDeLaTerminal, vehiculos, nombre);
    }

    public ArrayList<Descuento> getDescuentos() {
        return descuentos;
    }

}
