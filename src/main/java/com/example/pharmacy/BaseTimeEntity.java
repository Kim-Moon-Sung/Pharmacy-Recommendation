package com.example.pharmacy;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // 엔티티의 공통 매핑 정보
@EntityListeners(AuditingEntityListener.class) // 해당 클래스에 auditing 기능을 포함
public abstract class BaseTimeEntity {

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;
}
