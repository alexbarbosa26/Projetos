/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neobpodho.dao;

import com.neobpodho.model.TbCandidatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex
 */
public class CandidatoDao {

    private Connection con;
    private Statement st;
    private ResultSet rs;

    public int conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/neobpodho", "root", "tivitrep123");
            this.st = this.con.createStatement();
            return 1;
        } catch (SQLException ex) {
            return 0;
        } catch (ClassNotFoundException ex) {
        }
        return 0;
    }

    public int salvar(TbCandidatos e) {
        try {
            return this.st.executeUpdate("INSERT INTO tb_candidatos (fonte_recrutamento, consult_indiqueAmigo_outros, nomecompleto, email, cep, rua, bairro, numero, complemento, cidade, uf, pais, sexo, idade, estado_civil, nome_mae, nome_pai, data_nasci, raca, celular, telefone, filhos, nome_filhos, qnt_conducoes, valor_conducao, transportes, outros_transportes, horario_disposnivel, especificar_horario, disp_sab_dom, trabalhou_tivit, periodo_trab_tivit, part_proc_tivit_neobpo, produto_proc_seletivo, trabalhou_telemrk, tempo_trab_telemrk, tipo_telemrk, parentes_neobpo, nome_parente, portador_deficiencia, tipo_deficiencia, cpf, rg, data_emissao_rg, orgao_emissor_rg, titluto_eleitor, zona_titulo, secao_titulo, carteira_clt, serie_clt, data_emissao_clt, estado_emissor_clt, reservista, categoria_reservista, pis_pasep, pis_pasep_num, ensino_medio, data_conclusao_ensino, nome_curso_tec, graduacao_inst, data_graduacao, nome_curso_graduacao, pos_graduacao_inst, data_pos_graduacao, nome_curso_pos_graduacao,conhecimento_info,conhecimento_idioma,qual_idioma,outros_cursos,atual_empresa,ultimo_cargo,endereco_empresa,telefone_empresa,periodo_empresa,ultimo_salario,motivo_saida,penultima_empresa,penultimo_cargo,penultimo_endereco_empresa,penultimo_tel_empresa,penultimo_periodo_empresa,penultimo_salario,penultimo_motivo_saida,cargo_pretendido,pretensao_salarial,submete_experiencia,pagou_contribuicao, data_cadastro_cand)\n"
                    + "VALUES('" + e.getFonteRecrutamento() + "','" + e.getConsultindiqueAmigooutros() + "','" + e.getNomecompleto() + "','" + e.getEmail() + "','" + e.getCep() + "','" + e.getRua() + "','" + e.getBairro() + "'," + e.getNumero() + ",'" + e.getComplemento() + "','" + e.getCidade() + "','" + e.getUf() + "','" + e.getPais() + "','" + e.getSexo() + "','" + e.getIdade() + "','" + e.getEstadoCivil() + "','" + e.getNomeMae() + "','" + e.getNomePai() + "','" + e.getDataNasci() + "','" + e.getRaca() + "','" + e.getCelular() + "','" + e.getTelefone() + "','" + e.getFilhos() + "','" + e.getNomeFilhos() + "','" + e.getQntConducoes() + "','" + e.getValorConducao() + "','" + e.getTransportes() + "'," + e.getOutrosTransportes() + ",'" + e.getHorarioDisposnivel() + "','" + e.getEspecificarHorario() + "','" + e.getDispSabDom() + "','" + e.getTrabalhouTivit() + "','" + e.getPeriodoTrabTivit()+ "','" + e.getPartProcTivitNeobpo() + "','" + e.getProdutoProcSeletivo() + "','" + e.getTrabalhouTelemrk() + "','" + e.getTempoTrabTelemrk() + "','" + e.getTipoTelemrk() + "','" + e.getParentesNeobpo() + "','" + e.getNomeParente() + "','" + e.getPortadorDeficiencia() + "','" + e.getTipoDeficiencia() + "','" + e.getCpf() + "','" + e.getRg() + "','" + e.getDataEmissaoRg() + "','" + e.getOrgaoEmissorRg() + "','" + e.getTitlutoEleitor() + "','" + e.getZonaTitulo() + "','" + e.getSecaoTitulo() + "','" + e.getCarteiraClt() + "','" + e.getSerieClt() + "','" + e.getDataEmissaoClt() + "','" + e.getEstadoEmissorClt() + "','" + e.getReservista() + "','" + e.getCategoriaReservista() + "','" + e.getPisPasep() + "','" + e.getPisPasepNum() + "','" + e.getEnsinoMedio() + "','" + e.getDataConclusaoEnsino() + "','" + e.getNomeCursoTec() + "','" + e.getGraduacaoInst() + "','" + e.getDataGraduacao() + "','" + e.getNomeCursoGraduacao() + "','" + e.getPosGraduacaoInst() + "','" + e.getDataPosGraduacao() + "','" + e.getNomeCursoPosGraduacao() + "','" + e.getConhecimentoInfo()+ "','" + e.getConhecimentoIdioma()+ "','" + e.getQualIdioma() + "','" + e.getOutrosCursos() + "','" + e.getAtualEmpresa() + "','" + e.getUltimoCargo() + "','" + e.getEnderecoEmpresa() + "','" + e.getTelefoneEmpresa() + "','" + e.getPeriodoEmpresa() + "','" + e.getUltimoSalario() + "','" + e.getMotivoSaida() + "','" + e.getPenultimaEmpresa() + "','" + e.getPenultimoCargo() + "','" + e.getPenultimoEnderecoEmpresa() + "','" + e.getPenultimoTelEmpresa() + "','" + e.getPenultimoPeriodo()+ "','" + e.getPenultimoSalario() + "','" + e.getPenultimoMotivoSaida() + "','" + e.getCargoPretendido() + "','" + e.getPretensaoSalarial() + "','" + e.getSubmeteExperiencia() + "','" + e.getPagouContibuicao() + "', now());");
        } catch (SQLException ex) {
            Logger.getLogger(CandidatoDao.class.getName()).log(Level.SEVERE, null, ex);
            if (ex.getErrorCode() == 1062) {
                return 2;
            }
        }
        return 0;

    }

    public TbCandidatos ListarCandidatos() {
        try {
            this.rs = this.st.executeQuery("select*from tb_candidatos");
            if (this.rs.next()) {
                TbCandidatos e = new TbCandidatos();

                e.setFonteRecrutamento(rs.getString("fonte_recrutamento"));
                e.setConsultindiqueAmigooutros(rs.getString("consult_indiqueAmigo_outros"));
                e.setNomecompleto(rs.getString("nomecompleto"));
                e.setEmail(rs.getString("email"));
                e.setCep(rs.getString("cep"));
                e.setRua(rs.getString("rua"));
                e.setBairro(rs.getString("bairro"));
                e.setNumero(rs.getInt("numero"));
                e.setComplemento(rs.getString("complemento"));
                e.setCidade(rs.getString("cidade"));
                e.setUf(rs.getString("uf"));
                e.setPais(rs.getString("pais"));
                e.setSexo(rs.getString("sexo"));
                e.setIdade(rs.getString("idade"));
                e.setEstadoCivil(rs.getString("estado_civil"));
                e.setNomeMae(rs.getString("nome_mae"));
                e.setNomePai(rs.getString("nome_pai"));
                e.setDataNasci(rs.getString("data_nasci"));
                e.setRaca(rs.getString("raca"));
                e.setCelular(rs.getString("celular"));
                e.setTelefone(rs.getString("telefones"));
                e.setFilhos(rs.getString("filhos"));
                e.setNomeFilhos(rs.getString("nome_filhos"));
                e.setQntConducoes(rs.getString("qnt_conducoes"));
                e.setValorConducao(rs.getFloat("valor_conducao"));
                e.setTransportes(rs.getString("transportes"));
                e.setOutrosTransportes(rs.getString("outros_transportes"));
                e.setHorarioDisposnivel(rs.getString("horario_diponivel"));
                e.setEspecificarHorario(rs.getString("especificar_horario"));
                e.setDispSabDom(rs.getString("disp_sab_dom"));
                e.setTrabalhouTivit(rs.getString("trabalhou_tivit"));
                e.setPeriodoTrabTivit("periodo_trab_tivit");
                e.setPartProcTivitNeobpo(rs.getString("part_proc_tivit_neobpo"));
                e.setProdutoProcSeletivo(rs.getString("produto_pro_seletivo"));
                e.setTrabalhouTelemrk(rs.getString("trabalhou_telemrk"));
                e.setTempoTrabTelemrk(rs.getString("tempo_trab_telemrk"));
                e.setTipoTelemrk(rs.getString("tipo_telemrk"));
                e.setParentesNeobpo(rs.getString("parentes_neobpo"));
                e.setNomeParente(rs.getString("nome_parente"));
                e.setPortadorDeficiencia(rs.getString("portador_deficiencia"));
                e.setTipoDeficiencia(rs.getString("tipo_deficiencia"));
                e.setCpf(rs.getString("cpf"));
                e.setRg(rs.getString("rg"));
                e.setDataEmissaoRg(rs.getString("data_emissao_rg"));
                e.setOrgaoEmissorRg(rs.getString("orgao_emissor_rg"));
                e.setTitlutoEleitor(rs.getString("titulo_eleitor"));
                e.setZonaTitulo(rs.getString("zona_titulo"));
                e.setSecaoTitulo(rs.getString("secao_titulo"));
                e.setCarteiraClt(rs.getString("carteira_clt"));
                e.setSerieClt(rs.getString("serie_clt"));
                e.setDataEmissaoClt(rs.getString("data_emissao_clt"));
                e.setReservista(rs.getString("reservista"));
                e.setCategoriaReservista(rs.getString("categoria_reservista"));
                e.setPisPasep(rs.getString("pis_pasep"));
                e.setPisPasepNum(rs.getString("pis_pasep_num"));
                e.setEnsinoMedio(rs.getString("ensino_medio"));
                e.setDataConclusaoEnsino(rs.getString("data_conclusao_ensino"));
                e.setNomeCursoTec(rs.getString("nome_curso_tec"));
                e.setGraduacaoInst(rs.getString("graduacao_inst"));
                e.setDataGraduacao(rs.getString("data_graduacao"));
                e.setNomeCursoGraduacao(rs.getString("nome_curso_graduacao"));
                e.setPosGraduacaoInst(rs.getString("pos_graduacao_inst"));
                e.setDataPosGraduacao(rs.getString("data_pos_graduacao"));
                e.setNomeCursoPosGraduacao(rs.getString("nome_curso_pos_graduacao"));
                e.setDataCadastroCand(rs.getString("data_cadastro_cand"));

                return e;
            }
            return null;
        } catch (SQLException x) {
            Logger.getLogger(CandidatoDao.class.getName()).log(Level.SEVERE,null,x);
        }
        return null;
    }

    public void desconectar() {
        try {
            this.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CandidatoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
