package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import domain.User;

public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public User saveUser(User user) {
		return (User) this.hibernateTemplate.save(user);
	}

}
