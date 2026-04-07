public class Main {
    public static void main(String[] args) throws Exception{
        Animal cavalo = new Animal("Pé de pano", 1);
        cavalo.andar();
        System.out.println(cavalo.toString());

        Ave papagaio = new Ave("Loro", 3);
        papagaio.setPeso(0.5f);
        papagaio.andar();
        System.out.println(papagaio.toString());

        Ave avestruz = new Ave ("avestruz", 2);
        avestruz.setPeso(140.0f);
        avestruz.setLocal("Quintal");
        avestruz.setMigracao(false);
        avestruz.andar();
        
        System.out.println(avestruz);

    }
}
