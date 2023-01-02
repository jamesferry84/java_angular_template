package com.jrferry.javaangularsandbox.repository;

import com.jrferry.javaangularsandbox.entities.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<AppUser, Long> {}
