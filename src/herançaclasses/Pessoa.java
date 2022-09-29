package herançaclasses;

public class Pessoa {
    private
            String nome;
            String email;
            String fone;
            
    @Override
    public String toString(){
        return "Nome" + getNome() + "\nEmail: " + getEmail() + "\nFone: " + getFone();
    }        

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
    
    
        
}
