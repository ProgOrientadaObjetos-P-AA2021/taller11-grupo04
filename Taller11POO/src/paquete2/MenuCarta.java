package paquete3;

import paquete2.Menu;

/**
 *
 * @author David Pardo
 */
public class MenuCarta extends Menu{
    protected double valorGuarnicion;
    protected double valorBebida;
    protected double porcetajeServicio;
    
    public MenuCarta (String nom, double valorM){
        super(nom, valorM);
    }
    public void setValorPorcionGuarnicion(double valorG){
        valorGuarnicion=valorG;
    }
    public double getValorPorcionGuarnicion(){
        return valorGuarnicion;
    }
    public void setValorBebida(double valorBe){
        valorBebida=valorBe;
    }
    public double getValorBebida(){
        return valorBebida;
    }
    public void setValorPorcentaeAdicional(double valAdd){
        porcetajeServicio= valAdd;
    }
    public double getValorPorcentaeAdicional(){
        return porcetajeServicio;
    }
    @Override
    public void setValorMenu(){
        valorMenu= getValorPorcionGuarnicion() + getValorBebida() + 
                getValorPorcentaeAdicional() + getValorInicial();
    }
    @Override
    public String toString(){
        return String.format("Menú a la carta\n"
                + "Nombre del plato: %s\nValor inicial del menú: %s\n"
                + "Valor porcion de guarnicion: %s\nValor de la bebida:%s\n"
                + "Valor adicional del servicio:%s\n\tTotal a pagar:%s"
                , getNombrePlato(),getValorInicial(),getValorPorcionGuarnicion()
                ,getValorBebida(),getValorPorcentaeAdicional(),getValorMenu());
    }
    
}
