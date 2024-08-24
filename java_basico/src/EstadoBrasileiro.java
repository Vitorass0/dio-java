public enum EstadoBrasileiro{
    SAO_PAULO("SP", "São Paulo",11),
    Rio_JANEIRO("RJ", "Rio de Janeiro",12),
    PIAUI("PI", "Piauí",13),
    MARANHAO("MA", "Maranhão",14),
    CEARA("CE", "Ceará",15);

    private String sigla;
    private String nome;
    private int ibge;
    private EstadoBrasileiro(String sigla, String nome, int ibge){
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public String getSigla(){
        return this.sigla;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIbge(){
        return this.ibge;
    }

}