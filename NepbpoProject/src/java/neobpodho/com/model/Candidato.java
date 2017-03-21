/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neobpodho.com.model;

import java.io.Serializable;

public class Candidato implements Serializable {

    private static final long serialVersionUID = 1L;

    
    Integer idCandidados;
    String fonteRecrutamento;
    String consultindiqueAmigooutros;
    String nomecompleto;
    String email;
    String cep;
    String rua;
    String bairro;
    int numero;
    String complemento;
    String cidade;
    String uf;
    String pais;
    String sexo;
    String idade;
    String estadoCivil;
    String nomeMae;
    String nomePai;
    String dataNasci;
    String raca;
    String celular;
    String telefone;
    String filhos;
    String nomeFilhos;
    String qntConducoes;
    float valorConducao;
    String transportes;
    String outrosTransportes;
    String horarioDisposnivel;
    String especificarHorario;
    String dispSabDom;
    String trabalhouTivit;
    String periodoTrabTivit;
    String partProcTivitNeobpo;
    String produtoProcSeletivo;
    String trabalhouTelemrk;
    String tempoTrabTelemrk;
    String tipoTelemrk;
    String parentesNeobpo;
    String nomeParente;
    String portadorDeficiencia;
    String tipoDeficiencia;
    String cpf;
    String rg;
    String dataEmissaoRg;
    String orgaoEmissorRg;
    String titlutoEleitor;
    String zonaTitulo;
    String secaoTitulo;
    String carteiraClt;
    String serieClt;
    String dataEmissaoClt;
    String estadoEmissorClt;
    String reservista;
    String categoriaReservista;
    String pisPasep;
    String pisPasepNum;
    String ensinoMedio;
    String dataConclusaoEnsino;
    String nomeCursoTec;
    String graduacaoInst;
    String dataGraduacao;
    String nomeCursoGraduacao;
    String posGraduacaoInst;
    String dataPosGraduacao;
    String nomeCursoPosGraduacao;
    String dataCadastroCand;
    String horaCadastroCand;
    String conhecimentoInfo;
    String conhecimentoIdioma;
    String qualIdioma;
    String outrosCursos;
    String atualEmpresa;
    String ultimoCargo;
    String enderecoEmpresa;
    String telefoneEmpresa;
    String periodoEmpresa;
    String ultimoSalario;
    String motivoSaida;
    String penultimaEmpresa;
    String penultimoCargo;
    String penultimoEnderecoEmpresa;
    String penultimoTelEmpresa;
    String penultimoPeriodo;
    String penultimoSalario;
    String penultimoMotivoSaida;
    String CargoPretendido;
    String pretensaoSalarial;
    String submeteExperiencia;
    String pagouContibuicao;

    public Integer getIdCandidados() {
        return idCandidados;
    }

    public void setIdCandidados(Integer idCandidados) {
        this.idCandidados = idCandidados;
    }

    public String getFonteRecrutamento() {
        return fonteRecrutamento;
    }

    public void setFonteRecrutamento(String fonteRecrutamento) {
        this.fonteRecrutamento = fonteRecrutamento;
    }

    public String getConsultindiqueAmigooutros() {
        return consultindiqueAmigooutros;
    }

    public void setConsultindiqueAmigooutros(String consultindiqueAmigooutros) {
        this.consultindiqueAmigooutros = consultindiqueAmigooutros;
    }

    public String getNomecompleto() {
        return nomecompleto;
    }

    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataNasci() {
        return dataNasci;
    }

    public void setDataNasci(String dataNasci) {
        this.dataNasci = dataNasci;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFilhos() {
        return filhos;
    }

    public void setFilhos(String filhos) {
        this.filhos = filhos;
    }

    public String getNomeFilhos() {
        return nomeFilhos;
    }

    public void setNomeFilhos(String nomeFilhos) {
        this.nomeFilhos = nomeFilhos;
    }

    public String getQntConducoes() {
        return qntConducoes;
    }

    public void setQntConducoes(String qntConducoes) {
        this.qntConducoes = qntConducoes;
    }

    public float getValorConducao() {
        return valorConducao;
    }

    public void setValorConducao(float valorConducao) {
        this.valorConducao = valorConducao;
    }

    public String getTransportes() {
        return transportes;
    }

    public void setTransportes(String transportes) {
        this.transportes = transportes;
    }

    public String getOutrosTransportes() {
        return outrosTransportes;
    }

    public void setOutrosTransportes(String outrosTransportes) {
        this.outrosTransportes = outrosTransportes;
    }

    public String getHorarioDisposnivel() {
        return horarioDisposnivel;
    }

    public void setHorarioDisposnivel(String horarioDisposnivel) {
        this.horarioDisposnivel = horarioDisposnivel;
    }

    public String getEspecificarHorario() {
        return especificarHorario;
    }

    public void setEspecificarHorario(String especificarHorario) {
        this.especificarHorario = especificarHorario;
    }

    public String getDispSabDom() {
        return dispSabDom;
    }

    public void setDispSabDom(String dispSabDom) {
        this.dispSabDom = dispSabDom;
    }

    public String getTrabalhouTivit() {
        return trabalhouTivit;
    }

    public void setTrabalhouTivit(String trabalhouTivit) {
        this.trabalhouTivit = trabalhouTivit;
    }

    public String getPeriodoTrabTivit() {
        return periodoTrabTivit;
    }

    public void setPeriodoTrabTivit(String periodoTrabTivit) {
        this.periodoTrabTivit = periodoTrabTivit;
    }

    public String getPartProcTivitNeobpo() {
        return partProcTivitNeobpo;
    }

    public void setPartProcTivitNeobpo(String partProcTivitNeobpo) {
        this.partProcTivitNeobpo = partProcTivitNeobpo;
    }

    public String getProdutoProcSeletivo() {
        return produtoProcSeletivo;
    }

    public void setProdutoProcSeletivo(String produtoProcSeletivo) {
        this.produtoProcSeletivo = produtoProcSeletivo;
    }

    public String getTrabalhouTelemrk() {
        return trabalhouTelemrk;
    }

    public void setTrabalhouTelemrk(String trabalhouTelemrk) {
        this.trabalhouTelemrk = trabalhouTelemrk;
    }

    public String getTempoTrabTelemrk() {
        return tempoTrabTelemrk;
    }

    public void setTempoTrabTelemrk(String tempoTrabTelemrk) {
        this.tempoTrabTelemrk = tempoTrabTelemrk;
    }

    public String getTipoTelemrk() {
        return tipoTelemrk;
    }

    public void setTipoTelemrk(String tipoTelemrk) {
        this.tipoTelemrk = tipoTelemrk;
    }

    public String getParentesNeobpo() {
        return parentesNeobpo;
    }

    public void setParentesNeobpo(String parentesNeobpo) {
        this.parentesNeobpo = parentesNeobpo;
    }

    public String getNomeParente() {
        return nomeParente;
    }

    public void setNomeParente(String nomeParente) {
        this.nomeParente = nomeParente;
    }

    public String getPortadorDeficiencia() {
        return portadorDeficiencia;
    }

    public void setPortadorDeficiencia(String portadorDeficiencia) {
        this.portadorDeficiencia = portadorDeficiencia;
    }

    public String getTipoDeficiencia() {
        return tipoDeficiencia;
    }

    public void setTipoDeficiencia(String tipoDeficiencia) {
        this.tipoDeficiencia = tipoDeficiencia;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataEmissaoRg() {
        return dataEmissaoRg;
    }

    public void setDataEmissaoRg(String dataEmissaoRg) {
        this.dataEmissaoRg = dataEmissaoRg;
    }

    public String getOrgaoEmissorRg() {
        return orgaoEmissorRg;
    }

    public void setOrgaoEmissorRg(String orgaoEmissorRg) {
        this.orgaoEmissorRg = orgaoEmissorRg;
    }

    public String getTitlutoEleitor() {
        return titlutoEleitor;
    }

    public void setTitlutoEleitor(String titlutoEleitor) {
        this.titlutoEleitor = titlutoEleitor;
    }

    public String getZonaTitulo() {
        return zonaTitulo;
    }

    public void setZonaTitulo(String zonaTitulo) {
        this.zonaTitulo = zonaTitulo;
    }

    public String getSecaoTitulo() {
        return secaoTitulo;
    }

    public void setSecaoTitulo(String secaoTitulo) {
        this.secaoTitulo = secaoTitulo;
    }

    public String getCarteiraClt() {
        return carteiraClt;
    }

    public void setCarteiraClt(String carteiraClt) {
        this.carteiraClt = carteiraClt;
    }

    public String getSerieClt() {
        return serieClt;
    }

    public void setSerieClt(String serieClt) {
        this.serieClt = serieClt;
    }

    public String getDataEmissaoClt() {
        return dataEmissaoClt;
    }

    public void setDataEmissaoClt(String dataEmissaoClt) {
        this.dataEmissaoClt = dataEmissaoClt;
    }

    public String getEstadoEmissorClt() {
        return estadoEmissorClt;
    }

    public void setEstadoEmissorClt(String estadoEmissorClt) {
        this.estadoEmissorClt = estadoEmissorClt;
    }

    public String getReservista() {
        return reservista;
    }

    public void setReservista(String reservista) {
        this.reservista = reservista;
    }

    public String getCategoriaReservista() {
        return categoriaReservista;
    }

    public void setCategoriaReservista(String categoriaReservista) {
        this.categoriaReservista = categoriaReservista;
    }

    public String getPisPasep() {
        return pisPasep;
    }

    public void setPisPasep(String pisPasep) {
        this.pisPasep = pisPasep;
    }

    public String getPisPasepNum() {
        return pisPasepNum;
    }

    public void setPisPasepNum(String pisPasepNum) {
        this.pisPasepNum = pisPasepNum;
    }

    public String getEnsinoMedio() {
        return ensinoMedio;
    }

    public void setEnsinoMedio(String ensinoMedio) {
        this.ensinoMedio = ensinoMedio;
    }

    public String getDataConclusaoEnsino() {
        return dataConclusaoEnsino;
    }

    public void setDataConclusaoEnsino(String dataConclusaoEnsino) {
        this.dataConclusaoEnsino = dataConclusaoEnsino;
    }

    public String getNomeCursoTec() {
        return nomeCursoTec;
    }

    public void setNomeCursoTec(String nomeCursoTec) {
        this.nomeCursoTec = nomeCursoTec;
    }

    public String getGraduacaoInst() {
        return graduacaoInst;
    }

    public void setGraduacaoInst(String graduacaoInst) {
        this.graduacaoInst = graduacaoInst;
    }

    public String getDataGraduacao() {
        return dataGraduacao;
    }

    public void setDataGraduacao(String dataGraduacao) {
        this.dataGraduacao = dataGraduacao;
    }

    public String getNomeCursoGraduacao() {
        return nomeCursoGraduacao;
    }

    public void setNomeCursoGraduacao(String nomeCursoGraduacao) {
        this.nomeCursoGraduacao = nomeCursoGraduacao;
    }

    public String getPosGraduacaoInst() {
        return posGraduacaoInst;
    }

    public void setPosGraduacaoInst(String posGraduacaoInst) {
        this.posGraduacaoInst = posGraduacaoInst;
    }

    public String getDataPosGraduacao() {
        return dataPosGraduacao;
    }

    public void setDataPosGraduacao(String dataPosGraduacao) {
        this.dataPosGraduacao = dataPosGraduacao;
    }

    public String getNomeCursoPosGraduacao() {
        return nomeCursoPosGraduacao;
    }

    public void setNomeCursoPosGraduacao(String nomeCursoPosGraduacao) {
        this.nomeCursoPosGraduacao = nomeCursoPosGraduacao;
    }

    public String getDataCadastroCand() {
        return dataCadastroCand;
    }

    public void setDataCadastroCand(String dataCadastroCand) {
        this.dataCadastroCand = dataCadastroCand;
    }

    public String getHoraCadastroCand() {
        return horaCadastroCand;
    }

    public void setHoraCadastroCand(String horaCadastroCand) {
        this.horaCadastroCand = horaCadastroCand;
    }

    public String getConhecimentoInfo() {
        return conhecimentoInfo;
    }

    public void setConhecimentoInfo(String conhecimentoInfo) {
        this.conhecimentoInfo = conhecimentoInfo;
    }

    public String getConhecimentoIdioma() {
        return conhecimentoIdioma;
    }

    public void setConhecimentoIdioma(String conhecimentoIdioma) {
        this.conhecimentoIdioma = conhecimentoIdioma;
    }

    public String getQualIdioma() {
        return qualIdioma;
    }

    public void setQualIdioma(String qualIdioma) {
        this.qualIdioma = qualIdioma;
    }

    public String getOutrosCursos() {
        return outrosCursos;
    }

    public void setOutrosCursos(String outrosCursos) {
        this.outrosCursos = outrosCursos;
    }

    public String getAtualEmpresa() {
        return atualEmpresa;
    }

    public void setAtualEmpresa(String atualEmpresa) {
        this.atualEmpresa = atualEmpresa;
    }

    public String getUltimoCargo() {
        return ultimoCargo;
    }

    public void setUltimoCargo(String ultimoCargo) {
        this.ultimoCargo = ultimoCargo;
    }

    public String getEnderecoEmpresa() {
        return enderecoEmpresa;
    }

    public void setEnderecoEmpresa(String enderecoEmpresa) {
        this.enderecoEmpresa = enderecoEmpresa;
    }

    public String getTelefoneEmpresa() {
        return telefoneEmpresa;
    }

    public void setTelefoneEmpresa(String telefoneEmpresa) {
        this.telefoneEmpresa = telefoneEmpresa;
    }

    public String getPeriodoEmpresa() {
        return periodoEmpresa;
    }

    public void setPeriodoEmpresa(String periodoEmpresa) {
        this.periodoEmpresa = periodoEmpresa;
    }

    public String getUltimoSalario() {
        return ultimoSalario;
    }

    public void setUltimoSalario(String ultimoSalario) {
        this.ultimoSalario = ultimoSalario;
    }

    public String getMotivoSaida() {
        return motivoSaida;
    }

    public void setMotivoSaida(String motivoSaida) {
        this.motivoSaida = motivoSaida;
    }

    public String getPenultimaEmpresa() {
        return penultimaEmpresa;
    }

    public void setPenultimaEmpresa(String penultimaEmpresa) {
        this.penultimaEmpresa = penultimaEmpresa;
    }

    public String getPenultimoCargo() {
        return penultimoCargo;
    }

    public void setPenultimoCargo(String penultimoCargo) {
        this.penultimoCargo = penultimoCargo;
    }

    public String getPenultimoEnderecoEmpresa() {
        return penultimoEnderecoEmpresa;
    }

    public void setPenultimoEnderecoEmpresa(String penultimoEnderecoEmpresa) {
        this.penultimoEnderecoEmpresa = penultimoEnderecoEmpresa;
    }

    public String getPenultimoTelEmpresa() {
        return penultimoTelEmpresa;
    }

    public void setPenultimoTelEmpresa(String penultimoTelEmpresa) {
        this.penultimoTelEmpresa = penultimoTelEmpresa;
    }

    public String getPenultimoSalario() {
        return penultimoSalario;
    }

    public void setPenultimoSalario(String penultimoSalario) {
        this.penultimoSalario = penultimoSalario;
    }

    public String getPenultimoMotivoSaida() {
        return penultimoMotivoSaida;
    }

    public void setPenultimoMotivoSaida(String penultimoMotivoSaida) {
        this.penultimoMotivoSaida = penultimoMotivoSaida;
    }

    public String getCargoPretendido() {
        return CargoPretendido;
    }

    public void setCargoPretendido(String CargoPretendido) {
        this.CargoPretendido = CargoPretendido;
    }

    public String getPretensaoSalarial() {
        return pretensaoSalarial;
    }

    public void setPretensaoSalarial(String pretensaoSalarial) {
        this.pretensaoSalarial = pretensaoSalarial;
    }

    public String getSubmeteExperiencia() {
        return submeteExperiencia;
    }

    public void setSubmeteExperiencia(String submeteExperiencia) {
        this.submeteExperiencia = submeteExperiencia;
    }

    public String getPagouContibuicao() {
        return pagouContibuicao;
    }

    public void setPagouContibuicao(String pagouContibuicao) {
        this.pagouContibuicao = pagouContibuicao;
    }

    public String getPenultimoPeriodo() {
        return penultimoPeriodo;
    }

    public void setPenultimoPeriodo(String penultimoPeriodo) {
        this.penultimoPeriodo = penultimoPeriodo;
    }

}