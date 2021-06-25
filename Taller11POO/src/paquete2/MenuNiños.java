/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Menu;

/**
 *
 * @author David Pardo
 */
public class MenuNiños extends Menu{
    protected double valorPorcionHelado;
    protected double valorPorcionPastel;

    
    public MenuNiños (String nom, double valorM){
        super(nom, valorM);
    }
    public void setValorPorcionHelado(double valoPHG){
        valorPorcionHelado=valoPHG;
    }
    public double getValorPorcionHelado(){
        return valorPorcionHelado;
    }
    public void setValorPorcionPastel(double valorPP){
        valorPorcionPastel=valorPP;
    }
    public double getValorPorcionPastel(){
        return valorPorcionPastel;
    }
    @Override
    public void setValorMenu(){
        valorMenu= getValorPorcionHelado() + getValorPorcionPastel() + 
                   getValorInicial();
    }
    @Override
    public String toString(){
        return String.format("Menú a la carta\n"
                + "Nombre del plato: %s\nValor inicial del menú: %s\n"
                + "Valor porcion de helado: %s\nValor porcion de pastel:%s\n"
                + "\tTotal a pagar:%s"
                , getNombrePlato(),getValorInicial(),getValorPorcionHelado()
                ,getValorPorcionPastel(),getValorMenu());
    }    
    
}
