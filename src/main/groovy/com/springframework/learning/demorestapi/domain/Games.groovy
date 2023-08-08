package com.springframework.learning.demorestapi.domain

import org.springframework.stereotype.Component

@Component
class Games {

    private Integer id
    private String name
    private String type
    private String developer

    Games() {

    }

    Games(Integer id, String name, String type, String developer) {
        this.id = id
        this.name = name
        this.type = type
        this.developer = developer
    }

    Integer getId() {
        return id
    }

    void setId(Integer id) {
        this.id = id
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    String getType() {
        return type
    }

    void setType(String type) {
        this.type = type
    }

        String getDeveloper() {
            return developer
        }

        void setDeveloper(String developer) {
            this.developer = developer
        }

    @Override
    String toString() {
        return "Games{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", developer='" + developer + '\'' +
                '}';
    }
}
