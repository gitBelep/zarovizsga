package hu.nive.ujratervezes.zarovizsga.dogtypes;

import org.mariadb.jdbc.MariaDbDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DogTypes {
    private final MariaDbDataSource ds;

    public DogTypes(MariaDbDataSource ds) {
        this.ds = ds;
    }

    public List<String> getDogsByCountry(String orszag){
        try(Connection conn = ds.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT `name` FROM `dog_types` WHERE `country` = ?;")
        ) {
            ps.setString(1, orszag);
            return new ArrayList<>(getNamesByPreparedStatement(ps));
        } catch (SQLException se) {
            throw new IllegalArgumentException("Cannot connect", se);
        }
    }

    private Set<String> getNamesByPreparedStatement(PreparedStatement ps){
        Set<String> names = new TreeSet<>();
        String actual;
        try (ResultSet rs = ps.executeQuery()){
            while (rs.next()){
                actual = rs.getString("name");
                names.add(actual.toLowerCase());
            }
        } catch (SQLException se) {
            throw new IllegalArgumentException("Wrong statement", se);
        }
        return names;
    }

}
