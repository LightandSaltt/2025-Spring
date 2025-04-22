package com.grepp.spring.infra.feign.client.busstop;

import com.grepp.spring.infra.feign.client.busstop.dto.BusStopDocument;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "busStop", url = "http://openapi.seoul.go.kr:8088")
public interface BusStopLocationApi {

    @GetMapping("{apiKey}/json/busStopLocationXyInfo/{startIndex}/{endIndex}")
    BusStopDocument getBusStop(
      @PathVariable
      String apiKey,
      @PathVariable
      int startIndex,
      @PathVariable
      int endIndex
    );

}
