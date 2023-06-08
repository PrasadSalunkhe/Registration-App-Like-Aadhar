package com.ssnapp.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class AutoSSNGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prefix = "45678";
		String suffix = "";
		try {
			Connection connection = session.connection();
			Statement stmt = connection.createStatement();
			String sql = "select ssn_seq.nextval from ssn_sql";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				int seqval = rs.getInt(1);
				suffix = String.valueOf(seqval);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prefix + suffix;
	}

}
