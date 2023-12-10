/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDeNegocio;

/**
 *
 * @author Fernandoo Ayudantia SB
 */
public class PilaVector {
    //atributos
    int p[];
    int cima;
    //constructor
    public PilaVector(int cant){
        cima=-1;
        p=new int[cant];
    }
     /* 3|____| 
        2|____|
        1|____|
        0|____|
        -1       <- cima
     */
    public boolean vacia(){
        return cima==-1;
    }
     /* 3|__5__|<- cima 
        2|__4__|
        1|__3__|
        0|__2__|
           P       solo aqui estara llena
            p.length - 1
     */
    
    public boolean llena(){
        return cima==p.length-1;
    }
    
    
    //meter
    public void push(int elemento){
        if (llena()) {
            System.out.println("pila llena");
            System.exit(1);
        }else{
          cima++;
          p[cima]=elemento;
        }
    }
    //sacar
    public int pop(){
       cima--;
       return p[cima+1];
    }
     //sacar
    public int get(){   
       return p[cima];
    }
    
    public void eliminarcima(){
        if (cima>-1) {
            cima--;
        }
    }
    
    
    public void Eliminar(int elemento){
        PilaVector Aux=new PilaVector(cima+1);
        while (!vacia()) {            
            int y=pop();
            if (y!=elemento) {
                Aux.push(y);
            }
        }
         while (!Aux.vacia()) { 
             int y=Aux.pop();
             push(y);
         }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String toString(){
        String S="";
        for (int i = cima; i >= 0; i--) {
            S=S+"|_"+Integer.toString(p[i])+"_|";
            S=S+"\n";
        }
        return S;
    }
    
    
    public static void main(String[] args) {
        PilaVector pilaDePrueba=new PilaVector(10);
        pilaDePrueba.push(2);
        pilaDePrueba.push(8);
        pilaDePrueba.push(5);
        System.out.println(pilaDePrueba.toString());
    }
    
    
}
