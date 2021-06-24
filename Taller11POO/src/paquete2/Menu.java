package paquete2;

/**
 *
 * @author David Pardo
 */
public abstract class Menu {
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicial;  
    
    public Menu(String nom, double valM, double valI){
        nombrePlato=nom;
        valorMenu= valM;
        valorInicial=valI;    
    }
    public void setNombrePlato(String nom){
        nombrePlato=nom;
    }
    public String getNombrePlato(){
        return nombrePlato;
    }
    public void setValorInicial(double valI){
        valorInicial=valI;
    }
    public double getValorInicial(){
        return valorInicial;
    }
    public abstract void setValorMenu();
    
    public double getValorMenu(){
        return valorMenu;
    }
}
