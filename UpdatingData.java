package sample.check;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class UpdatingData {
	public static String main(String[] args) {
		MysqlDataSource dataSource = new MysqlDataSource();
		JdbcTemplate jdbcTemplate = null;
		try {
			dataSource.setURL("DataBase URL");
			dataSource.setUser("USERNAME");
			dataSource.setPassword("PASSWORD");
			jdbcTemplate = new JdbcTemplate(dataSource);
			try {
				jdbcTemplate.update("update client set clientName='DRDO' where deviceId = ?;", new Object[] { 12 });
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Success";
	}
}