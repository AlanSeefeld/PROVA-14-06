public class Caminhao {
    String modelo;
    Integer ano;
    Integer anoFabricacao;
    Double kmRodados;
    String dataRevisao;
    Double valor;
    Integer qntdEixos;
    String catDirigir;


    public Caminhao(String modelo, Integer ano, Integer anoFabricacao, Double kmRodados, String dataRevisao, Double valor, Integer qntdEixos) {
        this.modelo = modelo;
        this.ano = ano;
        this.anoFabricacao = anoFabricacao;
        this.kmRodados = kmRodados;
        this.dataRevisao = dataRevisao;
        this.valor = valor;
        this.qntdEixos = qntdEixos;
        this.catDirigir = "E";
    }
    public void aumentarKmRodado(Double kms){
        this.kmRodados += kms;
    }

    public void depreciacao(){
        Double porcDep = 0.05;
        this.valor = valor - (valor * porcDep);
    }
}