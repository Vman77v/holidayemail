package com.email.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.email.model.History;

public interface HistoryRepository extends JpaRepository<History, Long> {

}
