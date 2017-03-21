/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neobpodho.com.controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import neobpodho.com.model.Candidato;
import neobpodho.com.dao.CandidatoDao;

/**
 *
 * @author alex
 */
@WebServlet(name = "Controle", urlPatterns = {"/Controle"})
public class Controle extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=iso-8859-1");
        PrintWriter out = response.getWriter();

        String flag = request.getParameter("flag");

        if (flag.equalsIgnoreCase("cadastrarCandidato")) {

            String fonteRecrutamento = request.getParameter("fonteRecrutamento");
            String nomeConsultIndique = request.getParameter("nomeConsultIndique");
            String nomeCompleto = request.getParameter("nomeCompleto");
            String email = request.getParameter("email");
            String cep = request.getParameter("cep");
            String rua = request.getParameter("rua");
            String bairro = request.getParameter("bairro");
            int numero = Integer.parseInt(request.getParameter("numero"));
            String complemento = request.getParameter("complemento");
            String cidade = request.getParameter("cidade");
            String uf = request.getParameter("uf");
            String pais = request.getParameter("pais");
            String sexo = request.getParameter("sexo");
            String idade = request.getParameter("idade");
            String estadoCivil = request.getParameter("estadoCivil");
            String nomeMae = request.getParameter("nomeMae");
            String nomePai = request.getParameter("nomePai");
            String dataNascimento = request.getParameter("dataNascimento");

            String dia = dataNascimento.substring(0, 2);
            String mes = dataNascimento.substring(3, 5);
            String ano = dataNascimento.substring(6);
            String dataParaNacimento = ano + "-" + mes + "-" + dia;

            String raca = request.getParameter("raca");
            String celular = request.getParameter("celular");
            String telefone = request.getParameter("telefone");
            String escolherFilho = request.getParameter("escolherFilho");
            String nomeFilhos = request.getParameter("nomeFilhos");
            String qntConducoes = request.getParameter("qntConducoes");
            float valorConducao = Float.parseFloat(request.getParameter("valorConducao"));
            String quaisTransportes = request.getParameter("quaisTransportes");
            String escolherHorario = request.getParameter("escolherHorario");
            String especificarHorario = request.getParameter("especificarHorario");
            String escolherSabDom = request.getParameter("escolherSabDom");
            String escolherTivit = request.getParameter("escolherTivit");

            String periodoTrabTivit = request.getParameter("periodoTrabTivit");

            String escolherProcTivit = request.getParameter("escolherProcTivit");
            String processoSeletivo = request.getParameter("processoSeletivo");
            String escolherTelemark = request.getParameter("escolherTelemark");
            String quantoTempo = request.getParameter("quantoTempo");
            String trabalhoTelemark = request.getParameter("trabalhoTelemark");
            String escolherParentes = request.getParameter("escolherParentes");
            String nomeParente = request.getParameter("nomeParente");
            String escolherDeficiencia = request.getParameter("escolherDeficiencia");
            String nomeDeficiencia = request.getParameter("nomeDeficiencia");
            String cpf = request.getParameter("cpf");
            String rg = request.getParameter("rg");

            String dataEmissaoRG = request.getParameter("dataEmissaoRG");
            String diaEmissaoRG = dataEmissaoRG.substring(0, 2);
            String mesEmissaoRG = dataEmissaoRG.substring(3, 5);
            String anoEmissaoRG = dataEmissaoRG.substring(6);
            String dataParaEmissaoRG = anoEmissaoRG + "-" + mesEmissaoRG + "-" + diaEmissaoRG;

            String orgaoEmissor = request.getParameter("orgaoEmissor");
            String tituloEleitor = request.getParameter("tituloEleitor");
            String zona = request.getParameter("zona");
            String secao = request.getParameter("secao");
            String carteiraTrabalho = request.getParameter("carteiraTrabalho");
            String serie = request.getParameter("serie");

            String dataEmissaoCLT = request.getParameter("dataEmissaoCLT");
            String diaEmissaoCLT = dataEmissaoCLT.substring(0, 2);
            String mesEmissaoCLT = dataEmissaoCLT.substring(3, 5);
            String anoEmissaoCLT = dataEmissaoCLT.substring(6);
            String dataParaEmissaoCLT = anoEmissaoCLT + "-" + mesEmissaoCLT + "-" + diaEmissaoCLT;

            String estadoEmissor = request.getParameter("estadoEmissor");
            String certificadoReservista = request.getParameter("certificadoReservista");
            String categoriaReservista = request.getParameter("categoriaReservista");
            String escolherPis = request.getParameter("escolherPis");
            String numeroPis = request.getParameter("numeroPis");
            
            String nomeEnsinoMedio = request.getParameter("nomeEnsinoMedio");
            String dataParaEnsinoMedio = request.getParameter("dataEnsinoMedio");
            String nomeEnsinoTecnico = request.getParameter("nomeEnsinoTecnico");
            
            String nomeGraduacao = request.getParameter("nomeGraduacao");
            String dataParaGraduacao = request.getParameter("dataGraduacao");
            String nomeCursoGraduacao = request.getParameter("nomeCursoGraduacao");
            
            String nomeInstituicaoPosGraduacao = request.getParameter("nomeInstituicaoPosGraduacao");            
            String dataParaPosGraduacao = request.getParameter("dataPosGraduacao");
            String nomeCursoPosGraduacao = request.getParameter("nomeCursoPosGraduacao");

            String conhecimentoInfo[] = request.getParameterValues("conhecimentoInfo");
            String escolherIdioma = request.getParameter("escolherIdioma");
            String qualIdioma = request.getParameter("idioma");
            String outrosCursos = request.getParameter("outrosCursos");
            String atualUltimaEmpresa = request.getParameter("atualUltimaEmpresa");
            String ultimoCargo = request.getParameter("ultimoCargo");
            String enderecoEmpresa = request.getParameter("enderecoEmpresa");
            String telefoneEmpresa = request.getParameter("telefoneEmpresa");
            String periodoEmpresa = request.getParameter("periodoEmpresa");
            String ultimoSalario = request.getParameter("ultimoSalario");
            String motivoSaida = request.getParameter("motivoSaida");
            String penultimaEmpresa = request.getParameter("penultimaEmpresa");
            String penultimoCargo = request.getParameter("penultimoCargo");
            String penultimoEnderecoEmpresa = request.getParameter("penultimoEnderecoEmpresa");
            String penultimoTelefoneEmpresa = request.getParameter("penultimoTelefoneEmpresa");
            String penultimoPeriodoEmpresa = request.getParameter("penultimoPeriodoEmpresa");
            String penultimoSalario = request.getParameter("penultimoSalario");
            String penultimoMotivoSaida = request.getParameter("penultimoMotivoSaida");

            String cargoPretendido = request.getParameter("cargoPretendido");
            String pretensaoSalarial = request.getParameter("pretensaoSalarial");
            String submeteExperiecia = request.getParameter("submeteExperiecia");
            String pagouContribuicao = request.getParameter("pagouContribuicao");

            Candidato eq = new Candidato();

            eq.setFonteRecrutamento(fonteRecrutamento);
            eq.setConsultindiqueAmigooutros(nomeConsultIndique);
            eq.setNomecompleto(nomeCompleto);
            eq.setEmail(email);
            eq.setCep(cep);
            eq.setRua(rua);
            eq.setBairro(bairro);
            eq.setNumero(numero);
            eq.setComplemento(complemento);
            eq.setCidade(cidade);
            eq.setUf(uf);
            eq.setPais(pais);
            eq.setSexo(sexo);
            eq.setIdade(idade);
            eq.setEstadoCivil(estadoCivil);
            eq.setNomeMae(nomeMae);
            eq.setNomePai(nomePai);
            eq.setDataNasci(dataParaNacimento);
            eq.setRaca(raca);
            eq.setCelular(celular);
            eq.setTelefone(telefone);
            eq.setFilhos(escolherFilho);
            eq.setNomeFilhos(nomeFilhos);
            eq.setQntConducoes(qntConducoes);
            eq.setValorConducao(valorConducao);
            eq.setTransportes(quaisTransportes);
            eq.setHorarioDisposnivel(escolherHorario);
            eq.setEspecificarHorario(especificarHorario);
            eq.setDispSabDom(escolherSabDom);
            eq.setTrabalhouTivit(escolherTivit);
            eq.setPeriodoTrabTivit(periodoTrabTivit);
            eq.setPartProcTivitNeobpo(escolherProcTivit);
            eq.setProdutoProcSeletivo(processoSeletivo);
            eq.setTrabalhouTelemrk(escolherTelemark);
            eq.setTempoTrabTelemrk(quantoTempo);
            eq.setTipoTelemrk(trabalhoTelemark);
            eq.setParentesNeobpo(escolherParentes);
            eq.setNomeParente(nomeParente);
            eq.setPortadorDeficiencia(escolherDeficiencia);
            eq.setTipoDeficiencia(nomeDeficiencia);
            eq.setCpf(cpf);
            eq.setRg(rg);
            eq.setDataEmissaoRg(dataParaEmissaoRG);
            eq.setOrgaoEmissorRg(orgaoEmissor);
            eq.setTitlutoEleitor(tituloEleitor);
            eq.setZonaTitulo(zona);
            eq.setSecaoTitulo(secao);
            eq.setCarteiraClt(carteiraTrabalho);
            eq.setSerieClt(serie);
            eq.setDataEmissaoClt(dataParaEmissaoCLT);
            eq.setEstadoEmissorClt(estadoEmissor);
            eq.setReservista(certificadoReservista);
            eq.setCategoriaReservista(categoriaReservista);
            eq.setPisPasep(escolherPis);
            eq.setPisPasepNum(numeroPis);
            eq.setEnsinoMedio(nomeEnsinoMedio);
            eq.setDataConclusaoEnsino(dataParaEnsinoMedio);
            eq.setNomeCursoTec(nomeEnsinoTecnico);
            eq.setGraduacaoInst(nomeGraduacao);
            eq.setDataGraduacao(dataParaGraduacao);
            eq.setNomeCursoGraduacao(nomeCursoGraduacao);
            eq.setPosGraduacaoInst(nomeInstituicaoPosGraduacao);
            eq.setDataPosGraduacao(dataParaPosGraduacao);
            eq.setNomeCursoPosGraduacao(nomeCursoPosGraduacao);

            for (int i = 0; i < conhecimentoInfo.length; i++) {
                List list = Arrays.asList(conhecimentoInfo);
                eq.setConhecimentoInfo(list.toString());
            }

            eq.setConhecimentoIdioma(escolherIdioma);
            eq.setQualIdioma(qualIdioma);
            eq.setOutrosCursos(outrosCursos);
            eq.setAtualEmpresa(atualUltimaEmpresa);
            eq.setUltimoCargo(ultimoCargo);
            eq.setEnderecoEmpresa(enderecoEmpresa);
            eq.setTelefoneEmpresa(telefoneEmpresa);
            eq.setPeriodoEmpresa(periodoEmpresa);
            eq.setUltimoSalario(ultimoSalario);
            eq.setMotivoSaida(motivoSaida);
            eq.setPenultimaEmpresa(penultimaEmpresa);
            eq.setPenultimoCargo(penultimoCargo);
            eq.setPenultimoEnderecoEmpresa(penultimoEnderecoEmpresa);
            eq.setPenultimoTelEmpresa(penultimoTelefoneEmpresa);
            eq.setPenultimoPeriodo(penultimoPeriodoEmpresa);
            eq.setPenultimoSalario(penultimoSalario);
            eq.setPenultimoMotivoSaida(penultimoMotivoSaida);
            eq.setCargoPretendido(cargoPretendido);
            eq.setPretensaoSalarial(pretensaoSalarial);
            eq.setSubmeteExperiencia(submeteExperiecia);
            eq.setPagouContibuicao(pagouContribuicao);

            CandidatoDao dao = new CandidatoDao();

            //Para fazer a conexão com o banco de dados            
            int ret = dao.conectar();

            if (ret == 0) {
                response.sendRedirect("Restrito/pagina.erro/erro_conexao.html");
            } else {
                ret = dao.salvar(eq);
                if (ret == 0) {
                    out.print("<script>alert('ERRO AO TENTAR SALVAR OS DADOS !'); location.href='javascript:history.go(-1)'</script>");
                } else if (ret == 2) {
                    out.print("<script>alert('CPF JÁ EXISTENTE NA NOSSA BASE!\\nFAVOR VERIFICAR CORRETAMENTE OS DADOS CADASTRADOS.'); location.href='javascript:history.go(-1)'</script>");
                } else {
                    out.print("<script type='text/javascript'>alert('CADASTRO REALIZADO COM SUCESSO !'); location.href='Controle?flag=relatorioPendencia'</script>");
                }
                dao.desconectar();
            }
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
