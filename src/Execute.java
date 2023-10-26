public class Execute {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Guilherme");
        cliente.setEndereco("Rua Djalma Luiz Rocha, 222");
        cliente.setCpfCliente("12732611603");
        System.out.println(cliente.getNome());
        System.out.println(cliente.getEndereco());
        System.out.println(cliente.getCpfCliente());

    }
}
