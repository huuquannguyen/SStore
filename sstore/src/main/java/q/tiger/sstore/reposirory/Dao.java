package q.tiger.sstore.reposirory;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    List<T> search(T t);

    void add(T t);

    Optional<T> get (int id);

    void update(T t, int id);

    void delete(int id);
    
}
