package com.example.restaurant.naver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchLocalReq {

    private String query = ""; //검색 원하는 문자열

    private int display = 1; //출력 건수 조절

    private int start = 1; //검색 시작 위치로 1만 가능

    private String sort = "random"; //정렬 옵션(random은 유사도 순, comment는 카페 블로그 리뷰 개수 순)

    public MultiValueMap<String, String> toMultValueMap() {
        var map = new LinkedMultiValueMap<String, String>();

        map.add("query", query);
        map.add("display", String.valueOf(display));
        map.add("start", String.valueOf(start));
        map.add("sort", sort);

        return map;
    }
}
