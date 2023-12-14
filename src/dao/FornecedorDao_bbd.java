/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.FornecedorBbd;
import bean.ProdutoBbd;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author ""
 */
public class FornecedorDao_bbd extends DAO_Abstract {

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

    @Override
    public Object list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FornecedorBbd.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
 public Object listNome(String nome) {
        session.beginTransaction(); 
        Criteria criteria = session.createCriteria(ProdutoBbd.class); 
        criteria.add(Restrictions.like("nome", "%" + nome + "%")); 
        List lista = criteria.list(); 
        session.getTransaction().commit(); 
        return lista;  

    }

    public Object listValor(double valor) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoBbd.class);
        criteria.add(Restrictions.lt("valor", valor)); 
        List lista = criteria.list(); 
        session.getTransaction().commit();
        return lista; 

    }

    public Object listNomeValor(String nome, double valor) {
        session.beginTransaction(); 
        Criteria criteria = session.createCriteria(ProdutoBbd.class); 
        criteria.add(Restrictions.like("nome", "%" + nome + "%")); 
        criteria.add(Restrictions.lt("valor", valor)); 
       
        List lista = criteria.list(); 
        session.getTransaction().commit();
        return lista; 

    }
}
