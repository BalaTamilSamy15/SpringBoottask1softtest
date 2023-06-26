package com.studentmarksheet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.studentmarksheet.entity.MarkSheet;



public interface MarkRepo extends JpaRepository<MarkSheet, Integer> {
@Query(value="SELECT sem1total+sem2total FROM test_db.mark_sheet;",nativeQuery=true)
public List<Integer> getTotal();
}
