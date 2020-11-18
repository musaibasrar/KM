/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.currentIssue.dao;

import com.model.currentIssue.dto.CurrentIssue;
import com.model.personal.dto.PersonalDetails;
import com.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Musaib
 */
public class CurrentIssueDAO {

     Session session = null;
    /** * Hibernate Session Variable */
    Transaction transaction = null;
    /** * Hibernate Transaction Variable */
    Transaction transaction1;
    SessionFactory sessionFactory;
    
    public CurrentIssueDAO() {
        session = HibernateUtil.openSession();
    }

    public CurrentIssue delete(CurrentIssue currentIssue) {
        
        try {
            //this.session = sessionFactory.openCurrentSession();
            transaction = session.beginTransaction();
            session.update(currentIssue);
            transaction.commit();
            
        } catch (HibernateException hibernateException) {
            transaction.rollback();
            hibernateException.printStackTrace();
        } finally {
            //session.close();
            return currentIssue;
        }
        
         
    }
    
    
    public CurrentIssue createIssue(CurrentIssue currentIssue){
        try {
            //this.session = sessionFactory.openCurrentSession();
            transaction = session.beginTransaction();
            session.update(currentIssue);


            transaction.commit();
            
        } catch (HibernateException hibernateException) {
            transaction.rollback();
            hibernateException.printStackTrace();
        } finally {
            //session.close();
            return currentIssue;
        }
    }

    public CurrentIssue getCurrentIssue() {
         CurrentIssue currentIssue = new CurrentIssue();
        try {
            
            transaction = session.beginTransaction();
            int pid=1;
            Query query = session.createQuery("From CurrentIssue as currentIssue where currentIssue.pci=" + pid);
            currentIssue = (CurrentIssue) query.uniqueResult();
            transaction.commit();
            }
        catch (HibernateException hibernateException) {
            transaction.rollback();
            hibernateException.printStackTrace();
        }
        //session.close();
        return currentIssue;
    }
    
}
