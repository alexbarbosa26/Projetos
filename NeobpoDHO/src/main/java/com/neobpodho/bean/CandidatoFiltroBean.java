package com.neobpodho.bean;

import com.neobpodho.model.CandidatoFiltro;
import com.neobpodho.model.TbCandidatos;
import com.neobpodho.relatorio.RelatorioFiltrado;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;

@Named
@ViewScoped
public class CandidatoFiltroBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Inject
    private RelatorioFiltrado candidatos;

    private final CandidatoFiltro filtro;    
    private List<TbCandidatos> candidatosFiltrados;

    public CandidatoFiltroBean() {
        filtro = new CandidatoFiltro();
    }

    public void pesquisar() {
        candidatosFiltrados = candidatos.filtrados(filtro);

    }
    
    public void posProcessarXls(Object documento) {
		HSSFWorkbook planilha = (HSSFWorkbook) documento;
		HSSFSheet folha = planilha.getSheetAt(0);
		HSSFRow cabecalho = folha.getRow(0);
		HSSFCellStyle estiloCelula = planilha.createCellStyle();
		Font fonteCabecalho = planilha.createFont();
		
		fonteCabecalho.setColor(IndexedColors.WHITE.getIndex());
		fonteCabecalho.setBold(true);
		fonteCabecalho.setFontHeightInPoints((short) 16);
		
		estiloCelula.setFont(fonteCabecalho);
		estiloCelula.setFillForegroundColor(IndexedColors.AQUA.getIndex());
		estiloCelula.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		
		for (int i = 0; i < cabecalho.getPhysicalNumberOfCells(); i++) {
			cabecalho.getCell(i).setCellStyle(estiloCelula);
		}
	}

    public List<TbCandidatos> getCandidatosFiltrados() {
        return candidatosFiltrados;
    }

    public RelatorioFiltrado getCandidatos() {
        return candidatos;
    }

    public CandidatoFiltro getFiltro() {
        return filtro;
    }

}
