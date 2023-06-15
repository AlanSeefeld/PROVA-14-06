public class Vans {
    String modelo;
    Integer ano;
    Integer anoFabricacao;
    Double kmRodados;
    String dataRevisao;
    Double valor;
    Integer qntdEixos;
    String catDirigir;
    Integer qntdMaximaVolume;
    String cor;
    Integer qntdLugares;

    public Vans(String modelo, Integer ano, Integer anoFabricacao, Double kmRodados, String dataRevisao, Double valor, Integer qntdMaximaVolume, String cor, Integer qntdLugares) {
        this.modelo = modelo;
        this.ano = ano;
        this.anoFabricacao = anoFabricacao;
        this.kmRodados = kmRodados;
        this.dataRevisao = dataRevisao;
        this.valor = valor;
        this.catDirigir = "B";
        this.qntdMaximaVolume = qntdMaximaVolume;
        this.cor = cor;
        this.qntdLugares = qntdLugares;
    }
    public void aumentarKmRodado(Double kms){
        this.kmRodados += kms;
    }
    public void depreciacao(){
        Double porcDep = 0.06;
        this.valor = valor - (valor * porcDep);
    }
}
