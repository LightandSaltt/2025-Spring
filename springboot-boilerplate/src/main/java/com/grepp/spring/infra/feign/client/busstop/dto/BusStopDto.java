package com.grepp.spring.infra.feign.client.busstop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BusStopDto {

    @JsonProperty("NODE_ID") // json 받아오는 객체 이름으로 명시해주고 내가 편한 이름으로 사용
    private Long id;
    @JsonProperty("STOPS_NO")
    private String stopsNumber;
    @JsonProperty("STOPS_NM")
    private String name;
    @JsonProperty("XCRD")
    private String longitude;
    @JsonProperty("YCRD")
    private String latitude;
    @JsonProperty("STOPS_TYPE")
    private String type;

}
