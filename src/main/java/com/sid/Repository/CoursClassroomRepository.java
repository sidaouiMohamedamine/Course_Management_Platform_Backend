package com.sid.Repository;

import com.sid.Entity.Specialite;
import com.sid.Entity.CoursClassroom;
import com.sid.Entity.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursClassroomRepository extends JpaRepository<CoursClassroom,Integer> {


}
