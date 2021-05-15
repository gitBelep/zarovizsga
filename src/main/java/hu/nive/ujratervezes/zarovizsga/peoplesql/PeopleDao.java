package hu.nive.ujratervezes.zarovizsga.peoplesql;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PeopleDao {
    private final DataSource ds;

    public PeopleDao(DataSource ds) {
        this.ds = ds;
    }

    public String findIpByName(String fName, String lName) {
        try (Connection conn = ds.getConnection();
             PreparedStatement ps = conn.prepareStatement(
             "SELECT ip_address FROM people WHERE first_name = ? AND last_name = ?"
             )) {
            ps.setString(1, fName);
            ps.setString(2, lName);
            return selectByPrepStatement(ps);
        } catch (SQLException se) {
            throw new IllegalArgumentException("Cannot connect", se);
        }
    }

    public String selectByPrepStatement(PreparedStatement ps){
        String resultIp = "";
        try(ResultSet rs = ps.executeQuery()){
            if(rs.next()){
                resultIp = rs.getString("ip_address");
            }
            return resultIp;
        } catch (SQLException se) {
            throw new IllegalArgumentException("Cannot find name", se);
        }
    }

}
