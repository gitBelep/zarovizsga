package hu.nive.ujratervezes.zarovizsga.housecup;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class HouseCup{
    DataSource ds;

    public HouseCup(DataSource ds) {
        this.ds = ds;
    }

    public int getPointsOfHouse(String house){
        try(Connection conn = ds.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT points_earned FROM house_points WHERE house_name = ?")) {
            ps.setString(1, house);
            return selectByPs(ps);
        } catch (SQLException s){
            throw new IllegalStateException("Cannot connect DB", s);
        }
    }

    private int selectByPs(PreparedStatement ps) throws SQLException{
        int result = 0;
        try(ResultSet rs = ps.executeQuery()){
            while(rs.next()){
                result += rs.getInt("points_earned");
            }
        }
        return result;
    }

}
