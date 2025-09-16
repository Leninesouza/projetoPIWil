package br.com.aulawilson.projetowilson.domain;

public enum UF {

    AC("AC", "ACRE"),
    AL("AL", "ALAGOAS"),
    AP("AP", "AMAPÁ"),
    AM("AM", "AMAZONAS"),
    BA("BA", "BAHIA"),
    CE("CE", "CEARÁ"),
    DF("DF", "DISTRITO FEDERAL"),
    ES("ES", "ESPÍRITO SANTO"),
    GO("GO", "GOIÁS"),
    MA("MA", "MARANHÃO"),
    MT("MT", "MATO GROSSO"),
    MS("MS", "MATO GROSSO DO SUL"),
    MG("MG", "MINAS GERAIS"),
    PA("PA", "PARÁ"),
    PB("PB", "PARAÍBA"),
    PR("PR", "PARANÁ"),
    PE("PE", "PERNAMBUCO"),
    PI("PI", "PIAUÍ"),
    RJ("RJ", "RIO DE JANEIRO"),
    RN("RN", "RIO GRANDE DO NORTE"),
    RS("RS", "RIO GRANDE DO SUL"),
    RO("RO", "RONDÔNIA"),
    RR("RR", "RORAIMA"),
    SC("SC", "SANTA CATARINA"),
    SP("SP", "SÃO PAULO"),
    SE("SE", "SERGIPE"),
    TO("TO", "TOCANTINS");

    private String sigla;
    private String descricao;

    UF(String sigla, String descricao) {
        this.sigla = sigla;
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
