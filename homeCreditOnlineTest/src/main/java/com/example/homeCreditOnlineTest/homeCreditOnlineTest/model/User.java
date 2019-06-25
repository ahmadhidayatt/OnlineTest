package com.example.homeCreditOnlineTest.homeCreditOnlineTest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "table_user")
public class User {
    @Id
    @Column(name = "user_id", unique = true, length = 100
    )
    private String id;
    @Column(name = "user_name", length = 100
    )
    private String name;
    @Column(name = "address", length = 100
    )
    private String address;
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Role> role;



}
