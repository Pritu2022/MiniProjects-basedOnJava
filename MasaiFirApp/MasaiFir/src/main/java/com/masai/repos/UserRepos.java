package com.masai.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.models.User;

public interface UserRepos extends JpaRepository<User, Integer>{

}
