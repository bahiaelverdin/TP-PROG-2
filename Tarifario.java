public class Tarifario {

    public int minutos;
    public Zona unaZona;
    public double tarifaTotal;

    public Tarifario(Zona unaZona, int minutos) {
        this.unaZona = unaZona;
        this.minutos = minutos;
    }

    public void tarifa(){
        tarifaTotal = unaZona.getPrecioPorMinuto()*minutos;
    }

    public void multa(double valorDeMulta){
        tarifaTotal+=valorDeMulta;
    }

    public double valorTarifaTotal(){
        return tarifaTotal;
    }


    //Descuentos: tipo de activo, puntaje mínimo requerido, zona y porcentaje de descuento.

    //multa
}
