//package com.hanghae.be_h010gram.domain.post.entity;
//
//import com.hanghae.be_h010gram.domain.member.entity.Member;
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//@Getter
//@Entity
//@NoArgsConstructor
//public class PostLike {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(nullable = false)
//    private Member member;
//
//    @ManyToOne
//    @JoinColumn(name = "post_id", nullable = false)
//    private Post post;
//
//    public PostLike(Post post, Member member) {
//        this.post = post;
//        this.member = member;
//    }
//
//}
