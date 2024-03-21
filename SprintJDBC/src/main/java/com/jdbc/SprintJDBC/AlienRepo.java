package com.jdbc.SprintJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository
public class AlienRepo {
	
	private JdbcTemplate template;
	public JdbcTemplate getTemplate() {
		return template;
	}
    @Autowired

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	
	public void save(Alien alien) {
		String sql = "insert into alien (id, name, tech) values (?,?,?)";
		template.update(sql, alien.getId(), alien.getName(), alien.getTech());
		
	}
	
	public List<Alien> findAll(){
		String sql = "select * from alien";
		RowMapper<Alien> mapper = new RowMapper<Alien>() {
			
			@Override
			public Alien mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Alien a = new Alien();
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setTech(rs.getString(3));
				return a;
			}
		};
		List<Alien> aliens = template.query(sql, mapper);
		return aliens;
		
	}
	
	public void delete(int id) {
		String sql = "delete from alien where id = ?";
		template.update(sql, id);
		System.out.println("Dleted record id = "+id);
	}
	
	public void update(int id, String name) {
		String sql = "update alien set name = ? where id = ?";
		
			
		RowMapper<Alien> mapper = new RowMapper<Alien>() {

			@Override
			public Alien mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Alien alien2 = new Alien();
				alien2.setId(rs.getInt("id"));
				alien2.setName(rs.getString("name"));
				return alien2;
			}
		};
		
		template.update(sql, name, id);
		System.out.println("Record upate with id = "+id);
	}
}
