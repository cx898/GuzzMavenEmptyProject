package com.hqhp.maven.dao;

import java.util.List;

import org.guzz.dao.GuzzBaseDao;
import org.guzz.orm.sql.CompiledSQL;
import org.guzz.transaction.ReadonlyTranSession;
import org.guzz.transaction.TransactionManager;
import org.guzz.transaction.WriteTranSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hqhp.maven.model.User;

@Repository("userDao")
public class UserDao {
	@Autowired
	private GuzzBaseDao guzzDao;

	@SuppressWarnings("unchecked")
	public List<User> selectUsers() {
		List<User> users = null;
		TransactionManager tm = guzzDao.getTransactionManager();
		String sql = "select * from @@" + User.class.getName();
		CompiledSQL cs = tm.getCompiledSQLBuilder().buildCompiledSQL(User.class, sql);
		ReadonlyTranSession session = tm.openDelayReadTran();
		try {
			users = session.list(cs.bindNoParams());
		} finally {
			session.close();
		}
		return users;
	}
	
	
	public boolean insertUser(User u){
		TransactionManager tm = guzzDao.getTransactionManager() ;
		WriteTranSession session = tm.openRWTran(true) ;
		try{
		        return session.insert(u)==null?false:true;
		}finally{
		        session.close() ;
		}
	}
}
