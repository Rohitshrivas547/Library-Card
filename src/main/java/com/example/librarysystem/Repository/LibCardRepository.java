package com.example.librarysystem.Repository;

import com.example.librarysystem.LibCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibCardRepository extends JpaRepository<LibCard,Integer> {
}
