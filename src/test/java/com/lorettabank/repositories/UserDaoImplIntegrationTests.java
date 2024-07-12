//package com.lorettabank.repositories;
//
//import com.flourite.dao.TestDataUtil;
//import com.flourite.domain.Author;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.DirtiesContext;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import java.util.List;
//import java.util.Optional;
//
//@SpringBootTest
//@ExtendWith(MockitoExtension.class)
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
//public class AuthorDaoImplIntegrationTests {
//
//    private AuthorDaoImp underTest;
//
//    @Autowired
//    public AuthorDaoImplIntegrationTests(AuthorDaoImp underTest) {
//        this.underTest = underTest;
//    }
//    @Test
//    public void testThatAuthorCanBeCreatedAndRecalled() {
//
//        Author author = TestDataUtil.createAuthorTestA();
//        underTest.create(author);
//        Optional<Author> result = underTest.findOne(author.getId());
//        assertThat(result).isPresent();
//        assertThat(result.get()).isEqualTo(author);
//    }
//
//    @Test
//    public void testThatMultipleAuthorsCanBeCreatedAndRecalled() {
//        Author authorA = TestDataUtil.createAuthorTestA();
//        underTest.create(authorA);
//        Author authorB = TestDataUtil.createAuthorTestB();
//        underTest.create(authorB);
//        Author authorC = TestDataUtil.createAuthorTestC();
//
//        underTest.create(authorC);
//        List<Author> result = underTest.find();
//        assertThat(result).hasSize(3).containsExactly(authorA, authorB, authorC);
//    }
//
//    @Test
//    public void testThatAuthorCanBeUpdated() {
//        Author author = TestDataUtil.createAuthorTestA();
//        underTest.create(author);
//        author.setName("Updated");
//        underTest.update(author.getId(), author);
//        Optional<Author> result = underTest.findOne(author.getId());
//        assertThat(result).isPresent();
//        assertThat(result.get()).isEqualTo(author);
//    }
//
//    @Test
//    public void testThatAuthorCanBeDeleted() {
//        Author author = TestDataUtil.createAuthorTestA();
//        underTest.create(author);
//        underTest.delete(author.getId());
//        Optional<Author> result = underTest.findOne(author.getId());
//        assertThat(result).isEmpty();
//    }
//}
