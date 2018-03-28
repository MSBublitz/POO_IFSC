/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

import javax.swing.JOptionPane;

/**
 *
 * @author IFSC
 */
class FuncaoPilha {
    private final int[] pilha;
    private int topo;
    private final int tam;
    public FuncaoPilha(int tam){
        this.pilha = new int[tam];
        this.topo = -1;
        this.tam = tam;
    }
    
    public int top(){ // acessa-se o elemento posicionado no topo da pilha;
        int top =0;
        if(topo >= 0){
            top = pilha[topo];
        }
        return top;
    }
    public void push(int e){ // inserir um novo elemento no topo da lista;
        if(topo == tam-1 ){
            JOptionPane.showMessageDialog(null, "Imposível Inserir um Novo Elemento!",
                    "A pilha está Cheia!",JOptionPane.ERROR_MESSAGE, null);
        }else{
            topo++;
            pilha[topo] = e;
        }
    }
    public int pop(){ //remove o elemento do topo da lista.
        int pop =0;
        if(topo >= 0){
            pop = pilha[topo];
            topo--;
        }
        return pop;
    }
    public void pull(int e){ //altera o elemento posicionado no topo da pilha;
        if(topo >= 0){
            pilha[topo] = e;
        }else{
            this.push(e);
        }
    }
    public int get_number_elem(){ // retorne a quantidade de elementos na pilha;
        int qtdElem = 0;
        if(topo == -1){
            qtdElem = 0;
        }
        if(topo >= 0){
            qtdElem = topo + 1;
        }
        return qtdElem;
    }
}
