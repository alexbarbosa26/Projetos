package com.neobpodho.relatorio;

import com.neobpodho.model.CandidatoFiltro;
import com.neobpodho.model.TbCandidatos;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class RelatorioFiltrado implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Inject
    private EntityManager manager;
    
    public List<TbCandidatos> filtrados(CandidatoFiltro filtro) {

        Session sessao = manager.unwrap(org.hibernate.Session.class);        
        Criteria criteria = sessao.createCriteria(TbCandidatos.class);

        if(StringUtils.isNotBlank(filtro.getCidade())){
        criteria.add(Restrictions.ilike("cidade", filtro.getCidade(), MatchMode.ANYWHERE));
        }
        if(StringUtils.isNotBlank(filtro.getBairro())){
        criteria.add(Restrictions.ilike("bairro", filtro.getBairro(), MatchMode.ANYWHERE));
        }
        if(StringUtils.isNotBlank(filtro.getDisponivel())){
        criteria.add(Restrictions.ilike("horarioDisposnivel", filtro.getDisponivel(), MatchMode.ANYWHERE));
        }
        if(filtro.getDataInicio()!= null){
        criteria.add(Restrictions.ge("dataCadastroCand", filtro.getDataInicio()));
        }
        if(filtro.getDataFim()!= null){
        criteria.add(Restrictions.le("dataCadastroCand", filtro.getDataFim()));
        }
        return criteria.addOrder(Order.asc("cidade")).list();
    }

}
