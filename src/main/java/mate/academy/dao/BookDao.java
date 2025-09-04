package mate.academy.dao;

import java.util.List;
import java.util.Optional;
import mate.academy.model.Book;

public interface BookDao {

    Book create(Book book);

    Book update(Book book);

    boolean deleteById(Long id);

    Optional<Book> findById(Long id);

    List<Book> findAll();
}
