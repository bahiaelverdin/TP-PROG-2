public class Activo {
    int puntosQueOtorga;
    Tarifario tarifarioPorMinuto;
    double valorDeMulta;
    String nombreDelActivo;
    long codigo;


    //tiene que saber en que zona esta


    public Activo(int puntosQueOtorga, double valorDeMulta, String nombreDelActivo) {
        Codigo unCodigo = new Codigo();
        long codigo = unCodigo.getCodigo();
        this.codigo = codigo;

        this.puntosQueOtorga = puntosQueOtorga;
        this.valorDeMulta = valorDeMulta;
        this.nombreDelActivo = nombreDelActivo;
    }

    public int alquilar(){
       return puntosQueOtorga; //donde se alquile hay que sumar los puntos que otorga a los puntos del cliente
    }

    public void agregarMulta(){
        tarifarioPorMinuto.multa(valorDeMulta);
    }

    public void usarActivo(Zona laZonaDondeEsUsado, int minutosDeUso){
        tarifarioPorMinuto = new Tarifario(laZonaDondeEsUsado, minutosDeUso);
    }

    public double getCostoTotal(){
        return tarifarioPorMinuto.tarifaTotal;
    }
}
