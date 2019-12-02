package com.iamvickyav.EntityMappingDemo

import com.iamvickyav.EntityMappingDemo.entity.Club
import org.springframework.data.jpa.repository.JpaRepository

interface ClubDao extends JpaRepository<Club, Integer> {
}
