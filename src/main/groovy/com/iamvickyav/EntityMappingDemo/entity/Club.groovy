package com.iamvickyav.EntityMappingDemo.entity

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonManagedReference

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "club")
class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_id")
    Integer cId

    @Column(name = "c_name")
    String cName

    @OneToMany(mappedBy="club")
    @JsonBackReference
    Set<ClubRegistry> studRegistry
}
