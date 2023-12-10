/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDeNegocio;

/**
 *
 * @author fernando Angulo
 */
/*
L->[0|]->[1|]->[3|]->[5|]->[7|]-> null  cantidad
  L->
[0|]->
[1|]->
[3|]->
[5|]->
[7|]-> null  

*/
public class PilaLista {
       //atributos
    
     Nodo cima;
     int cantidad;
    //constructor
    public PilaLista(){
        cima=null;
        cantidad=0;
    }
     /* 3|____| 
        2|____|
        1|____|
        0|____|
        -1       <- cima
     */
    public boolean vacia(){
        return cima==null;
    }
     /* 3|__5__|<- cima 
        2|__4__|
        1|__3__|
        0|__2__|
           P       solo aqui estara llena
            p.length - 1
     */
    
    //meter              23
    public void push(int elemento){
       Nodo p=new Nodo();
       p.setDato(elemento);
       p.setEnlace(cima);
       cima=p;
       cantidad++;
    }
    
    
    public void push2(int elemento){
       Nodo nuevo=new Nodo(elemento,cima);
       //p.setDato(elemento);
      // p.setEnlace(cima);
       cima=nuevo;
       cantidad++;
    }
    //sacar
    public int pop(){
      int x=cima.getDato();
  //    Nodo a=cima;
  //    a=null;
      cima=cima.getEnlace();
      cantidad--;
      return x;
    }
     //sacar
    public int get(){   
     return cima.getDato();
    }
    
    public void eliminarcima(){

    }
    
     @Override
    public String toString(){
        String S="";
        Nodo Aux=cima;
        while (Aux!=null) {            
             S=S+"|_"+Integer.toString(Aux.getDato())+"_|";
              S=S+"\n";
          Aux=Aux.getEnlace();
        }
         
           
     //   }
        return S+"->null";
    }
    
    
    public static void main(String[] args) {
        PilaLista pilaDePrueba=new PilaLista();
        pilaDePrueba.push(2);
        pilaDePrueba.push(8);
        pilaDePrueba.push(5);
        System.out.println(pilaDePrueba.toString());
    }
    
    
}
