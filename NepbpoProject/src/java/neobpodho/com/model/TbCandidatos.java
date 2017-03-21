/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neobpodho.com.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alex.asilva
 */
@Entity
@Table(name = "tb_candidatos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbCandidatos.findAll", query = "SELECT t FROM TbCandidatos t")
    , @NamedQuery(name = "TbCandidatos.findByIdCandidados", query = "SELECT t FROM TbCandidatos t WHERE t.idCandidados = :idCandidados")
    , @NamedQuery(name = "TbCandidatos.findByFonteRecrutamento", query = "SELECT t FROM TbCandidatos t WHERE t.fonteRecrutamento = :fonteRecrutamento")
    , @NamedQuery(name = "TbCandidatos.findByConsultindiqueAmigooutros", query = "SELECT t FROM TbCandidatos t WHERE t.consultindiqueAmigooutros = :consultindiqueAmigooutros")
    , @NamedQuery(name = "TbCandidatos.findByNomecompleto", query = "SELECT t FROM TbCandidatos t WHERE t.nomecompleto = :nomecompleto")
    , @NamedQuery(name = "TbCandidatos.findByEmail", query = "SELECT t FROM TbCandidatos t WHERE t.email = :email")
    , @NamedQuery(name = "TbCandidatos.findByCep", query = "SELECT t FROM TbCandidatos t WHERE t.cep = :cep")
    , @NamedQuery(name = "TbCandidatos.findByRua", query = "SELECT t FROM TbCandidatos t WHERE t.rua = :rua")
    , @NamedQuery(name = "TbCandidatos.findByBairro", query = "SELECT t FROM TbCandidatos t WHERE t.bairro = :bairro")
    , @NamedQuery(name = "TbCandidatos.findByNumero", query = "SELECT t FROM TbCandidatos t WHERE t.numero = :numero")
    , @NamedQuery(name = "TbCandidatos.findByComplemento", query = "SELECT t FROM TbCandidatos t WHERE t.complemento = :complemento")
    , @NamedQuery(name = "TbCandidatos.findByCidade", query = "SELECT t FROM TbCandidatos t WHERE t.cidade = :cidade")
    , @NamedQuery(name = "TbCandidatos.findByUf", query = "SELECT t FROM TbCandidatos t WHERE t.uf = :uf")
    , @NamedQuery(name = "TbCandidatos.findByPais", query = "SELECT t FROM TbCandidatos t WHERE t.pais = :pais")
    , @NamedQuery(name = "TbCandidatos.findBySexo", query = "SELECT t FROM TbCandidatos t WHERE t.sexo = :sexo")
    , @NamedQuery(name = "TbCandidatos.findByIdade", query = "SELECT t FROM TbCandidatos t WHERE t.idade = :idade")
    , @NamedQuery(name = "TbCandidatos.findByEstadoCivil", query = "SELECT t FROM TbCandidatos t WHERE t.estadoCivil = :estadoCivil")
    , @NamedQuery(name = "TbCandidatos.findByNomeMae", query = "SELECT t FROM TbCandidatos t WHERE t.nomeMae = :nomeMae")
    , @NamedQuery(name = "TbCandidatos.findByNomePai", query = "SELECT t FROM TbCandidatos t WHERE t.nomePai = :nomePai")
    , @NamedQuery(name = "TbCandidatos.findByDataNasci", query = "SELECT t FROM TbCandidatos t WHERE t.dataNasci = :dataNasci")
    , @NamedQuery(name = "TbCandidatos.findByRaca", query = "SELECT t FROM TbCandidatos t WHERE t.raca = :raca")
    , @NamedQuery(name = "TbCandidatos.findByCelular", query = "SELECT t FROM TbCandidatos t WHERE t.celular = :celular")
    , @NamedQuery(name = "TbCandidatos.findByTelefone", query = "SELECT t FROM TbCandidatos t WHERE t.telefone = :telefone")
    , @NamedQuery(name = "TbCandidatos.findByFilhos", query = "SELECT t FROM TbCandidatos t WHERE t.filhos = :filhos")
    , @NamedQuery(name = "TbCandidatos.findByNomeFilhos", query = "SELECT t FROM TbCandidatos t WHERE t.nomeFilhos = :nomeFilhos")
    , @NamedQuery(name = "TbCandidatos.findByQntConducoes", query = "SELECT t FROM TbCandidatos t WHERE t.qntConducoes = :qntConducoes")
    , @NamedQuery(name = "TbCandidatos.findByValorConducao", query = "SELECT t FROM TbCandidatos t WHERE t.valorConducao = :valorConducao")
    , @NamedQuery(name = "TbCandidatos.findByTransportes", query = "SELECT t FROM TbCandidatos t WHERE t.transportes = :transportes")
    , @NamedQuery(name = "TbCandidatos.findByOutrosTransportes", query = "SELECT t FROM TbCandidatos t WHERE t.outrosTransportes = :outrosTransportes")
    , @NamedQuery(name = "TbCandidatos.findByHorarioDisposnivel", query = "SELECT t FROM TbCandidatos t WHERE t.horarioDisposnivel = :horarioDisposnivel")
    , @NamedQuery(name = "TbCandidatos.findByEspecificarHorario", query = "SELECT t FROM TbCandidatos t WHERE t.especificarHorario = :especificarHorario")
    , @NamedQuery(name = "TbCandidatos.findByDispSabDom", query = "SELECT t FROM TbCandidatos t WHERE t.dispSabDom = :dispSabDom")
    , @NamedQuery(name = "TbCandidatos.findByTrabalhouTivit", query = "SELECT t FROM TbCandidatos t WHERE t.trabalhouTivit = :trabalhouTivit")
    , @NamedQuery(name = "TbCandidatos.findByPeriodoTrabTivit", query = "SELECT t FROM TbCandidatos t WHERE t.periodoTrabTivit = :periodoTrabTivit")
    , @NamedQuery(name = "TbCandidatos.findByPartProcTivitNeobpo", query = "SELECT t FROM TbCandidatos t WHERE t.partProcTivitNeobpo = :partProcTivitNeobpo")
    , @NamedQuery(name = "TbCandidatos.findByProdutoProcSeletivo", query = "SELECT t FROM TbCandidatos t WHERE t.produtoProcSeletivo = :produtoProcSeletivo")
    , @NamedQuery(name = "TbCandidatos.findByTrabalhouTelemrk", query = "SELECT t FROM TbCandidatos t WHERE t.trabalhouTelemrk = :trabalhouTelemrk")
    , @NamedQuery(name = "TbCandidatos.findByTempoTrabTelemrk", query = "SELECT t FROM TbCandidatos t WHERE t.tempoTrabTelemrk = :tempoTrabTelemrk")
    , @NamedQuery(name = "TbCandidatos.findByTipoTelemrk", query = "SELECT t FROM TbCandidatos t WHERE t.tipoTelemrk = :tipoTelemrk")
    , @NamedQuery(name = "TbCandidatos.findByParentesNeobpo", query = "SELECT t FROM TbCandidatos t WHERE t.parentesNeobpo = :parentesNeobpo")
    , @NamedQuery(name = "TbCandidatos.findByNomeParente", query = "SELECT t FROM TbCandidatos t WHERE t.nomeParente = :nomeParente")
    , @NamedQuery(name = "TbCandidatos.findByPortadorDeficiencia", query = "SELECT t FROM TbCandidatos t WHERE t.portadorDeficiencia = :portadorDeficiencia")
    , @NamedQuery(name = "TbCandidatos.findByTipoDeficiencia", query = "SELECT t FROM TbCandidatos t WHERE t.tipoDeficiencia = :tipoDeficiencia")
    , @NamedQuery(name = "TbCandidatos.findByCpf", query = "SELECT t FROM TbCandidatos t WHERE t.cpf = :cpf")
    , @NamedQuery(name = "TbCandidatos.findByRg", query = "SELECT t FROM TbCandidatos t WHERE t.rg = :rg")
    , @NamedQuery(name = "TbCandidatos.findByDataEmissaoRg", query = "SELECT t FROM TbCandidatos t WHERE t.dataEmissaoRg = :dataEmissaoRg")
    , @NamedQuery(name = "TbCandidatos.findByOrgaoEmissorRg", query = "SELECT t FROM TbCandidatos t WHERE t.orgaoEmissorRg = :orgaoEmissorRg")
    , @NamedQuery(name = "TbCandidatos.findByTitlutoEleitor", query = "SELECT t FROM TbCandidatos t WHERE t.titlutoEleitor = :titlutoEleitor")
    , @NamedQuery(name = "TbCandidatos.findByZonaTitulo", query = "SELECT t FROM TbCandidatos t WHERE t.zonaTitulo = :zonaTitulo")
    , @NamedQuery(name = "TbCandidatos.findBySecaoTitulo", query = "SELECT t FROM TbCandidatos t WHERE t.secaoTitulo = :secaoTitulo")
    , @NamedQuery(name = "TbCandidatos.findByCarteiraClt", query = "SELECT t FROM TbCandidatos t WHERE t.carteiraClt = :carteiraClt")
    , @NamedQuery(name = "TbCandidatos.findBySerieClt", query = "SELECT t FROM TbCandidatos t WHERE t.serieClt = :serieClt")
    , @NamedQuery(name = "TbCandidatos.findByDataEmissaoClt", query = "SELECT t FROM TbCandidatos t WHERE t.dataEmissaoClt = :dataEmissaoClt")
    , @NamedQuery(name = "TbCandidatos.findByEstadoEmissorClt", query = "SELECT t FROM TbCandidatos t WHERE t.estadoEmissorClt = :estadoEmissorClt")
    , @NamedQuery(name = "TbCandidatos.findByReservista", query = "SELECT t FROM TbCandidatos t WHERE t.reservista = :reservista")
    , @NamedQuery(name = "TbCandidatos.findByCategoriaReservista", query = "SELECT t FROM TbCandidatos t WHERE t.categoriaReservista = :categoriaReservista")
    , @NamedQuery(name = "TbCandidatos.findByPisPasep", query = "SELECT t FROM TbCandidatos t WHERE t.pisPasep = :pisPasep")
    , @NamedQuery(name = "TbCandidatos.findByPisPasepNum", query = "SELECT t FROM TbCandidatos t WHERE t.pisPasepNum = :pisPasepNum")
    , @NamedQuery(name = "TbCandidatos.findByEnsinoMedio", query = "SELECT t FROM TbCandidatos t WHERE t.ensinoMedio = :ensinoMedio")
    , @NamedQuery(name = "TbCandidatos.findByDataConclusaoEnsino", query = "SELECT t FROM TbCandidatos t WHERE t.dataConclusaoEnsino = :dataConclusaoEnsino")
    , @NamedQuery(name = "TbCandidatos.findByNomeCursoTec", query = "SELECT t FROM TbCandidatos t WHERE t.nomeCursoTec = :nomeCursoTec")
    , @NamedQuery(name = "TbCandidatos.findByGraduacaoInst", query = "SELECT t FROM TbCandidatos t WHERE t.graduacaoInst = :graduacaoInst")
    , @NamedQuery(name = "TbCandidatos.findByDataGraduacao", query = "SELECT t FROM TbCandidatos t WHERE t.dataGraduacao = :dataGraduacao")
    , @NamedQuery(name = "TbCandidatos.findByNomeCursoGraduacao", query = "SELECT t FROM TbCandidatos t WHERE t.nomeCursoGraduacao = :nomeCursoGraduacao")
    , @NamedQuery(name = "TbCandidatos.findByPosGraduacaoInst", query = "SELECT t FROM TbCandidatos t WHERE t.posGraduacaoInst = :posGraduacaoInst")
    , @NamedQuery(name = "TbCandidatos.findByDataPosGraduacao", query = "SELECT t FROM TbCandidatos t WHERE t.dataPosGraduacao = :dataPosGraduacao")
    , @NamedQuery(name = "TbCandidatos.findByNomeCursoPosGraduacao", query = "SELECT t FROM TbCandidatos t WHERE t.nomeCursoPosGraduacao = :nomeCursoPosGraduacao")
    , @NamedQuery(name = "TbCandidatos.findByDataCadastroCand", query = "SELECT t FROM TbCandidatos t WHERE t.dataCadastroCand = :dataCadastroCand")
    , @NamedQuery(name = "TbCandidatos.findByConhecimentoInfo", query = "SELECT t FROM TbCandidatos t WHERE t.conhecimentoInfo = :conhecimentoInfo")
    , @NamedQuery(name = "TbCandidatos.findByConhecimentoIdioma", query = "SELECT t FROM TbCandidatos t WHERE t.conhecimentoIdioma = :conhecimentoIdioma")
    , @NamedQuery(name = "TbCandidatos.findByQualIdioma", query = "SELECT t FROM TbCandidatos t WHERE t.qualIdioma = :qualIdioma")
    , @NamedQuery(name = "TbCandidatos.findByOutrosCursos", query = "SELECT t FROM TbCandidatos t WHERE t.outrosCursos = :outrosCursos")
    , @NamedQuery(name = "TbCandidatos.findByAtualEmpresa", query = "SELECT t FROM TbCandidatos t WHERE t.atualEmpresa = :atualEmpresa")
    , @NamedQuery(name = "TbCandidatos.findByUltimoCargo", query = "SELECT t FROM TbCandidatos t WHERE t.ultimoCargo = :ultimoCargo")
    , @NamedQuery(name = "TbCandidatos.findByEnderecoEmpresa", query = "SELECT t FROM TbCandidatos t WHERE t.enderecoEmpresa = :enderecoEmpresa")
    , @NamedQuery(name = "TbCandidatos.findByTelefoneEmpresa", query = "SELECT t FROM TbCandidatos t WHERE t.telefoneEmpresa = :telefoneEmpresa")
    , @NamedQuery(name = "TbCandidatos.findByPeriodoEmpresa", query = "SELECT t FROM TbCandidatos t WHERE t.periodoEmpresa = :periodoEmpresa")
    , @NamedQuery(name = "TbCandidatos.findByUltimoSalario", query = "SELECT t FROM TbCandidatos t WHERE t.ultimoSalario = :ultimoSalario")
    , @NamedQuery(name = "TbCandidatos.findByMotivoSaida", query = "SELECT t FROM TbCandidatos t WHERE t.motivoSaida = :motivoSaida")
    , @NamedQuery(name = "TbCandidatos.findByPenultimaEmpresa", query = "SELECT t FROM TbCandidatos t WHERE t.penultimaEmpresa = :penultimaEmpresa")
    , @NamedQuery(name = "TbCandidatos.findByPenultimoCargo", query = "SELECT t FROM TbCandidatos t WHERE t.penultimoCargo = :penultimoCargo")
    , @NamedQuery(name = "TbCandidatos.findByPenultimoEnderecoEmpresa", query = "SELECT t FROM TbCandidatos t WHERE t.penultimoEnderecoEmpresa = :penultimoEnderecoEmpresa")
    , @NamedQuery(name = "TbCandidatos.findByPenultimoTelEmpresa", query = "SELECT t FROM TbCandidatos t WHERE t.penultimoTelEmpresa = :penultimoTelEmpresa")
    , @NamedQuery(name = "TbCandidatos.findByPenultimoPeriodoEmpresa", query = "SELECT t FROM TbCandidatos t WHERE t.penultimoPeriodoEmpresa = :penultimoPeriodoEmpresa")
    , @NamedQuery(name = "TbCandidatos.findByPenultimoSalario", query = "SELECT t FROM TbCandidatos t WHERE t.penultimoSalario = :penultimoSalario")
    , @NamedQuery(name = "TbCandidatos.findByPenultimoMotivoSaida", query = "SELECT t FROM TbCandidatos t WHERE t.penultimoMotivoSaida = :penultimoMotivoSaida")
    , @NamedQuery(name = "TbCandidatos.findByCargoPretendido", query = "SELECT t FROM TbCandidatos t WHERE t.cargoPretendido = :cargoPretendido")
    , @NamedQuery(name = "TbCandidatos.findByPretensaoSalarial", query = "SELECT t FROM TbCandidatos t WHERE t.pretensaoSalarial = :pretensaoSalarial")
    , @NamedQuery(name = "TbCandidatos.findBySubmeteExperiencia", query = "SELECT t FROM TbCandidatos t WHERE t.submeteExperiencia = :submeteExperiencia")
    , @NamedQuery(name = "TbCandidatos.findByPagouContribuicao", query = "SELECT t FROM TbCandidatos t WHERE t.pagouContribuicao = :pagouContribuicao")})
public class TbCandidatos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_candidados")
    private Integer idCandidados;
    @Column(name = "fonte_recrutamento")
    private String fonteRecrutamento;
    @Column(name = "consult_indiqueAmigo_outros")
    private String consultindiqueAmigooutros;
    @Basic(optional = false)
    @Column(name = "nomecompleto")
    private String nomecompleto;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "cep")
    private String cep;
    @Basic(optional = false)
    @Column(name = "rua")
    private String rua;
    @Basic(optional = false)
    @Column(name = "bairro")
    private String bairro;
    @Basic(optional = false)
    @Column(name = "numero")
    private int numero;
    @Column(name = "complemento")
    private String complemento;
    @Basic(optional = false)
    @Column(name = "cidade")
    private String cidade;
    @Basic(optional = false)
    @Column(name = "uf")
    private String uf;
    @Basic(optional = false)
    @Column(name = "pais")
    private String pais;
    @Basic(optional = false)
    @Column(name = "sexo")
    private String sexo;
    @Basic(optional = false)
    @Column(name = "idade")
    private String idade;
    @Basic(optional = false)
    @Column(name = "estado_civil")
    private String estadoCivil;
    @Basic(optional = false)
    @Column(name = "nome_mae")
    private String nomeMae;
    @Basic(optional = false)
    @Column(name = "nome_pai")
    private String nomePai;
    @Basic(optional = false)
    @Column(name = "data_nasci")
    @Temporal(TemporalType.DATE)
    private Date dataNasci;
    @Basic(optional = false)
    @Column(name = "raca")
    private String raca;
    @Basic(optional = false)
    @Column(name = "celular")
    private String celular;
    @Column(name = "telefone")
    private String telefone;
    @Basic(optional = false)
    @Column(name = "filhos")
    private String filhos;
    @Column(name = "nome_filhos")
    private String nomeFilhos;
    @Basic(optional = false)
    @Column(name = "qnt_conducoes")
    private String qntConducoes;
    @Basic(optional = false)
    @Column(name = "valor_conducao")
    private float valorConducao;
    @Column(name = "transportes")
    private String transportes;
    @Column(name = "outros_transportes")
    private String outrosTransportes;
    @Basic(optional = false)
    @Column(name = "horario_disposnivel")
    private String horarioDisposnivel;
    @Column(name = "especificar_horario")
    private String especificarHorario;
    @Basic(optional = false)
    @Column(name = "disp_sab_dom")
    private String dispSabDom;
    @Basic(optional = false)
    @Column(name = "trabalhou_tivit")
    private String trabalhouTivit;
    @Column(name = "periodo_trab_tivit")
    private String periodoTrabTivit;
    @Basic(optional = false)
    @Column(name = "part_proc_tivit_neobpo")
    private String partProcTivitNeobpo;
    @Column(name = "produto_proc_seletivo")
    private String produtoProcSeletivo;
    @Basic(optional = false)
    @Column(name = "trabalhou_telemrk")
    private String trabalhouTelemrk;
    @Column(name = "tempo_trab_telemrk")
    private String tempoTrabTelemrk;
    @Column(name = "tipo_telemrk")
    private String tipoTelemrk;
    @Basic(optional = false)
    @Column(name = "parentes_neobpo")
    private String parentesNeobpo;
    @Column(name = "nome_parente")
    private String nomeParente;
    @Basic(optional = false)
    @Column(name = "portador_deficiencia")
    private String portadorDeficiencia;
    @Column(name = "tipo_deficiencia")
    private String tipoDeficiencia;
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "rg")
    private String rg;
    @Basic(optional = false)
    @Column(name = "data_emissao_rg")
    @Temporal(TemporalType.DATE)
    private Date dataEmissaoRg;
    @Basic(optional = false)
    @Column(name = "orgao_emissor_rg")
    private String orgaoEmissorRg;
    @Basic(optional = false)
    @Column(name = "titluto_eleitor")
    private String titlutoEleitor;
    @Basic(optional = false)
    @Column(name = "zona_titulo")
    private String zonaTitulo;
    @Basic(optional = false)
    @Column(name = "secao_titulo")
    private String secaoTitulo;
    @Basic(optional = false)
    @Column(name = "carteira_clt")
    private String carteiraClt;
    @Basic(optional = false)
    @Column(name = "serie_clt")
    private String serieClt;
    @Basic(optional = false)
    @Column(name = "data_emissao_clt")
    @Temporal(TemporalType.DATE)
    private Date dataEmissaoClt;
    @Basic(optional = false)
    @Column(name = "estado_emissor_clt")
    private String estadoEmissorClt;
    @Basic(optional = false)
    @Column(name = "reservista")
    private String reservista;
    @Basic(optional = false)
    @Column(name = "categoria_reservista")
    private String categoriaReservista;
    @Basic(optional = false)
    @Column(name = "pis_pasep")
    private String pisPasep;
    @Column(name = "pis_pasep_num")
    private String pisPasepNum;
    @Basic(optional = false)
    @Column(name = "ensino_medio")
    private String ensinoMedio;
    @Column(name = "data_conclusao_ensino")
    private String dataConclusaoEnsino;
    @Column(name = "nome_curso_tec")
    private String nomeCursoTec;
    @Column(name = "graduacao_inst")
    private String graduacaoInst;
    @Column(name = "data_graduacao")
    private String dataGraduacao;
    @Column(name = "nome_curso_graduacao")
    private String nomeCursoGraduacao;
    @Column(name = "pos_graduacao_inst")
    private String posGraduacaoInst;
    @Column(name = "data_pos_graduacao")
    private String dataPosGraduacao;
    @Column(name = "nome_curso_pos_graduacao")
    private String nomeCursoPosGraduacao;
    @Basic(optional = false)
    @Column(name = "data_cadastro_cand")
    @Temporal(TemporalType.DATE)
    private Date dataCadastroCand;
    @Column(name = "conhecimento_info")
    private String conhecimentoInfo;
    @Column(name = "conhecimento_idioma")
    private String conhecimentoIdioma;
    @Column(name = "qual_idioma")
    private String qualIdioma;
    @Column(name = "outros_cursos")
    private String outrosCursos;
    @Column(name = "atual_empresa")
    private String atualEmpresa;
    @Column(name = "ultimo_cargo")
    private String ultimoCargo;
    @Column(name = "endereco_empresa")
    private String enderecoEmpresa;
    @Column(name = "telefone_empresa")
    private String telefoneEmpresa;
    @Column(name = "periodo_empresa")
    private String periodoEmpresa;
    @Column(name = "ultimo_salario")
    private String ultimoSalario;
    @Column(name = "motivo_saida")
    private String motivoSaida;
    @Column(name = "penultima_empresa")
    private String penultimaEmpresa;
    @Column(name = "penultimo_cargo")
    private String penultimoCargo;
    @Column(name = "penultimo_endereco_empresa")
    private String penultimoEnderecoEmpresa;
    @Column(name = "penultimo_tel_empresa")
    private String penultimoTelEmpresa;
    @Column(name = "penultimo_periodo_empresa")
    private String penultimoPeriodoEmpresa;
    @Column(name = "penultimo_salario")
    private String penultimoSalario;
    @Column(name = "penultimo_motivo_saida")
    private String penultimoMotivoSaida;
    @Column(name = "cargo_pretendido")
    private String cargoPretendido;
    @Column(name = "pretensao_salarial")
    private String pretensaoSalarial;
    @Column(name = "submete_experiencia")
    private String submeteExperiencia;
    @Column(name = "pagou_contribuicao")
    private String pagouContribuicao;

    public TbCandidatos() {
    }

    public TbCandidatos(Integer idCandidados) {
        this.idCandidados = idCandidados;
    }

    public TbCandidatos(Integer idCandidados, String nomecompleto, String email, String cep, String rua, String bairro, int numero, String cidade, String uf, String pais, String sexo, String idade, String estadoCivil, String nomeMae, String nomePai, Date dataNasci, String raca, String celular, String filhos, String qntConducoes, float valorConducao, String horarioDisposnivel, String dispSabDom, String trabalhouTivit, String partProcTivitNeobpo, String trabalhouTelemrk, String parentesNeobpo, String portadorDeficiencia, String cpf, String rg, Date dataEmissaoRg, String orgaoEmissorRg, String titlutoEleitor, String zonaTitulo, String secaoTitulo, String carteiraClt, String serieClt, Date dataEmissaoClt, String estadoEmissorClt, String reservista, String categoriaReservista, String pisPasep, String ensinoMedio, Date dataCadastroCand) {
        this.idCandidados = idCandidados;
        this.nomecompleto = nomecompleto;
        this.email = email;
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
        this.pais = pais;
        this.sexo = sexo;
        this.idade = idade;
        this.estadoCivil = estadoCivil;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.dataNasci = dataNasci;
        this.raca = raca;
        this.celular = celular;
        this.filhos = filhos;
        this.qntConducoes = qntConducoes;
        this.valorConducao = valorConducao;
        this.horarioDisposnivel = horarioDisposnivel;
        this.dispSabDom = dispSabDom;
        this.trabalhouTivit = trabalhouTivit;
        this.partProcTivitNeobpo = partProcTivitNeobpo;
        this.trabalhouTelemrk = trabalhouTelemrk;
        this.parentesNeobpo = parentesNeobpo;
        this.portadorDeficiencia = portadorDeficiencia;
        this.cpf = cpf;
        this.rg = rg;
        this.dataEmissaoRg = dataEmissaoRg;
        this.orgaoEmissorRg = orgaoEmissorRg;
        this.titlutoEleitor = titlutoEleitor;
        this.zonaTitulo = zonaTitulo;
        this.secaoTitulo = secaoTitulo;
        this.carteiraClt = carteiraClt;
        this.serieClt = serieClt;
        this.dataEmissaoClt = dataEmissaoClt;
        this.estadoEmissorClt = estadoEmissorClt;
        this.reservista = reservista;
        this.categoriaReservista = categoriaReservista;
        this.pisPasep = pisPasep;
        this.ensinoMedio = ensinoMedio;
        this.dataCadastroCand = dataCadastroCand;
    }

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

    public Date getDataNasci() {
        return dataNasci;
    }

    public void setDataNasci(Date dataNasci) {
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

    public Date getDataEmissaoRg() {
        return dataEmissaoRg;
    }

    public void setDataEmissaoRg(Date dataEmissaoRg) {
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

    public Date getDataEmissaoClt() {
        return dataEmissaoClt;
    }

    public void setDataEmissaoClt(Date dataEmissaoClt) {
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

    public Date getDataCadastroCand() {
        return dataCadastroCand;
    }

    public void setDataCadastroCand(Date dataCadastroCand) {
        this.dataCadastroCand = dataCadastroCand;
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

    public String getPenultimoPeriodoEmpresa() {
        return penultimoPeriodoEmpresa;
    }

    public void setPenultimoPeriodoEmpresa(String penultimoPeriodoEmpresa) {
        this.penultimoPeriodoEmpresa = penultimoPeriodoEmpresa;
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
        return cargoPretendido;
    }

    public void setCargoPretendido(String cargoPretendido) {
        this.cargoPretendido = cargoPretendido;
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

    public String getPagouContribuicao() {
        return pagouContribuicao;
    }

    public void setPagouContribuicao(String pagouContribuicao) {
        this.pagouContribuicao = pagouContribuicao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCandidados != null ? idCandidados.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbCandidatos)) {
            return false;
        }
        TbCandidatos other = (TbCandidatos) object;
        if ((this.idCandidados == null && other.idCandidados != null) || (this.idCandidados != null && !this.idCandidados.equals(other.idCandidados))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "neobpodho.com.model.TbCandidatos[ idCandidados=" + idCandidados + " ]";
    }
    
}
