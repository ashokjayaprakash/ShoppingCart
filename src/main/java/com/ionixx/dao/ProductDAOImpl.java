package com.ionixx.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ionixx.pojo.Product;
@Repository("ProductDAO")
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	SessionFactory sessionFactroy;
	
	public void addProduct(Product product) {
			sessionFactroy.getCurrentSession().save(product);
				 
	}

	@SuppressWarnings("unchecked")
	public List<Product> listProduct() {		
		Session session = sessionFactroy.getCurrentSession();
		return session.createQuery("from Product").list();
	}

	public Product selectProduct(Integer id) {
		Session session = sessionFactroy.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Product> products =  session.createQuery("from Product where id = :id").setParameter("id", id).list() ;
		return products.size() > 0 ? (Product)products.get(0): null ;
	}
	
	
	

}
