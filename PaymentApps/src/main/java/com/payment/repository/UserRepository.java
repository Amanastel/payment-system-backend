package com.payment.repository;

import com.payment.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    public Optional<Users> findByEmail(String email);

    public List<Users> findAllByRole(String role);
}
