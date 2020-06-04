package com.kyle.elasticsearchpractice.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
public class Area implements Serializable {

    private static final long serialVersionUID = -2339405122166531341L;

    @Id
    private long area_id;

    private String area_name;

    private String area_translated;


}
