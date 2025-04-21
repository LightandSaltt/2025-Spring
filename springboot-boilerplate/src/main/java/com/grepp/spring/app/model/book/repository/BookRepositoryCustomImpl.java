package com.grepp.spring.app.model.book.repository;

import com.grepp.spring.app.model.book.entity.Book;
import com.grepp.spring.app.model.book.entity.QBook;
import com.querydsl.jpa.impl.JPAQueryFactory;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

@Slf4j
@RequiredArgsConstructor
public class BookRepositoryCustomImpl implements BookRepositoryCustom{

    private final JPAQueryFactory queryFactory;
    private final QBook book = QBook.book;

    @Override
    public Page<Book> findPaged(Pageable pageable) {

        List<Book> content = queryFactory
            .select(book)
            .from(book)
            .leftJoin(book.images)
            .where(book.activated)
            .orderBy(book.id.desc())
            .fetch();
        return null;
    }
}
