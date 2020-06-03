package com.file.watcher.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "path_table", schema = "public")
public class PathEntity {
    @Id
    @Column(name = "path_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long id;

    @Column(name = "path_name")
    public String pathName;

    @Column(name = "description")
    public String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Path{" +
                "id=" + id +
                ", pathName='" + pathName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
