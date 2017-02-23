package com.scope.banking.implementations;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.scope.banking.entities.Customer;
import com.scope.banking.interfaces.CustomerDao;
import com.scope.banking.utilities.CustomerRowMapper;

public class CustomerDaoImpl implements CustomerDao {

	
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("insert into customer_tbl (id,name,dob,address) values(?,?,?,?)",customer.getCustomerId(),customer.getName(),customer.getDob(),customer.getAddress());
	}

	@Override
	public List<Customer> getAllCustomer() {
		return jdbcTemplate.query("select * from customer_tbl",new CustomerRowMapper());
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer getCustomerById(int id) {
		Customer customer=(Customer)jdbcTemplate.queryForObject("select * from customer_tbl where id =?", new Object[] {id}, new CustomerRowMapper());
		return customer;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertBatch(List<Customer> customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub

	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate= new JdbcTemplate(dataSource);
	}

	

}
