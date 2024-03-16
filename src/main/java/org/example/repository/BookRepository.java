package org.example.repository;

import org.example.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface BookRepository extends CrudRepository<BookEntity,Long> {
}
