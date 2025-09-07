package com.mwu.repository;

import com.mwu.entity.Stu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StuRepository  extends JpaRepository<Stu, Integer> {
    Optional<Stu> findByName(String name);

}
