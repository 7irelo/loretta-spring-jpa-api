//package com.flourite.dao.impl;
//
//import com.flourite.dao.AuthorDao;
//import com.flourite.dao.TestDataUtil;
//import com.flourite.domain.Author;
//import com.flourite.domain.Book;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.DirtiesContext;
//
//import java.util.List;
//import java.util.Optional;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@SpringBootTest
//@ExtendWith(MockitoExtension.class)
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
//public class BookDaoImplIntegrationTests {
//
//    private AuthorDao authorDao;
//    private BookDaoImpl underTest;
//
//    @Autowired
//    public BookDaoImplIntegrationTests(BookDaoImpl underTest, AuthorDao authorDao) {
//        this.underTest = underTest;
//        this.authorDao = authorDao;
//    }
//
//    @Test
//    public void testThatBookCanBeCreatedAndRecalled() {
//        Author author = TestDataUtil.createAuthorTestA();
//        authorDao.create(author);
//
//        Book book = TestDataUtil.createTestBookA();
//        book.setAuthorId(author.getId());
//        underTest.create(book);
//        Optional<Book> result = underTest.findOne(book.getIsbn());
//        assertThat(result).isPresent();
//        assertThat(result.get()).isEqualTo(book);
//    }
//
//    @Test
//    public void testThatMultipleBooksCanBeCreatedAndRecalled() {
//        Author author = TestDataUtil.createAuthorTestA();
//        authorDao.create(author);
//
//        Book bookA = TestDataUtil.createTestBookA();
//        bookA.setAuthorId(author.getId());
//        underTest.create(bookA);
//
//        Book bookB = TestDataUtil.createTestBookB();
//        bookB.setAuthorId(author.getId());
//        underTest.create(bookB);
//
//        Book bookC = TestDataUtil.createTestBookC();
//        bookC.setAuthorId(author.getId());
//        underTest.create(bookC);
//
//        List<Book> result = underTest.find();
//        assertThat(result).hasSize(3).containsExactly(bookA, bookB, bookC);
//    }
//
//    @Test
//    public void testThatBookCanBeUpdated() {
//        Author author = TestDataUtil.createAuthorTestA();
//        authorDao.create(author);
//
//        Book book = TestDataUtil.createTestBookA();
//        book.setAuthorId(author.getId());
//        underTest.create(book);
//
//        book.setTitle("updated");
//        underTest.update(book.getIsbn(), book);
//
//        Optional<Book> result = underTest.findOne(book.getIsbn());
//        assertThat(result).isPresent();
//        assertThat(result.get()).isEqualTo(book);
//    }
//
//    @Test
//    public void testThatBookCanBeDelete() {
//        Author author = TestDataUtil.createAuthorTestA();
//        authorDao.create(author);
//
//        Book book = TestDataUtil.createTestBookA();
//        book.setAuthorId(author.getId());
//        underTest.create(book);
//
//        underTest.delete(book.getIsbn());
//        Optional<Book> result = underTest.findOne(book.getIsbn());
//        assertThat(result).isEmpty();
//    }
//}
