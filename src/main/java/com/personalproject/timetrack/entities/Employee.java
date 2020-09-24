package com.personalproject.timetrack.entities;

import com.personalproject.timetrack.enums.ProfileEnum;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.DataInput;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@Table(name = "employee")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String cpf;

    @Column(name = "cash_per_hour", nullable = true)
    private BigDecimal cashPerHour;

    @Column(name = "worked_hours", nullable = true)
    private Float workedHours;

    @Column(name = "lunch_time", nullable = false)
    private Float lunchTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "profile", nullable = false)
    private ProfileEnum profileEnum;

    @Column
    private Date creationAt;

    @Column
    private Date updatedAt;

    @ManyToOne(fetch = FetchType.EAGER)
    private Company company;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Entry> entries;

}
