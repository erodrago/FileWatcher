package com.file.watcher.demo.repository;

import com.file.watcher.demo.entity.PathEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PathRepository extends JpaRepository<PathEntity, Long> {
}
