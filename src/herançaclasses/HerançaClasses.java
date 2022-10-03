package herançaclasses;

import javax.swing.JOptionPane;


public class HerançaClasses {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        
        funcionario.setNome(JOptionPane.showInputDialog("Digite o nome do funcionario: "));
        funcionario.setRg(JOptionPane.showInputDialog("Digite o rg do funcionario: "));
        funcionario.setCartao(JOptionPane.showInputDialog("Insira o numero do cartão do funcionario: "));
        
        JOptionPane.showMessageDialog(null, funcionario.toString());
        
        Pessoa pessoa = null;
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Forneça um numero de 1 a 4"));
        switch (tipo){
            case 1 -> pessoa = new Pessoa();
            case 2 -> pessoa = new PessoaFisica();
            case 3 -> pessoa = new PessoaJuridica();
            case 4 -> pessoa = new Funcionario();
            default -> JOptionPane.showMessageDialog(null, "Tipo pessoa não existe!!");
                       
        }
        
        JOptionPane.showMessageDialog(null, "Concluido com sucesso!!");
    }
    
}
