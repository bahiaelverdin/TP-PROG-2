import java.util.ArrayList;

public class Lote {
    long codigo;
    ArrayList<Activo> vehiculos;

    public Lote(ArrayList<Activo> vehiculos) {
        Codigo unCodigo = new Codigo();
        long codigo = unCodigo.getCodigo();
        this.codigo = codigo;

        this.vehiculos = vehiculos;
    }

    public ArrayList<Activo> getVehiculos() {
        return vehiculos;
    }

    public Activo retirarActivo(){
        Activo activoARetirar = vehiculos.get(vehiculos.size()-1);
        vehiculos.remove(vehiculos.size()-1);
        return activoARetirar;
    }

    public String devuelveTipoDeActivo(){
        return vehiculos.get(0).nombreDelActivo;
    }

    public void depositarActivo(Activo activoADepositar){
        vehiculos.add(activoADepositar);
    }

    //inicializar todos en el mismo lote original
    //hacer que siempre queden en la misma zona
}
