package cn.sau.sauoh.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorListMapper {
    List<DoctorListMapper> selectAll();
}
