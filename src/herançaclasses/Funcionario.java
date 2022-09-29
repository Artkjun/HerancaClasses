package herançaclasses;

public class Funcionario extends PessoaFisica {
    private
            String cartao;
            String horaEntrada;
            String horaSaida;
            

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }
    
    @Override
    public String toString(){
        return "Nome: " + getNome() + "\nRg: " + getRg() + "\nCartão: " + getCartao() + "\nApelido: " + getApelido()
                + "\nEmail: " + getEmail() + "\nFone: " + getFone() + "\nHora entrada:  " + getHoraEntrada()
                + "\nHora saida: " + getHoraSaida() + "\nSalário: " + getSalario();
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }
    
    
}
