package com.scope.banking.utilities;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.scope.banking.entities.Customer;

public class CustomerRowMapper implements RowMapper{

	@Override
	public Object mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		customer.setCustomerId(arg0.getInt(1));
		customer.setName(arg0.getString(2));
		customer.setDob(arg0.getDate(3));
		customer.setAddress(arg0.getString(4));
		return customer;
	}

}
