package test;

import repository.AuthorRepository;

public class main {
    public static void main(String[] args) {
        AuthorRepository authorRepository = new AuthorRepository();
        authorRepository.close();
    }
}
