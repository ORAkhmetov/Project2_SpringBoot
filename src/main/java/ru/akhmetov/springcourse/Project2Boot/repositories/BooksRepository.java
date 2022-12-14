package ru.akhmetov.springcourse.Project2Boot.repositories;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.akhmetov.springcourse.Project2Boot.models.Book;


import java.util.List;

/**
 * @author Oleg Akhmetov on 24.11.2022
 */
@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {
    List<Book> findByTitleStartingWith(String title);
    Page<Book> findAll(Pageable var1);
}
