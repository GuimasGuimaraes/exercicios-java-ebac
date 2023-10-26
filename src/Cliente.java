public class Cliente {
    private String cpfCliente;
    private  String nome;
    private String endereco;

    public String getCpfCliente() {
        return cpfCliente;
    }


    public void setCpfCliente(String cpfCliente) {
        /* trecho para adicionar cpf do cliente
         */
        this.cpfCliente = cpfCliente;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        // trecho para adicionar nome do cliente
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        // Trecho para adicionar endereço do cliente
        this.endereco = endereco;
    }


}

