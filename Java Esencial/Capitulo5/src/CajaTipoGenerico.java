public class CajaTipoGenerico<T>{
    T elemento;
    CajaTipoGenerico (T elemento){
        this.elemento=elemento;
    }
    T obtenerElemento(){
        return elemento;
    }
    <V> boolean perteneceElContenidoALaMismaClase(V otroObjeto){
        return elemento.getClass()==otroObjeto.getClass();
    }
}
