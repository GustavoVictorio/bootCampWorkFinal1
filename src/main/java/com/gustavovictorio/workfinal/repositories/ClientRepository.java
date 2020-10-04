package com.gustavovictorio.workfinal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavovictorio.workfinal.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
