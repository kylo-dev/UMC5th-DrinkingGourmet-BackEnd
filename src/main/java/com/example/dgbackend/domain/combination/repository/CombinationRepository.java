package com.example.dgbackend.domain.combination.repository;

import com.example.dgbackend.domain.combination.Combination;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CombinationRepository extends JpaRepository<Combination, Long> {

    Page<Combination> findCombinationsByLikeCountGreaterThanEqualAndStateIsTrueOrderByCreatedAtDesc(
        Long likeCount, PageRequest pageRequest);

    Page<Combination> findCombinationsByTitleContaining(String keyword, PageRequest pageRequest);

    Page<Combination> findCombinationsByTitleContainingAndLikeCountGreaterThanEqualAndStateIsTrueOrderByCreatedAtDesc(
        String keyword, PageRequest pageRequest, Long likeCount);


}
