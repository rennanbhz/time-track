package com.personalproject.timetrack.repository;

import com.personalproject.timetrack.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository <Company, Long> {

    Company findByCnpj(String cnpj);


}
