package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;

// 各Entityクラスの親クラス。各テーブルの共通カラムを親クラスとして一括で定義
@Data
@MappedSuperclass
class AbstractEntity {
	@Column
	private Date modifiedAt;

	@Column(updatable = false)
	private Date createdAt;

	@PrePersist
	public void onPrePersist() {
		setModifiedAt(new Date());
		setCreatedAt(new Date());
	}

	@PreUpdate
	public void onPreUpdate() {
		setModifiedAt(new Date());
	}
}
