package hu.nive.ujratervezes.zarovizsga.peoplesql;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;
import java.sql.SQLException;
import static org.junit.jupiter.api.Assertions.*;

class PeopleDaoTest {

    private PeopleDao peopleDao;
    private PeopleDaoJdbc peopleDaoJDBC;

    @BeforeEach
    void init() throws SQLException {
        MariaDbDataSource dataSource;
        dataSource = new MariaDbDataSource();
        dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
        dataSource.setUser("employees");
        dataSource.setPassword("employees");

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();

        flyway.clean();
        flyway.migrate();

        peopleDao = new PeopleDao(dataSource);
        peopleDaoJDBC = new PeopleDaoJdbc(dataSource);
    }


    @Test
    void findIpByName() {
        assertEquals("134.135.61.66", peopleDao.findIpByName("Brina", "Snibson"));
        assertEquals("97.203.249.128", peopleDao.findIpByName("Torrence", "Porteous"));
    }

    @Test
    void findIpByName_Jdbc() {
        assertEquals("134.135.61.66", peopleDaoJDBC.findIpByName("Brina", "Snibson"));
        assertEquals("97.203.249.128", peopleDaoJDBC.findIpByName("Torrence", "Porteous"));
    }

    @Test
    void testInsertPeople(){
        peopleDaoJDBC.insertPeople(1001L,"Sámuel", "Aba","as@gmail.com","eldönti","222.22.22.222");

        assertEquals("222.22.22.222", peopleDaoJDBC.findIpByName("Sámuel", "Aba"));
    }

}
