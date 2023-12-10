/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDeNegocio;

/**
 *
 * @author fernandoo Ayudantia SB
 */
/* Nivel de bits
    -|__10100__| 
    -|__11001__|
    -|__10101__|
    -|__10110__|
    -|__10101__|
    -|__10110__|
       <- tope    */
public class PilaBits {
   //atributos
     Vectorbit p;
    int cima;
    //constructor
    public PilaBits(int cant,int bits){
        cima=0;
        p=new Vectorbit(cant, bits);
    }
   
    public boolean vacia(){
        return cima==0;
    }
     /* 3|__5__|<- cima 
        2|__4__|
        1|__3__|
        0|__2__|
           P       solo aqui estara llena
            p.length - 1
     */
    
    public boolean llena(){
        return cima==p.dim;
    }
    
    
    //meter
    public void push(int elemento){
        if (llena()) {
            System.out.println("pila llena");
            System.exit(1);
        }else{
          cima++;
          p.insertar(elemento, cima);
        }
    }
    //sacar
    public int pop(){
       cima--;
       return p.sacar(cima+1);
    }
     //consultar
    public int get(){   
        return p.sacar(cima);
    }
    
    public void eliminarcima(){
        if (cima>-1) {
            cima--;
        }
    }
    
    public String toString(){
        String S="";
        for (int i = cima; i >= 1; i--) {
            S=S+"|_"+Integer.toString(p.sacar(i))+"_|";
            S=S+"\n";
        }
        return S;
    }
    
    
    public static void main(String[] args) {
        PilaBits pilaDePrueba=new PilaBits(10,5);
        pilaDePrueba.push(32);
        pilaDePrueba.push(8);
        pilaDePrueba.push(5);
        System.out.println(pilaDePrueba.toString());
    }
    
      
}
