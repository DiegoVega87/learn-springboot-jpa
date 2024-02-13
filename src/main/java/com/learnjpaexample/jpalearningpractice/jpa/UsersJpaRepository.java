package com.learnjpaexample.jpalearningpractice.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UsersJpaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void insert(User user){
        entityManager.merge(user);
    }

    public User findById(long id){
        return entityManager.find(User.clss, id);
    }

    public void deleteById(long id){
        User user = findById(id);
        entityManager.remove(user);
    }

}
