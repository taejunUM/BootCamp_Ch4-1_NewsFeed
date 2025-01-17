package com.example.ch4_1_newsfeed.repository;


import com.example.ch4_1_newsfeed.model.entity.Relationship;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RelationshipRepository extends JpaRepository<Relationship, Long> {

    Optional<Relationship> findRelationshipByFollowerIdAndFolloweeId(Long followerId, Long followeeId);

}
