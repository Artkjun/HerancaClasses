package herançaclasses;

public class PessoaJuridica extends Pessoa {
    private
            String cnpj;
            String nomeFantasia;
            String ramoAtividade;

    @Override
    public String toString (){
        return "Nome fantasia: " + getNomeFantasia() + "\nNome do responsavel: " + getNome() + "\nCNPJ: " + 
                getCnpj() + "\nEmail: " + getEmail() + "\nFone contato: " + getFone() + "\nRamo: " + getRamoAtividade();
    }        
            
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRamoAtividade() {
        return ramoAtividade;
    }

    public void setRamoAtividade(String ramoAtividade) {
        this.ramoAtividade = ramoAtividade;
    }
    
    
}
