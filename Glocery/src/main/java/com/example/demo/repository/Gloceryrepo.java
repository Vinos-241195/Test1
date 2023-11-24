package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Management;
@Repository
public interface Gloceryrepo extends JpaRepository<Management,Integer> {

}
