package com.hanghae.be_h010gram.domain.post.repository;

import com.hanghae.be_h010gram.domain.post.dto.MainPostResponseDto;
import com.hanghae.be_h010gram.domain.post.entity.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    @Query(value = "select new com.hanghae.be_h010gram.domain.post.dto.MainPostResponseDto(p) from Post p where p.id < ?1 order by p.id desc")
    Slice<MainPostResponseDto> findByPostIdLessThanOrderByPostIdDesc(Long lastPostId, PageRequest pageRequest);
}
