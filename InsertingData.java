package sample.check;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class InsertingData {
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
				jdbcTemplate.update("insert into client(clientName,data,deviceMacId,deviceName) values (?,?,?,?)",
						new Object[] { "Mechanical", "Making of spare parts", "648932bjkdgds", "Bearings" });
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clientName;
	}
}