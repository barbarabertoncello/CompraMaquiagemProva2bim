/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.UsuarioBbd;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author ""
 */
public class UsuarioDao_bbd extends DAO_Abstract {

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
    session.beginTransaction();
    Criteria criteria = session.createCriteria(UsuarioBbd.class);
    criteria.add(Restrictions.eq("idusuarioBbd", id));
    List lista =criteria.list();
    session.getTransaction().commit();
    return lista.get(0);
        
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioBbd.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public UsuarioBbd Logar(String usuario, String senha) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioBbd.class);
        criteria.add(Restrictions.eq("apelidoBbd", usuario));
        criteria.add(Restrictions.eq("senhaBbd", senha));//sql
        List lista = criteria.list();
        session.getTransaction().commit();
        if (!lista.isEmpty()) {
            return (UsuarioBbd) lista.get(0);
        } else {
            return null; 
        }
    }
     public List listNome(String nome){
        session.beginTransaction();
    Criteria criteria = session.createCriteria(UsuarioBbd.class);
   criteria.add(Restrictions.like("nomeBbd", "%" + nome + "%"));
   List lista = criteria.list();
    session.getTransaction().commit();
   return  lista;
    }
    
    public List listApelido(String apelido){
        session.beginTransaction();
    Criteria criteria = session.createCriteria(UsuarioBbd.class);
   criteria.add(Restrictions.like("apelidoBbd", "%" + apelido + "%"));
   List lista = criteria.list();
    session.getTransaction().commit();
   return  lista;
    }
      
    public List listNomeApelido(String apelido, String nome){
        session.beginTransaction();
    Criteria criteria = session.createCriteria(UsuarioBbd.class);
          criteria.add(Restrictions.like("apelidoBbd", "%" + apelido + "%"));
   criteria.add(Restrictions.like("nomebbd", "%" + nome + "%"));
   List lista = criteria.list();
    session.getTransaction().commit();
   return  lista;
    }
}
