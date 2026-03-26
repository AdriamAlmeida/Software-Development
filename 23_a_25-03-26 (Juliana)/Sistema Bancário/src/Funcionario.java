public class Funcionario{
    private String nome, departamento, dataEntrada, RG;
    private double salario;
    boolean estaNaEmpresa;

    void bonifica(double aumento){
        this.salario += aumento;
    }

    void demite(){
        this.estaNaEmpresa = false;
    }

    //----- EXEMPLO EXTRA: -----
    /*void mostrarDados(){
    String status = this.estaNaEmpresa? "sim": "não";

    String ficha= """
            +--------------------+
             FICHA DO FUNCIONARIO
            +--------------------+
             |Nome: %s|
             |Departamento: %s|
             |Salario: R$ 2f|
             |Data de Entrada: %s|
             |RG: %s|
             |Ativo na Empresa: %s|
            +--------------------+
            """.formatted(this.nome, this.departamento, this.salario, this.dataEntrada, this.RG, this.estaNaEmpresa);

            System.out.println(ficha);
    }*/

    void mostrarDados(){
        System.out.println("\n-- Dados do Funcionario --");
        System.out.println("| Nome: "+ this.nome);
        System.out.println("| Departamento: "+ this.departamento);
        System.out.println("| Salário: "+ this.salario);
        System.out.println("| Data de Entrada: "+ this.dataEntrada);
        System.out.println("| RG: "+ this.RG);
        System.out.println("| Status na Empresa: "+ this.estaNaEmpresa);
    }
}


