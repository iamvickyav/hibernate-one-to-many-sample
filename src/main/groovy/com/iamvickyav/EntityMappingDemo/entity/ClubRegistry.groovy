package com.iamvickyav.EntityMappingDemo.entity

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonManagedReference

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "club_registry")
class ClubRegistry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reg_id")
    Integer regId

    @ManyToOne
    @JoinColumn(name="s_id", nullable=false)
    @JsonBackReference
    Student student

    @ManyToOne
    @JoinColumn(name="c_id", nullable=false)
    @JsonManagedReference
    Club club
}
