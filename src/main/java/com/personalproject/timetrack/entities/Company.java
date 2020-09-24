package com.personalproject.timetrack.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@Table(name= "company")
public class Company implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "cnpj", nullable = false)
    private String cnpj;

    @Column(name = "start_Date", nullable = false)
    private Date startDate;

    @Column(name = "updated_At", nullable = false)
    private Date updatedAt;

    @ToString.Exclude
    @OneToMany (mappedBy = "company", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Employee> employees;

    @PreUpdate
    public void preUpdate(){
        updatedAt = new Date();
    }

    @PrePersist
    public void prePersist(){
        final Date currentDate = new Date();
        startDate = currentDate;
        updatedAt = currentDate;
    }
}
