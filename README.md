This project demonstrates that Hibernate still does not fully support PostgreSQL table inheritance.

PostgreSQL table inheritance is not natively supported by Hibernate. Hibernate's inheritance strategies are designed to work with standard relational database features and do not directly support PostgreSQL's table inheritance.

The Execution of this project will throw this error : 

2024-05-20T15:05:28.582+02:00  WARN 9232 --- [           main] o.h.engine.jdbc.spi.SqlExceptionHelper   : SQL Error: 0, SQLState: 23502
2024-05-20T15:05:28.582+02:00 ERROR 9232 --- [           main] o.h.engine.jdbc.spi.SqlExceptionHelper   : ERROR: null value in column "name_product" of relation "books" violates not-null constraint
  Détail : Failing row contains (1, null, null, none, 1234).
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 7.290 s <<< FAILURE! -- in com.simplifyforme.tableinheritancepostgresql.repositories.BookRepositoryTest
[ERROR] com.simplifyforme.tableinheritancepostgresql.repositories.BookRepositoryTest.testSaveBook -- Time elapsed: 0.821 s <<< ERROR!
org.springframework.dao.DataIntegrityViolationException: 
could not execute statement [ERROR: null value in column "name_product" of relation "books" violates not-null constraint
  Détail : Failing row contains (1, null, null, none, 1234).] [insert into books (author,isbn,id) values (?,?,?)]; SQL [insert into books (author,isbn,id) values (?,?,?)]; constraint [name_product" of relation "books]
