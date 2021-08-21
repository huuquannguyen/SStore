package q.tiger.sstore.reposirory;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import q.tiger.sstore.model.Account;

@Repository
public class AccountRepo implements Dao<Account> {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    RowMapper<Account> rowMapper = (rs, rowNum) -> {
        Account acc = new Account();
        acc.setPassword(rs.getString("password"));
        acc.setUserId(rs.getInt("userId"));
        acc.setUsername(rs.getString("username"));
        return acc;
    };

    @Override
    public List<Account> search(Account account) {
        String sql = "SELECT * from account WHERE username = ('" + account.getUsername() + "')and password = ('"
                + account.getPassword() + "')";
        System.out.println(sql);
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public void add(Account t) {
        // TODO Auto-generated method stub

    }

    @Override
    public Optional<Account> get(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void update(Account t, int id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub

    }
}
