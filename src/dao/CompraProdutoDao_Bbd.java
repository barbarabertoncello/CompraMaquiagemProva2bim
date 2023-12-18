/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.CompraProdutoBbd;
import java.util.List;
import org.hibernate.Criteria;
import bean.CompraBbd;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author ""
 */
public class CompraProdutoDao_Bbd extends DAO_Abstract {
    
    
     public List ListProdutos(CompraBbd compraBbd){
    session.beginTransaction();
    Criteria criteria = session.createCriteria(CompraProdutoBbd.class);
    criteria.add( Restrictions.eq("compraBbd", compraBbd));
    List lista = criteria.list();
    session.getTransaction().commit();
    return lista;
    }

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }
    public void apagarCompra(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();

        if (object instanceof CompraBbd) {
            CompraBbd compra = (CompraBbd) object;

            Criteria criteria = session.createCriteria(CompraProdutoBbd.class);
            criteria.add(Restrictions.eq("compraBbd.idcompraBbd", compra.getIdcompraBbd()));

            List lista = criteria.list();
            for (Object produto : lista) {
                session.delete(produto);
            }
            session.getTransaction().commit();
        }
    }

    @Override
    public Object list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(CompraProdutoBbd.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
}
