package com.kyle.elasticsearchpractice.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class Country implements Serializable {


    private static final long serialVersionUID = 7254399919639800796L;
    @Id
    private Long country_id;

    private String country_name;

    private String country_translated;
    

}
