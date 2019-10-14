public class Cliente extends Usuario {

    int puntosRanking;
    int puntosDeCanje;
    String nombre;
    int telefono;
    double costoQueDebe;

    //se tienen que registrar por propios medios por telefono --> en pantalla pide nombre, mail

    public Cliente(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        puntosDeCanje = 0;
        puntosRanking = 0;
    }

    public void usoDeActivo(String nombreDelActivo, int tiempo, Terminal laTerminalInicial, Terminal laTerminalFinal, int porcentaje){
        Activo unActivo = laTerminalInicial.retirar(nombreDelActivo);
        Zona unaZona = laTerminalInicial.getZonaDeLaTerminal();

        puntosRanking += unActivo.alquilar();
        puntosDeCanje += unActivo.alquilar();

        unActivo.usarActivo(unaZona, tiempo);

        costoQueDebe += unActivo.getCostoTotal()*(porcentaje/100); //cuando no hay descuento el porcentaje debe ser 100%

        laTerminalFinal.entregar(unActivo); // falta modelar : "puede elegir una hora de entrega y si la cumple se le otorgan 20% más de puntos"

        //usa tarifario del activo
        //suma los puntos
    }

    public void descontar(String nombreDelActivo, int tiempo, Terminal unaTerminalInicial, Terminal unaTerminalFinal, Descuento descuentoAplicado){
        usoDeActivo(nombreDelActivo, tiempo, unaTerminalInicial, unaTerminalFinal, descuentoAplicado.getPorcentajeDescuento());
    }

    public int getPuntosRanking(){
        return puntosRanking;
    }

    public String getNombre() {
        return nombre;
    }

    public void bloquearCuenta(){
        //inhabilita la cuenta
    }

    public void desbloquearCuenta(){

    }

    public void descuentoPorRanking(String nombreDelActivo, int tiempo, Terminal unaTerminalInicial, Terminal unaTerminalFinal) {
        usoDeActivo(nombreDelActivo, tiempo, unaTerminalInicial, unaTerminalFinal, 50);
    }

    //cuando usa activo suma puntosQueOtorga (puntos depende de zona)

    //no hay que lidiar con pago

}
