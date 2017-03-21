package neobpodho.com.relatorio;

import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import neobpodho.com.model.CandidatoFiltro;
import neobpodho.com.model.TbCandidatos;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class RelatorioFiltrado implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Inject
    private EntityManager manager;
    
    @SuppressWarnings("unchecked")
    public List<TbCandidatos> filtrados(CandidatoFiltro filtro) {

        Session sessao = manager.unwrap(Session.class);        
        Criteria criteria = sessao.createCriteria(TbCandidatos.class);

        if(StringUtils.isNotBlank(filtro.getCidade())){
        criteria.add(Restrictions.ilike("cidade", filtro.getCidade()));

        }
        return criteria.addOrder(Order.asc("cidade")).list();
    }

}
