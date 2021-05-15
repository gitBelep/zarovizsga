package hu.nive.ujratervezes.zarovizsga.peoplesql;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PeopleDaoJdbc {
    private JdbcTemplate jdbcTemp;

    public PeopleDaoJdbc(DataSource ds) {
        this.jdbcTemp = new JdbcTemplate(ds);
    }

    public String findIpByName(String fName, String lName){
        String result = jdbcTemp.query(
                "SELECT ip_address FROM people WHERE first_name = ? AND last_name = ?",
                    new Object[]{fName, lName},
                    (rs, i) -> rs.getString("ip_address")).toString();
        result = result.substring(1,result.length()-1);
        return result;
    }

    public void insertPeople(long id, String fName, String lName, String email, String gender, String ip){
        jdbcTemp.update("INSERT INTO people (first_name, last_name, email, gender, ip_address, id) VALUES (?, ?, ?, ?, ?, ?);",
                fName, lName, email, gender, ip, id);
    }

//NEM auto increment!
//    public long saveAndReturnId(String fName, String lName, String email, String gender, String ip){
//        KeyHolder kh = new GeneratedKeyHolder();
//        jdbcTemp.update(connection -> {
//            PreparedStatement ps = connection.prepareStatement(
//                    "INSERT INTO people (first_name, last_name, email, gender, ip_address) VALUES (?, ?, ?, ?, ?);",
//                    Statement.RETURN_GENERATED_KEYS);
//            ps.setString(1, fName);
//            ps.setString(2, lName);
//            ps.setString(3, email);
//            ps.setString(4, gender);
//            ps.setString(5, ip);
//            return ps;
//        }, kh );
//        return kh.getKey().longValue();
//    }

}
