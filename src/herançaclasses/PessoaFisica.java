package herançaclasses;

public class PessoaFisica extends Pessoa {
    private
            String rg;
            String apelido;
            double salario;
            
    @Override
    public String toString (){
        return  super.toString() + "\nRg: " + getRg() + "\nApelido: " + getApelido();
    }        

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }    
    
}
