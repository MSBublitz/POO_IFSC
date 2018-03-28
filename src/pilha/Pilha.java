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
public class Pilha {
    
    static final int TAMPILHA = Integer.parseInt(JOptionPane.showInputDialog("Insira tamanho da Pilha: "));
    static FuncaoPilha pilha = new FuncaoPilha(TAMPILHA);
    
    public static void main(String[] args) {
        
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opcao:"
                + "\n1 - Buscar Elemento."
                + "\n2 - Alterar Elemento"
                + "\n3 - Inserir Elemento."
                + "\n4 - Remover Elemento."
                + "\n5 - Quantidade de Elementos."));

        switch(opcao){
            case 1:
                int top = pilha.top();
                if(top == 0){
                    JOptionPane.showMessageDialog(null, "A Pilha está Vazia!");
                }else{
                    JOptionPane.showMessageDialog(null, "Elemento no Topo: " + top);
                }
                main(null);
                break;
            case 2:
                pilha.pull(Integer.parseInt(JOptionPane.showInputDialog("Obs.: Se a pilha estiver "
                        + "vazia esse elemento será inserido.\n\nInsira o novo Elemento:")));
                main(null);
                break;
            case 3:
                pilha.push(Integer.parseInt(JOptionPane.showInputDialog("Elemento a ser Inserido: ")));
                main(null);
                break;
            case 4:
                int pop = pilha.pop();
                if(pop == 0){
                    JOptionPane.showMessageDialog(null, "Imposível Remover um Elemento!",
                    "A pilha está Vazia !!!",JOptionPane.ERROR_MESSAGE, null);
                }else{
                    JOptionPane.showMessageDialog(null, "Elemento removido: " + pop);
                }
                main(null);
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Qts de Elementos: "+ pilha.get_number_elem());
                main(null);
            default :
                 JOptionPane.showMessageDialog(null, "Opção Inválida !!!",
                    "Erro",JOptionPane.ERROR_MESSAGE, null);
                 main(null);
        }
        
        
        
    }
    
}
