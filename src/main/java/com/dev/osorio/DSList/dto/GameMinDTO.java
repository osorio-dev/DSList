package com.dev.osorio.DSList.dto;

import com.dev.osorio.DSList.entities.Game;
import com.dev.osorio.DSList.projection.GameMinProjection;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }

    public GameMinDTO(GameMinProjection gameMinProjection) {
        id = gameMinProjection.getId();
        title = gameMinProjection.getTitle();
        year = gameMinProjection.getYear();
        imgUrl = gameMinProjection.getImgUrl();
        shortDescription = gameMinProjection.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
