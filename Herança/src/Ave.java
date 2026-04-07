public class Ave extends Animal {
    private String local;
    private boolean migracao;

    public Ave(){}
    public Ave(String nome, int recinto) {
        super(nome, recinto); // construtor da classe Animal
    }

    public String getLocal() {return local;}
    public void setLocal(String local) {this.local = local;}

    public boolean isMigracao() {return migracao;}
    public void setMigracao(boolean migracao) {this.migracao = migracao;}

    /*
    public String toString() {
        return "Ave [local=" + local + ", migracao=" + migracao + ", toString()=" + super.toString() + "]";
    }
    */

    @Override //Sobrescrevi o método da classe mãe
    public void andar(){
        // int novoValor = getRecinto()+2;
        // setRecinto(novoValor);
        System.out.println("Andar da ave");
        setRecinto(getRecinto()+2);
    }

    public String toString() {
        return "Ave - local = " + local
             + ", migração = " + migracao
             + ", Nome = " + getNome()
             + ", Recinto = " + getRecinto()
             + ", Peso = " + getPeso();
    }

}
