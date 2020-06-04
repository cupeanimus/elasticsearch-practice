package com.kyle.elasticsearchpractice.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
public class City implements Serializable {
    private static final long serialVersionUID = -5057659776018573424L;

    @Id
    private Long city_id;

    private String city_name;

    private String city_translated;


}
