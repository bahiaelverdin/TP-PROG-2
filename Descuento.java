public class Descuento {
    public Activo tipoDeActivo;
    public int puntajeRequerido;
    public Zona unaZona;
    public int porcentajeDescuento;

    public Descuento(Activo tipoDeActivo, int puntajeRequerido, Zona unaZona, int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
        this.puntajeRequerido = puntajeRequerido;
        this.tipoDeActivo = tipoDeActivo;
        this.unaZona = unaZona;
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }
}
