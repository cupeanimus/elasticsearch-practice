package com.kyle.elasticsearchpractice.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@ToString
@Table(name = "agoda_hotel")
public class AgodaHotel implements Serializable {

    private static final long serialVersionUID = 8459106015452510576L;

    @Id
    @Column(name = "hotel_id")
    private Long hotelId;

    @Column(name = "hotel_name")
    private String hotelName;

    @Column(name = "hotel_translated_name")
    private String hotelTranslatedName;

    @Column(name = "accommodation_type")
    private String accommodationType;

    private Double latitude;

    private Double longitude;

    @Column(name = "addressline1")
    private String addressLine1;

    @Column(name = "addressline2")
    private String addressLine2;

    private String city;

    private String country;

    @Column(name = "countryisocode")
    private String countryISOCode;

    @Column(name = "number_of_reviews")
    private Integer numberOfReviews;

    @Column(name = "rating_average")
    private Double ratingAverage;

    @Column(name = "star_rating")
    private Double starRating;



}
