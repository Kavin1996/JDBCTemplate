package sample.check;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class App {
	public static String main(String[] args) {
		MysqlDataSource dataSource = new MysqlDataSource();
		JdbcTemplate jdbcTemplate = null;
		String clientName = null;
		try {
			dataSource.setURL("DataBase URL");
			dataSource.setUser("USERNAME");
			dataSource.setPassword("PASSWORD");
			jdbcTemplate = new JdbcTemplate(dataSource);
			try {
				clientName = jdbcTemplate.queryForObject("select client name from client where id=2", String.class);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clientName;
	}
}