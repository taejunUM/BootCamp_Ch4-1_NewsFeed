package com.example.ch4_1_newsfeed.repository;

import com.example.ch4_1_newsfeed.model.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PhotoRepository extends JpaRepository<Photo, Long> {

    List<Photo> findPhotoByFeedId(Long id);


    @Query("select p from Photo p where p.feed.id in :feedIds")
    List<Photo> findPhotosByFeedIds(List<Long> feedIds);
}
