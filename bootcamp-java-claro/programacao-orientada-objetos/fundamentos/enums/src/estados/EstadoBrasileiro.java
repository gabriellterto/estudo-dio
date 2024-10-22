package estados;

public enum EstadoBrasileiro {
    SAO_PAULO("SP", "São Paulo", 11),
    RIO_JANEIRO("RJ", "Rio de Janeiro", 22),
    PIAUI("PI", "Piauí", 44),
    BRASILIA("DF", "Brasília", 61);

    private String nome;
    private int ibge;
    private String sigla;

    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public int getIbge() {
        return ibge;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

}
