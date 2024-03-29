package com.learnjpaexample.jpalearningpractice.jpa;

import com.learnjpaexample.jpalearningpractice.entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class UsersJpaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void insert(User user){
        entityManager.merge(user);
    }

    public User findById(long id){
        return entityManager.find(User.class, id);
    }

    public void deleteById(long id){
        User user = findById(id);
        entityManager.remove(user);
    }

    public List<User> findAll(){
        return entityManager.createQuery("select u from users u", User.class).getResultList();
    }

}
