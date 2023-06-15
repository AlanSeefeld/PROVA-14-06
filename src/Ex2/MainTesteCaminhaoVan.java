public class MainTesteCaminhaoVan {
    public static void main(String[] args) {
        Caminhao caminhao1 = new Caminhao("Scania",2023,2022,40.00,"10/05/2023",400.000,3);
        caminhao1.aumentarKmRodado(20.00);
        System.out.println(caminhao1.kmRodados);

        caminhao1.depreciacao();
        System.out.println(caminhao1.valor);

        Vans vans = new Vans("Volw",2023,2022,20.00,"10/03/2023",200.000,20,"Azul",6);
        vans.aumentarKmRodado(20.00);
        System.out.println(vans.kmRodados);

        vans.depreciacao();
        System.out.println(vans.valor);

    }

}
